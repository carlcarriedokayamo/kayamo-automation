package excelKeywords

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

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

public class writeToExcel {

	@Keyword
	def static void writeToExcelSheet(String value, String row_num) throws IOException {

		String mobileOTP = "/Users/carlcarriedo/git/kayamo-automation/Data Files/KayamoSite_Dataset/MobileOTP_File.xlsx"
		FileInputStream fis = new FileInputStream (mobileOTP)
		XSSFWorkbook workbook = new XSSFWorkbook (fis);

		XSSFSheet sheet = workbook.getSheet("OTPSheet");

		Row excelRow = sheet.getRow(row_num);
		Cell cell = excelRow.createCell(10);
		cell.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(mobileOTP);
		workbook.write(fos);
		fos.close();
		fis.close();
	}
	
	@Keyword
	def writeToExcel(String value, String row_num) throws IOException {
		FileInputStream fis = new FileInputStream ("filepath")
		XSSFWorkbook workbook = new XSSFWorkbook (fis)
		XSSFSheet sheet = workbook.getSheet("sheetname");
		Row excelRow = sheet.getRow(row_num);
		Cell cell = excelRow.createCell(10);
		cell.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream("filepath");
		workbook.write(fos);
		fos.close();
		fis.close();
	}
}


