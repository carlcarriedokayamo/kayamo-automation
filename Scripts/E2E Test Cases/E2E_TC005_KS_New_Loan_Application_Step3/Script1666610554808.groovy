 /* Author: Carlito Carriedo
 * Initial create date: October 24, 2022
 * Description: End to end test case for new loan application step 2
 */ import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/text_step3_PersonalReference1'), 0)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference1_Name'), reference_1_name_step3)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference1_Phone_Number'), reference_1_phone_number_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step3_PersonalReference1_Relation'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step3_PersonalReference1_Relation'), reference_1_relation_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step3_PersonalReference1_Relation'))

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/text_step3_PersonalReference2'), 0)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference2_Name'), reference_2_name_step3)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference2_Phone_Number'), reference_2_phone_number_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step3_PersonalReference2_Relation'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step3_PersonalReference2_Relation'), reference_2_relation_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step3_PersonalReference2_Relation'))

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/text_step3_PersonalReference3'), 0)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference3_Name'), reference_3_name_step3)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference3_Phone_Number'), reference_3_phone_number_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step3_PersonalReference3_Relation'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step3_PersonalReference3_Relation'), reference_3_relation_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step3_PersonalReference3_Relation'))

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/text_step3_PersonalReference4'), 0)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference4_Name'), reference_4_name_step3)

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/input_step3_PersonalReference4_Phone_Number'), reference_4_phone_number_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_step3_PersonalReference4_Relation'))

WebUI.setText(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_input_step3_PersonalReference4_Relation'), reference_4_relation_step3)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/dropdown_select_step3_PersonalReference4_Relation'))

WebUI.verifyElementPresent(findTestObject('E2E_KS_New_Loan_Application_Steps123/label_step3_Terms_And_Conditions'), 0)

WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/checkbox_step3_Terms_And_Conditions'))

//WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/button_step3_Submit'))
//
//if (!(WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Steps123/message_step3_Please_Check_Authorization'), 
//    'Please check authorization', FailureHandling.OPTIONAL))) {
//    WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/checkbox_step3_Terms_And_Conditions'))
//
//    WebUI.click(findTestObject('E2E_KS_New_Loan_Application_Steps123/button_step3_Submit'))
//}
//
//WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Steps123/message_success'), 'success')
//
//WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Steps123/label_Congratulations'), 'Congratulations')
//
//WebUI.verifyElementText(findTestObject('E2E_KS_New_Loan_Application_Steps123/text_Your loan application has been submitted'), 
//    'Your loan application has been submitted successfully. Our customer service team will contact you for final verification.')
//
//String newLoanURL = WebUI.getUrl()
//
//String loanNumber = CustomKeywords.'genericKeywords.genericKeywords.getLoanNumberFromURL'(newLoanURL)
//
//println('This is the loan number: ' + loanNumber)

