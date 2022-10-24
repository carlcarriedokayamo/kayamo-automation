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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-admin.kayamo.com.ph/auth/login')

WebUI.setText(findTestObject('E2E_BO_First_Trial_Approval/input_Current language_login'), 'kayamo888')

WebUI.setEncryptedText(findTestObject('E2E_BO_First_Trial_Approval/input_Current language_password'), 'KRKx4mkpVLPgeFJzr0Ya8w==')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/logo_Kayamo'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Login'))

WebUI.verifyElementPresent(findTestObject('E2E_BO_First_Trial_Approval/profile_text_Welcome'), 0)

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/profile_Name'), '888', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/menu_MerchantLoan Center'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/submenu_All loans'))

WebUI.setText(findTestObject('E2E_BO_First_Trial_Approval/input_Loan number_loan_number'), '10149')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Search'))

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_searched_Loan_Number')), 
    '10149')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_searched_Phone_Number')), 
    '9174432720')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/button_1st level verification')), 
    '1st level verification')

def firstReviewer = WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_searched_Assigned_Approver'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/icon_Profile'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/profile_Logout'))

WebUI.verifyElementPresent(findTestObject('E2E_BO_First_Trial_Approval/logo_Kayamo'), 0)

WebUI.setText(findTestObject('E2E_BO_First_Trial_Approval/input_Current language_login'), '09550545823')

WebUI.setEncryptedText(findTestObject('E2E_BO_First_Trial_Approval/input_Current language_password'), 'MnK0EfQBTqRH7sa5DsCaaA==')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Login'))

WebUI.verifyElementPresent(findTestObject('E2E_BO_First_Trial_Approval/profile_text_Welcome'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Regina Manzon'), 'Regina Manzon', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/menu_MerchantLoan Center'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/submenu_1st _Trial'))

WebUI.setText(findTestObject('E2E_BO_First_Trial_Approval/input_Loan number_loan_number'), '10149')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Search'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/table_searched_Loan_Number'), '10149', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/table_searched_Phone_Number'), '9174432720', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/link_Check'))

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Category')), 
    'shopee')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Seller ID')), 
    '847852116')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Purpose_of_Loan')), 
    'business')

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/label_Verify that the clients Shop name is correct'), 
    'Verify that the client\'s Shop name is correct')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/switch_Verify Shop name is correct'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Successful operation'), 'Successful operation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_OK'))

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Shop_Name')), 
    'kayamo_shop')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Shop_Link')), 
    'https://shopee.ph/shop/8499384...')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Contact_Number')), 
    '09174432720')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_MerchantInformation_Store_Email')), 
    'mydummyakawnt1gmail.com')

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/label_Verify that the clients Billing address'), 'Verify that the client\'s Billing address is correct')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/switch_Verify Billing address is correct'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Successful operation'), 'Successful operation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_OK'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Client Bank Details'), 'Client Bank Details')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ClientBankDetails_Accoount_Name')), 
    'FirstnameDummy MiddlenameDummy LastnameDummy')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ClientBankDetails_Mothers Maiden Name')), 
    'Mother Maiden Name')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ClientBankDetails_Account_Number')), 
    '054000000027')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ClientBankDetails_Bank_Name')), 
    'COMMUNITY RURAL BANK OF ROMBLON, INC.')

WebUI.verifyElementPresent(findTestObject('E2E_BO_First_Trial_Approval/h2_Product Info'), 0)

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ProductInfo_Expected_Loan_Amount')), 
    '100000')

WebUI.verifyElementPresent(findTestObject('E2E_BO_First_Trial_Approval/h2_Applicant information'), 0)

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Role')), 
    'Business Owner')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Full name')), 
    'FirstnameDummy MiddlenameDummy LastnameDummy')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_BirthDate')), 
    '1985-08-22')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Marital_Status')), 
    'single')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicaneInformation_Number_of_Children')), 
    '0')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Gender')), 
    'Male')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Mobile number')), 
    '9174432720')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Age')), 
    '37')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Facebook_URL')), 
    'http://www.facebook.com/dummytest')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Education_Level')), 
    'College Graduate')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_ID_Document_Number')), 
    '12345678')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_ID_Document_Type')), 
    'Passport')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/text_ApplicantInformation_Email')), 
    'mydummyakawnt1@gmail.com')

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/label_Verify that the clients Age is correct'), 'Verify that the client\'s Age is correct', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/label_Verify that the clients Name is correct'), 'Verify that the client\'s Name is correct', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/switch_Verify Name is correct'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Successful operation'), 'Successful operation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_OK'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/label_Verify that the clients ID number is correct'), 
    'Verify that the client\'s ID number is correct', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/switch_Verify ID number is correct'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Successful operation'), 'Successful operation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_OK'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/switch_Verify Age is correct'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Successful operation'), 'Successful operation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_OK'))

WebUI.verifyElementPresent(findTestObject('E2E_BO_First_Trial_Approval/h2_Contact Reference'), 0)

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_First')), 
    'Reference First')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_First_Relationship')), 
    'Father')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_First_Phone')), 
    '9176567876')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Second_Name')), 
    'Reference Second')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Second_Relationship')), 
    'Mother')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Second_Phone')), 
    '9176545678')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Third_Name')), 
    'Reference Third')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Third_Spouse')), 
    'Spouse')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Third_Phone')), 
    '9176543213')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Fourth_Name')), 
    'Reference Fourth')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Fourth_Relationship')), 
    'Sibling')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_ContactReference_Reference_Fourth_Phone')), 
    '9175645432')

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/label_Verify that the Information of reference contacts is correct'), 
    'Verify that the Information of reference contacts is correct', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/switch_Verify Information of reference contacts is correct'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/h2_Successful operation'), 'Successful operation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_OK'))

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_CreditVerificationsReview_Product_Name')), 
    'Merchant Loan')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_CreditVerificationsReview_Product_Amount')), 
    'P18750')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_CreditVerificationsReview_Months')), 
    'Months')

CustomKeywords.'genericKeywords.genericKeywords.textContains'(WebUI.getText(findTestObject('E2E_BO_First_Trial_Approval/table_CreditVerificationsReview_Borrowing_Rate')), 
    '0%')

WebUI.setText(findTestObject('E2E_BO_First_Trial_Approval/textarea_remark'), 'Done first trial')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Pass'))

WebUI.waitForElementPresent(findTestObject('E2E_BO_First_Trial_Approval/message_Cannot be undone after operate'), 0)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Submit_Approve_Loan'))

WebUI.waitForElementPresent(findTestObject('E2E_BO_First_Trial_Approval/message_Success'), 0)

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/submenu_1st _Trial'))

WebUI.setText(findTestObject('E2E_BO_First_Trial_Approval/input_Loan number_loan_number'), '10149')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/button_Search'))

WebUI.verifyElementText(findTestObject('E2E_BO_First_Trial_Approval/table_Search_Results'), 'no info')

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/icon_Profile'))

WebUI.click(findTestObject('E2E_BO_First_Trial_Approval/profile_Logout'))

