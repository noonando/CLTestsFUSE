import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('uatfuse.clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'verizon.qa@clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Screen pop update/Page_ Fuse (Matthew Browning)/a_VZN'))

