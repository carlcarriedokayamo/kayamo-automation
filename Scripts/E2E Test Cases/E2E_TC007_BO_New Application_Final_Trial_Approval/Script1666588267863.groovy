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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-admin.kayamo.com.ph/auth/login')

WebUI.setText(findTestObject('Object Repository/E2E_BO_Final_Approval/input_Current language_login'), '09561734799')

WebUI.setEncryptedText(findTestObject('Object Repository/E2E_BO_Final_Approval/input_Current language_password'), 'AQjdgyjZ06CXOuclb8Wzcw==')

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/button_Login'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_MerchantLoan Center'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_last trial'))

WebUI.setText(findTestObject('Object Repository/E2E_BO_Final_Approval/input_Loan number_loan_number'), '10149')

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/button_Search'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/td_10149'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/td_9174432720'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/td_Approved'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/td_Regina Manzon'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_check'))

WebUI.setText(findTestObject('Object Repository/E2E_BO_Final_Approval/textarea__remark'), 'Completed final approval')

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/form_Reject Reason                         _275247'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/button_Pass'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/div_Cannot be undone after operate'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_Submit'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/div_success'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_last trial (1)'))

WebUI.setText(findTestObject('Object Repository/E2E_BO_Final_Approval/input_Loan number_loan_number'), '10149')

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/button_Search'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/td_no info'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_Final Verifier'))

WebUI.click(findTestObject('Object Repository/E2E_BO_Final_Approval/a_Log out'))

WebUI.closeBrowser()

