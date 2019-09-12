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

WebUI.openBrowser('https://fuse.staging.clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'verizon.qa@clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019!')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('search orders/Page_ Fuse (verizon qa)/input_Logout_form-control'), '10000758')

WebUI.click(findTestObject('search orders/Page_ Fuse (verizon qa)/span_Logout_search fuse-icon clickable'))

WebUI.click(findTestObject('search orders/Page_ Fuse (verizon qa)/button_See Order'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('search orders/Page_ Fuse (verizon qa)/h1_Customer Information'), 30)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.clearText(findTestObject('search orders/Page_ Fuse (verizon qa)/search field from search screen/Page_ Fuse (verizon qa)/input_Logout_form-control'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('search orders/Page_ Fuse (verizon qa)/input_Logout_form-control'), '10000757')

WebUI.click(findTestObject('search orders/Page_ Fuse (verizon qa)/search field from search screen/Page_ Fuse (verizon qa)/input_Logout_form-control'))

WebUI.click(findTestObject('search orders/Page_ Fuse (verizon qa)/button_See Order'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('search orders/Page_ Fuse (verizon qa)/h1_Customer Information'), 30)

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

