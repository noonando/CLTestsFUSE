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

WebUI.setText(findTestObject('Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'enercare.qa@clearlink.com')

WebUI.setEncryptedText(findTestObject('Page_Clearlink Authentication/input_Invalid username andor'), 'h/wZhaWomj04dZdXbz2UUQ==')

WebUI.click(findTestObject('Page_Clearlink Authentication/button_Login'))

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Screen pops/Page_ Fuse (Matthew Browning)/a_ENCR'))

WebUI.switchToWindowIndex('1')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_First Name _customer_first_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Last Name _customer_last_name'), 'Person')

//WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
//    '564-654-5645')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Frontpoint qa)/label_Yes'))

WebUI.selectOptionByIndex(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/select_Canada'), '0')

WebUI.setText(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/input_Street Address _customer_addresses_primary_line1'), 
    '123 Drive rd')

WebUI.setText(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/input_Postal Code _customer_addresses_primary_postal_code'), 
    'A1A1A1')

WebUI.selectOptionByIndex(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/select_AlbertaBritish ColumbiaManitoba'), 
    2)

WebUI.setText(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/input_City _customer_addresses_primary_city'), 
    'Townsville')

WebUI.click(findTestObject('Page_ Fuse (Scott Patterson)/label_Yes'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/Page_ Fuse (Enercare qa)/input_Email _customer_email'), 
    'test@mail.com')

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('encr customer slab/Page_ Fuse (Enercare qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('encr springboard/Page_ Fuse (Enercare qa)/h1_Springboard'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('encr springboard/Page_ Fuse (Enercare qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('encr products/Page_ Fuse (Enercare qa)/h1_Products'), 0)

WebUI.delay(1)

WebUI.setText(findTestObject('encr products/Page_ Fuse (Enercare qa)/input_Site ID _site_id'), '123654789')

WebUI.click(findTestObject('encr products/Page_ Fuse (Enercare qa)/span_CA'))

WebUI.click(findTestObject('encr products/Page_ Fuse (Enercare qa)/input_Available Products_form-control'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('encr products/Page_ Fuse (Enercare qa)/a_HF05 - Furnace No heat'))

WebUI.delay(1)

WebUI.click(findTestObject('encr products/Page_ Fuse (Enercare qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/h1_Recaps'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/span_Confirm customers first name and last name (spell back)'))

WebUI.click(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/span_Confirm customers phone number'))

WebUI.click(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/span_Confirm customers physical Address and Billing Address'))

WebUI.click(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/span_Confirm customers email address (spell back)'))

WebUI.click(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/span_Confirmed other recaps present in DOK'))

WebUI.click(findTestObject('encr recaps/Page_ Fuse (Enercare qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('encr summary page/Page_ Fuse (Enercare qa)/a_Status Log'), 0)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('encr summary page/Page_ Fuse (Enercare qa)/button_Schedule'))

WebUI.waitForElementClickable(findTestObject('encr summary page/Page_ Fuse (Enercare qa)/a_Status Log'), 0)

WebUI.verifyElementVisible(findTestObject('Matts objects/Encr schedule status'))

