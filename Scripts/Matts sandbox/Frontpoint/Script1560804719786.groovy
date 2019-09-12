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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fuse.staging.clearlink.com/#/')

WebUI.setText(findTestObject('Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'frontpoint.qa@clearlink.com')

WebUI.setEncryptedText(findTestObject('Page_Clearlink Authentication/input_Invalid username andor'), 'h/wZhaWomj0Z9KKIpnVNaw==')

WebUI.click(findTestObject('Page_Clearlink Authentication/button_Login'))

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/a_FP'))

WebUI.switchToWindowIndex('1')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_First Name _customer_first_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Last Name _customer_last_name'), 'Person')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
    '564-654-5645')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1316 lavaca ct')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_City _customer_addresses_primary_city'), 
    'Cape Coral')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/legend_StateProvince'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/div_City StateProvince AlabamaAlaskaArizona'))

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_ZipPostal Code _customer_addresses_primary_postal_code'), 
    '33991')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Email _customer_email'), 'test@testing.com')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Order Confirmation Number _order_confirmation_number'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/div_Email Order Confirmation Number'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/i_Available Products_open-indicator'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/a_Safe Home Select'))

WebUI.scrollToPosition(99, 99)

WebUI.delay(2)

WebUI.click(findTestObject('Frontpoint/Page_ Fuse (Frontpoint qa)/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Collect and confirm name (spell back)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Collect and confirm the alternate contact n'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Repeat and confirm monitoring package selected'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Cover details on term monthly monitoring'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Explain DIY process'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Recap included equipment'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Set shipping expectations'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Cover date of first and future months payment date'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_Do I have permission to place this order'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/p_You also agree to enter into a'))

WebUI.click(findTestObject('Frontpoint/Page_ Fuse (Frontpoint qa)/span_Summary'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/button_Schedule'))

WebUI.verifyTextPresent('scheduled', false, FailureHandling.STOP_ON_FAILURE)

