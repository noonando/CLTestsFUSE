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

WebUI.openBrowser('fuse.staging.clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'verizonsmb.qa@clearlink.com')

WebUI.setText(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Matts objects/Recent Order/Page_ Fuse (verizonsmb qa)/h1_Recent Orders'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/Recent Order/Page_ Fuse (verizonsmb qa)/label_Scheduled'))

WebUI.waitForElementVisible(findTestObject('Matts objects/Recent Order/Page_ Fuse (verizonsmb qa)/button_Open'), 0)

WebUI.click(findTestObject('Matts objects/Recent Order/Page_ Fuse (verizonsmb qa)/button_Open'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('Matts objects/Recent Order/Page_ Fuse (verizonsmb qa)/div_scheduled'), FailureHandling.STOP_ON_FAILURE)

