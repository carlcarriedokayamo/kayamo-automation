package genericKeywords

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
import org.testng.Assert
import internal.GlobalVariable

public class genericKeywords {

	@Keyword
	def static boolean textContains(String inputString, String text) {
		boolean found = true;
		if (!inputString.contains(text)) {
			System.out.println("Does not contains " + text)
			found = false;
		} else {
			System.out.println("Does contains " + text)
			Assert.assertTrue(found);
		}
	}
	
	@Keyword
	def static String getLoanNumberFromURL(String url) {
		String loanNumber = "";
		loanNumber = url.substring(url.length() - 5);
		return loanNumber;
	}
}
