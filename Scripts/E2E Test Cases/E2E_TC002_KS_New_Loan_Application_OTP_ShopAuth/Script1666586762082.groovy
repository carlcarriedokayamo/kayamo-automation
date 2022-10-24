/* Author: Carlito Carriedo
 * Initial create date: October 21, 2022
 * Description: End to end test case for new loan application for shop seller authorization
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

if (WebUI.verifyElementVisible(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/input_OTP'), FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/input_OTP'), seller_auth_otp)
    WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_Verify_OTP'))
}

WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/text_Shop_Seller_Auth_Confirm_Auth'), seller_shop_username)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/button_Shop_Seller_Auth_Confirm Authorization'))

WebUI.waitForElementPresent(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/message_The authorization is being processed'), 
    0)

WebUI.waitForElementPresent(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/message_Authorization success'), 0)

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Apply_Now_Seller_Auth/text_Shopee_Store_Information_Step1'), 
    0)



