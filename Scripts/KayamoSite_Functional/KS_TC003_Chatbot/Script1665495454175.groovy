/* Author: Carlito Carriedo
 * Initial create date: October 14, 2022
 * Description: Test case for https://kayamo.atlassian.net/browse/KS-234
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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.kayamo.com.ph/')

WebUI.click(findTestObject('KayamoSite_Home_Page/Promotion_Alert'))

WebUI.verifyElementPresent(findTestObject('KayamoSite_Home_Page/chatbot_icon'), 0)

WebUI.click(findTestObject('KayamoSite_Home_Page/chatbot_icon'))

WebUI.verifyElementPresent(findTestObject('KayamoSite_Home_Page/chatbot_field'), 0)

WebUI.verifyElementPresent(findTestObject('KayamoSite_Home_Page/chatbot_input_text_field'), 0)

WebUI.sendKeys(findTestObject('KayamoSite_Home_Page/chatbot_input_text_field'), 'test')

WebUI.takeScreenshot()

WebUI.click(findTestObject('KayamoSite_Home_Page/chatbot_close'))

WebUI.closeBrowser()

