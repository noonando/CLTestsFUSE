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

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'attb.qa@clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/a_ATTB'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'))

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    'Test')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Last Name _customer_last_name'), 
    'object')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Email _customer_email'), 'Test@testing.com')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
    '5464987854')

WebUI.click(findTestObject('VZN phone consent/Page_ Fuse (verizonsmb qa)/span_Yes'))

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1316 lavaca ct')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_City _customer_addresses_primary_city'), 
    'Cape Coral')

WebUI.selectOptionByIndex(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/select_Alabama'), 10)

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_ZipPostal Code _customer_addresses_primary_postal_code'), 
    '33991')

WebUI.setText(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/input_Business Name _customer_business_name'), 
    'fake business')

//WebUI.scrollToElement(findTestObject('verizon next products/Page_ Fuse (verizon qa)/button_Next'), 0)
WebUI.scrollToElement(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/button_Next'), 0)

WebUI.click(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/next products attb/Page_ Fuse (ATTB qa)/h1_Springboard'), 
    0)

WebUI.click(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/h1_Products'), 0)

WebUI.click(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/span_Yes'))

WebUI.selectOptionByIndex(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/input_Available Products_form-control'), 
    4)

