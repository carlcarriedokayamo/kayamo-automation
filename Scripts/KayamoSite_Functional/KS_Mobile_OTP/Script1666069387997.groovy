/* Author: Carlito Carriedo
 * Initial create date: October 19, 2022
 * Description: Test case to capture mobile OTP using Appium
 */

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
//String message = Mobile.getText(findTestObject('[insert here]', 0, FailureHandling.CONTINUE_ON_FAILURE)
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.keyword.excel.ExcelKeywords

Mobile.startApplication(mobile_apk_path, false)


Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Mobile_Android_Text_Messages/android.widget.TextView - Shopee Sender'), 0)


String message = Mobile.getText(findTestObject('Mobile_Android_Text_Messages/android.widget.TextView - Shopee Text Overview'), 0)


Pattern p1 = Pattern.compile('[0-9]+')


Matcher m1 = p1.matcher(message)


if (m1.find()) {
    String otp = m1.group()
	String newLoanApplication = '/Users/carlcarriedo/git/kayamo-automation/Data Files/E2E_Dataset/E2E_New_Loan_Application.xlsx'
	newLoan = ExcelKeywords.getWorkbook(newLoanApplication)
	Sheet_E2E_New_Loan_Application = ExcelKeywords.getExcelSheet(newLoan, 'E2E_New_Loan_Application')
	rowNumber = ExcelKeywords.getCellValueByAddress (Sheet_E2E_New_Loan_Application, 'A1')

    CustomKeywords.'excelKeywords.writeToExcel.writeToExcelSheet'(otp, rowNumber)
}

Mobile.tap(findTestObject('Mobile_Android_Text_Messages/android.widget.Button - Back'), 0)

Mobile.tap(findTestObject('Mobile_Android_Text_Messages/android.widget.Button - Edit'), 0)

Mobile.tap(findTestObject('Mobile_Android_Text_Messages/android.widget.Button'), 0)

Mobile.tap(findTestObject('Mobile_Android_Text_Messages/android.widget.Button - Delete'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

