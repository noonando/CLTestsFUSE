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

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/a_ATTB'))

WebUI.switchToWindowIndex('1')

//WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)
WebUI.waitForElementClickable(findTestObject('vnzmb customer slab/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    0)

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

WebUI.scrollToPosition(9999999, 9999999)

WebUI.waitForElementVisible(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/input_Business Name _customer_business_name'), 
    0)

WebUI.setText(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/input_Business Name _customer_business_name'), 
    'fake business')

//WebUI.scrollToElement(findTestObject('verizon next products/Page_ Fuse (verizon qa)/button_Next'), 0)
WebUI.scrollToElement(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/button_Next'), 0)

WebUI.click(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/attb/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/Page_ Fuse (ATTB qa)/next products attb/Page_ Fuse (ATTB qa)/h1_Springboard'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/button_Add Callback'))

WebUI.setText(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/input_Schedule a Callback_el-input__inner'), '07/19/2022 12:00 AM')

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/select_Select a timezoneUnited states'), '4')

WebUI.setText(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/textarea_Callback Reason___BVID__26'), 'This callback was created by my automated test. Yes I know how cool that is.')

WebUI.click(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/button_Create Callback'))

WebUI.waitForElementVisible(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/p_Your callback has been created Do you wish to continue with the order'), 
    0)

WebUI.click(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/button_No'))

WebUI.switchToWindowIndex(0)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.waitForElementVisible(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/h1_Callbacks'), 0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Callbacks test/view all/Page_ Fuse (ATTB qa)/button_View all'))

WebUI.click(findTestObject('Callbacks test/view all/Page_ Fuse (ATTB qa)/button_View all'))

WebUI.click(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/button_View'))

WebUI.scrollToPosition(9999999, 9999999)

//WebUI.click(findTestObject('Callbacks test/view all/Page_ Fuse (ATTB qa)/button_View all'))
WebUI.delay(1)

WebUI.click(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/a_GO TO ORDER'))

WebUI.waitForElementVisible(findTestObject('Callbacks test/Page_ Fuse (ATTB qa)/h1_Customer Information'), 10)

