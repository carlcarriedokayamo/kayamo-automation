/* Author: Carlito Carriedo
 * Initial create date: October 21, 2022
 * Description: End to end test case for new loan application step 2
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

WebUI.waitForElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_FirstName_Shop_Owner'), 0)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_FirstName_Shop_Owner'), firstname_of_shop_owner_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_MiddleName_Shop_Owner'), middlename_of_shop_owner_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_LastName_Shop_Owner'), lastname_of_shop_owner_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_Address'), address_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_City_Address'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_City_Address'), city_address_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_City_Address'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_Zip_Code'), zip_code_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_Birthdate'), birthdate_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_Gender'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_Gender'), gender_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_Gender'))

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_Education'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_Education'), education_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_College_Graduate'))

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_Marital_Status'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_Marital_Status'), marital_status_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_Marital_Status'))

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_Number_Of_Children'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_Number_Of_Children'), number_of_children_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_Number_Of_Children'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_Facebook_URL'), facebook_url_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_Purpose_of_Loan'), purpose_of_loan_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_Expected_Loan_Amount'), expected_loan_amount_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_ID_Type'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_ID_Type'), id_type_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_ID_Type'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_ID _No'), id_no_step2)

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/step2_Add Attachment'), 0)

WebUI.uploadFile(findTestObject('E2E_KS_New_Loan_Application_Steps123/attachment_step2_upload_ID'), id_attachment_pathfile_step2)

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/step2_Selfie Holding your ID'), 0)

WebUI.uploadFile(findTestObject('E2E_KS_New_Loan_Application_Steps123/attachment_step2_upload_ID_Selfie'), selfie_id_pathfile_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_BankAccount_Account_FirstName'), bankaccount_firstname_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_BankAccount_Account_MiddleName'), bankaccount_middlename_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_BankAccount_Account_LastName'), bankaccount_lastname_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_BankAccount_Mothers_Maiden_Name'), mothers_maiden_name_step2)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step2_BankAccount_Account_Number'), account_number_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step2_Bank_Name'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step2_Bank_Name'), bank_name_step2)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step2_Bank_Name'))

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/button_step2_Next'))

WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Steps123/message_success'), 'success', FailureHandling.CONTINUE_ON_FAILURE)

