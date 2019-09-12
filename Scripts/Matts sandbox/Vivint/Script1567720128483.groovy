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

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'vivint.qa@clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Matts objects/vivint customer slab/Page_ Fuse (Vivint qa)/a_VIV'))

WebUI.switchToWindowIndex('1')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_First Name _customer_first_name'), 
    'Test')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Last Name _customer_last_name'), 
    'Vivint')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Email _customer_emails_primary_email'), 
    'test@testing.com')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
    '5464665879')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Zip Code _customer_addresses_primary_zip_code'), 
    '84084')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1222 W Athleen dr')

WebUI.click(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/span_Yes'))

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_City _customer_addresses_primary_city'), 
    'West Jordan')

WebUI.selectOptionByIndex(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/select_AlabamaAlaskaArizonaArkansas'), 
    45)

WebUI.delay(1)

WebUI.click(findTestObject('Matts objects/vivint customer slab/Page_ Fuse (Vivint qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/vivint springboard/Page_ Fuse (Vivint qa)/h1_Springboard'), 0)

WebUI.click(findTestObject('Matts objects/vivint springboard/Page_ Fuse (Vivint qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/h1_Products'), 4)

WebUI.setText(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/vivint opportunity number'), '123456789')

WebUI.setText(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/discount applied'), '200')

WebUI.setText(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/amount collected'), '45.99')

WebUI.selectOptionByIndex(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/select term'), 2)

WebUI.selectOptionByIndex(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/installation fee'), 2)

WebUI.click(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/input_Available Products_form-control'))

WebUI.click(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/a_SmartHomeVideo 4 Camera'))

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/button_Next'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/h1_Recaps'), 0)

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_SMS Permission Statement Is it OK i'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_Installation SMS Permission Statement Y'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_RECAPS Mr  Mrs______ I want to qui'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_Today we are setting you up with our __'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_The equipment you have chosen will b'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_Your total monthly payment will consist'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_A total of ______ will be deducted from y'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_The account holder must be present a'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_Iowa and Ohio residents Required to'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/span_Transfer customer to Pre-Install Survey'))

WebUI.click(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/vivint summary/Page_ Fuse (Vivint qa)/a_Status Log'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/vivint summary/Page_ Fuse (Vivint qa)/button_Schedule'))

WebUI.verifyAlertNotPresent(10)

//WebUI.waitForElementClickable(findTestObject('Matts objects/vivint summary/Page_ Fuse (Vivint qa)/button_Create an Additional Order'), 
//    30)
WebUI.verifyTextPresent('scheduled', false)

