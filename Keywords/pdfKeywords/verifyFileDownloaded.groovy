package pdfKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUIdef
import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import org.testng.Assert

public class verifyFileDownloaded {

	@Keyword
	//This keyword will verify and delete the downloaded file. IF this fails it will continue, it will also verify if the file was found or not and name in the log viewer
	def boolean checkFileDownloaded(String downloadPath, String fileName) {

		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		String lastAttempt = '';
		boolean flag = false;

		if (dirContents.length > 0) {
			for (int i = 0; i < dirContents.length; i++) {
				if (dirContents[i].getName().equals(fileName)) {
					KeywordUtil.markPassed(fileName + ' exist in ' + downloadPath)
					try {
						String[] overdueStr = [
							"Php48,004.02",
							"9849",
							"EDZEL",
							"YORDAN",
							"VELASCO",
							"FORTY-EIGHT THOUSAND FOUR Pesos and TWO Cents"
						];
						String pdfContent = getPdfContent("file://" + downloadPath + fileName);
						flag = containsWords(pdfContent, overdueStr);
					} catch (IOException e) {
						e.printStackTrace();
					}
					// File has been checked, it can now be deleted:
					dirContents[i].delete();
					return flag;
				}
				lastAttempt = dirContents[i].getName().equals(fileName);
			}
			if (lastAttempt != fileName) {
				KeywordUtil.markFailed(fileName + ' does not exist in ' + downloadPath)
				return flag;
			}
		}
		return flag;
	}

	@Keyword
	def static String getPdfContent(String url) throws IOException {
		URL pdfURL = new URL(url);
		InputStream is = pdfURL.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		PDDocument doc = PDDocument.load(bis);
		PDFTextStripper strip = new PDFTextStripper();
		String stripText = strip.getText(doc);
		doc.close();
		return stripText;
	}

	@Keyword
	def static boolean containsWords(String inputString, String[] items) {
		boolean found = true;
		for (String item : items) {
			if (!inputString.contains(item)) {
				System.out.println("Does not contains " + item)
				found = false;
				break;
			}
			System.out.println("Does contains " + item)
			Assert.assertTrue(found);
		}
		return found;
	}

}
