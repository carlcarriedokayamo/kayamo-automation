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

WebUI.navigateToUrl('https://uat.kayamo.com.ph/')

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Log In  Sign Up'))

WebUI.setText(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/input_Log In  Sign Up_mobile_number'), 
    '9174432720')

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/input_Log In  Sign Up_tb0'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/input_Log In  Sign Up_tb0'))

WebUI.setText(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/input_Log In  Sign Up_verification_code'), 
    '123456')

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/input_I agree with theof Kayamo._check_term'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_I ACCEPT'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/button_Log In                     Sign Up'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Apply na_layui-layer-ico layui-layer-clos_49fd1d'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/img'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_My Order  Repay'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_My Order  Repay                        _817248'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan  ID'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_NO.10149'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Status'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Pending repayment'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_View'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Information'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_10149'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_kayamo_shop'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_2022-10-19'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan SummaryLoan Amount 18,750.00Loan T_188b37'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Summary'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Amount'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_18,750.00'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Term'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_6 months'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Payment Terms'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Bi-monthly'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Penalty Interest (daily)'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_0.3 of Loan Amount'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Breakdown Need quick cash Kayamo n_53dd05'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan Breakdown'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Loan Amount'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_18,750.00_1'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Loan Term'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_6 months'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Processing Fee'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_1,687.50'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Receiving Amount'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_17,062.50'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Interest'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_3,937.50'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Installment Period'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_12 phases'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_ Payment Amount (each period)'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_1,890.63'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Payment Schedule  Prepayment'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Loan InformationLoan ID10149Store Namek_241bf8'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_2022-10-30'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1890.625'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_0'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1890.625'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_0'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1890.625'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Pending repayment_1'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Pay Now'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Payment Amount'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_1,890.63_1'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_(Transaction fee 26.00  free now 0.00)'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Please select a payment method'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Payment Instruction'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Payment Method'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Please choose your preferred payment method'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Please choose your preferred payment me_da71df'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_How to repay your loan                 _a8c1d7'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Pay Now'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Account Name'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_KAYAMO'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Virtual Account Number'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/span_900021000027'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_A payment reminder and reference number_92dde5'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Copy'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_The contract number has been copied suc_99b603'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Apply na_layui-layer-ico layui-layer-clos_49fd1d'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_12'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_2023-04-15'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1890.625'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_0'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1890.625'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_0'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_1890.625'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/div_Pending repayment_1_2'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/img'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_Log out'))

WebUI.click(findTestObject('Object Repository/E2E_KS_New_Loan_Approved_Checking/a_YES'))

WebUI.closeBrowser()

