/* Author: Carlito Carriedo
 * Initial create date: October 7, 2022
 * Description: Test case for https://kayamo.atlassian.net/browse/KS-231
 */

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/menu_Merchant_Loan_Center'))

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/submenu_All_Loans'))

WebUI.setText(findTestObject('BackOffice/BO_Merchant_Loan_Center/input_Loan_Number'), loan_number)

WebUI.setText(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/input_Mobile_Number'), mobile_number)

WebUI.selectOptionByValue(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/select_Status'), select_status, 
    true)

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/button_Search'))

WebUI.verifyElementText(findTestObject('BackOffice/BO_Merchant_Loan_Center/table_Loan_Number'), table_loan_number)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BackOffice/BO_Merchant_Loan_Center/input_Mobile_Number'))

WebUI.verifyElementText(findTestObject('BackOffice/BO_Merchant_Loan_Center/table_Status'), table_status)

WebUI.click(findTestObject('BackOffice/BO_Merchant_Loan_Center/table_View'))

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/details_Contact_Number'))

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Merchant_Loan_Center/button_Demand Letter'))

WebUI.delay(5)

WebUI.takeScreenshot()

//Calls the keyword to verify the downloaded file
CustomKeywords.'pdfKeywords.verifyFileDownloaded.checkFileDownloaded'(downloadPath, fileName)

WebUI.delay(5)