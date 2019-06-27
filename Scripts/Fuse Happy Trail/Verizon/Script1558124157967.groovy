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

WebUI.click(findTestObject('All screen pop updated/Page_ Fuse all screen pop updated/a_VZN'))

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

WebUI.scrollToElement(findTestObject('Veizon/Customer next button/Page_ Fuse (verizon qa)/button_Next'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Veizon/Customer next button/Page_ Fuse (verizon qa)/button_Next'))

WebUI.click(findTestObject('Veizon/Customer next button/Page_ Fuse (verizon qa)/button_Next'))

WebUI.delay(7)

WebUI.click(findTestObject('verizon next products/Page_ Fuse (verizon qa)/span_Products'))

WebUI.setText(findTestObject('Veizon/Page_ Fuse (verizon qa)/input_Verizon Account Number _order_brand_account_number'), 
    '123456789')

WebUI.click(findTestObject('Veizon/Page_ Fuse (verizon qa)/span_No'))

WebUI.delay(5)

//WebUI.scrollToElement(findTestObject('Verizon products and on/Page_ Fuse (verizon qa)/button_Next'), 0)
WebUI.click(findTestObject('Verizon products and on/Page_ Fuse (verizon qa)/button_Select'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.delay(5)

WebUI.click(findTestObject('vzn product TV Ult/Page_ Fuse (verizon qa)/button_Select'))

WebUI.click(findTestObject('Verizon products and on/Page_ Fuse (verizon qa)/button_Next'))

WebUI.delay(7)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/select next'))

WebUI.delay(3)

WebUI.click(findTestObject('Matts objects/vzn recap 1'))

WebUI.click(findTestObject('Matts objects/vzn recap 2'))

WebUI.click(findTestObject('Matts objects/vzn recap 3'))

WebUI.click(findTestObject('Matts objects/vzn recap 4'))

WebUI.click(findTestObject('Matts objects/vzn recap 5'))

WebUI.click(findTestObject('Matts objects/vzn recap 6'))

WebUI.click(findTestObject('Matts objects/vzn recap 7'))

WebUI.click(findTestObject('Matts objects/vzn recap 8'))

WebUI.click(findTestObject('Matts objects/vzn recap 9'))

WebUI.click(findTestObject('Matts objects/vzn recap 10'))

WebUI.scrollToElement(findTestObject('Matts objects/vzn recap 12'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/vzn recap 11'))

WebUI.click(findTestObject('Matts objects/vzn recap 12'))

WebUI.click(findTestObject('Matts objects/vzn recap 13'))

WebUI.scrollToElement(findTestObject('Matts objects/vzn next recaps'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/vzn recap 14'))

WebUI.click(findTestObject('Matts objects/vzn recap 15'))

WebUI.click(findTestObject('Matts objects/vzn recap 16'))

WebUI.click(findTestObject('Matts objects/vzn next recaps'))

WebUI.delay(5)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/vzn schedule'))

