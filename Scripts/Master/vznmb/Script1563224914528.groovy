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

WebUI.click(findTestObject('vznmb customer page/Page_ Fuse (verizonsmb qa)/a_VZNMB'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

//WebUI.sendKeys(findTestObject('txt_Comment'), Keys(Keys.return))
WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    'Changedagain4')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Last Name _customer_last_name'), 
    'Scott')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Email _customer_email'), 'Miloiscool@testing.com')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
    '5645656587')

WebUI.delay(3)

WebUI.click(findTestObject('vznmb customer page/Page_ Fuse (verizonsmb qa)/span_Yes'))

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1222 w athleen dr')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_City _customer_addresses_primary_city'), 
    'West Jordan')

WebUI.selectOptionByIndex(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/select_Alabama'), '45')

WebUI.setText(findTestObject('vnzmb customer slab/Page_ Fuse (verizonsmb qa)/input_Business Name _order_business_name'), 
    'New business')

WebUI.scrollToElement(findTestObject('vnzmb customer slab/Page_ Fuse (verizonsmb qa)/button_Next'), 0)

WebUI.click(findTestObject('vnzmb customer slab/Page_ Fuse (verizonsmb qa)/button_Next'))

WebUI.delay(4)

WebUI.click(findTestObject('vznmb customer page/Page_ Fuse (verizonsmb qa)/next-button'))

WebUI.setText(findTestObject('vznmb products/Page_ Fuse (verizonsmb qa)/input_Verizon Order Number (MON) _order_brand_account_number'), 
    '123654789')

WebUI.selectOptionByIndex(findTestObject('vznmb products/Page_ Fuse (verizonsmb qa)/select_FIOSNON-FIOSOut of Footprint'), 
    '2')

WebUI.click(findTestObject('vznmb products/Page_ Fuse (verizonsmb qa)/input_Available Products_form-control'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('vznmb products/Page_ Fuse (verizonsmb qa)/Page_ Fuse (verizonsmb qa)/a_BUS DTL TERM 2 YR ALT - AUTORENEW'))

WebUI.delay(2)

WebUI.click(findTestObject('vznmb products/Page_ Fuse (verizonsmb qa)/button_Next'))

WebUI.delay(4)

WebUI.click(findTestObject('vznmb schedule/Page_ Fuse (verizonsmb qa)/button_Schedule'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('vznmb schedule/Page_ Fuse (verizonsmb qa)/button_Create an Additional Order'), 
    5)

