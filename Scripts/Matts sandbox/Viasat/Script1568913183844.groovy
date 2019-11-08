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

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'viasat.1.qa@clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Matts objects/Viasat customer page/Page_ Fuse (Viasat qa)/a_VSAT'))

WebUI.switchToWindowIndex('1')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_First Name _customer_first_name'), 
    'Test')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Last Name _customer_last_name'), 
    'viasat')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Email _customer_emails_primary_email'), 
    'test@testing.com')

//WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
//    '8017895461')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Zip Code _customer_addresses_primary_zip_code'), 
    '84084')

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1222 W Athleen dr')

WebUI.click(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/span_Yes'))

WebUI.setText(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/input_City _customer_addresses_primary_city'), 
    'West Jordan')

WebUI.selectOptionByIndex(findTestObject('Matts objects/vivint customer/Page_ Fuse (Vivint qa)/select_AlabamaAlaskaArizonaArkansas'), 
    45)

WebUI.click(findTestObject('Matts objects/Viasat customer page/Page_ Fuse (Viasat qa)/button_Okay'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.delay(1)

WebUI.click(findTestObject('Matts objects/Viasat customer page/Page_ Fuse (Viasat qa)/button_Next'))

WebUI.waitForElementPresent(findTestObject('Matts objects/viasat springboard/Page_ Fuse (Viasat qa)/h1_Springboard'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Matts objects/viasat springboard/Page_ Fuse (Viasat qa)/button_Next'))

WebUI.waitForElementPresent(findTestObject('Matts objects/viasat products page/Page_ Fuse (Viasat qa)/h1_Products'), 0)

WebUI.setText(findTestObject('Matts objects/viasat products page/Page_ Fuse (Viasat qa)/input_VIASAT Order Reference Number _reference_number'), 
    'CL12345678')

WebUI.click(findTestObject('Matts objects/viasat products page/Page_ Fuse (Viasat qa)/input_Available Products_form-control'))

WebUI.click(findTestObject('Matts objects/viasat products page/Page_ Fuse (Viasat qa)/a_Unlimited Gold 30'))

WebUI.delay(1)

WebUI.click(findTestObject('Matts objects/vivint products/Page_ Fuse (Vivint qa)/button_Next'))

WebUI.waitForElementPresent(findTestObject('Matts objects/vivint recap/Page_ Fuse (Vivint qa)/h1_Recaps'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Prepare the customer for whats a'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Credit-Check Statement As'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Im going to go over a recap of all'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Confirm customer Name (spell back) a'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Recap Package Details Open Recaps'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Recap Equipment Fees Open Recaps in'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Recap VOIP Open Recaps in Succeed for Package Sold'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_E-Billing Recap Open Recaps in Succeed for Package Sold'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Recap Tech Support'))

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/span_Pitch Home Security  Pitch Option 1 B'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/viasat recaps page/Page_ Fuse (Viasat qa)/button_Next'))

WebUI.verifyElementVisible(findTestObject('Matts objects/viasat summary page/Page_ Fuse (Viasat qa)/a_Status Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/viasat summary page/Page_ Fuse (Viasat qa)/button_Schedule'))

WebUI.verifyTextPresent('scheduled', false)

