/* Author: Carlito Carriedo
 * Created Date: October 10, 2022
 * Description: Test case for https://kayamo.atlassian.net/browse/KS-219
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

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Collection_Center/menu_Collection center'))

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Collection_Center/submenu_All cases'))

WebUI.setText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/input_Loan_Number'), loan_number)

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Collection_Center/button_Search'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/table_Loan_Number'), table_loan_number)

WebUI.verifyElementText(findTestObject('BackOffice/BO_Collection_Center/table_Mobile_Number'), table_mobile_number)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/table_Status'), table_status)

WebUI.click(findTestObject('Object Repository/BackOffice/BO_Collection_Center/table_View'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/h3_Details'), h3_details)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/h2_Loan_Information'), h2_loan_information)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/h2_Personal_Contact_Information'), 
    h2_personal_contact_information)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/h2_Contact Reference'), h2_contact_reference)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/h2_collection_detail_logs'), h2_collection_detail_logs)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/LoanInformation_Loan_Number'), 
    loaninformation_loan_number)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/PersonalContactInfo_Full_Name'), 
    personalcontaciInfo_full_name)

WebUI.verifyElementText(findTestObject('Object Repository/BackOffice/BO_Collection_Center/PersonalContactInfo_Mobile_Number'), 
    personalcontaciInfo_mobile_number)

WebUI.verifyElementPresent(findTestObject('Object Repository/BackOffice/BO_Collection_Center/ContactReference_Table'), 0)

