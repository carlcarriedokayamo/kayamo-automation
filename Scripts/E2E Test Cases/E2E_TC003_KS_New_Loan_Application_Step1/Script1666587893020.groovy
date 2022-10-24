/* Author: Carlito Carriedo
 * Initial create date: October 21, 2022
 * Description: End to end test case for new loan application step 1
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

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step1_Store_Name'), store_name_step1)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step1_Shop_URL'), shop_url_step1)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step1_Contact_Number'), contact_number_step1)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step1_Store_Email_Address'), store_email_address_step1)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step1_Store_City_Address'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step1_Store_City_Address'), store_city_address_step1)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step1_Store_City_Address'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step1_Store_Complete_Address'), store_complete_address_step1)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step1_Warehouse_City_Address'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step1_Warehouse_City_Address'), warehouse_city_address_step1)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step1_Warehouse_City_Address'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_Warehouse Complete Address_warehouse__3115e9'), 
    warehouse_complete_address_step1)

WebUI.uploadFile(findTestObject('E2E_KS_New_Loan_Application_Steps123/attachment_step1_upload_proof_of_billing'), attachment_path_file_step1)

WebUI.delay(15)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/button_step1_Next'))

if (!(WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Steps123/message_success'), 'success', FailureHandling.STOP_ON_FAILURE))) {
}