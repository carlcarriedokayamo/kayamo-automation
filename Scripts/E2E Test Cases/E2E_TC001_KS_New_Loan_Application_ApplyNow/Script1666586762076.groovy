/* Author: Carlito Carriedo
 * Initial create date: October 20, 2022
 * Description: End to end test case for new loan application upto shop seller authorization login page
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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_Apply Now'))

if (WebUI.verifyElementVisible(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_New Application'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_New Application'))
}

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_Shopee_Seller_Auth'))

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/dropdown_Select_Country_Code_Shop_Seller_Auth'))

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/dropdown_Select_Country_Code_Philippines_Shop_Seller_Auth'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/input_Shop_Seller_Auth_Phone_Number'), seller_auth_phone_number)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/input_Shop_Seller_Auth_Password'), seller_auth_password)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_Shop_Seller_Auth_Login'))

