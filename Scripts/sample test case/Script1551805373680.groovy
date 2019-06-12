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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uatfuse.clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'Matthew.browning@clearlink.com')

WebUI.setEncryptedText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'h/wZhaWomj2B9M0yhkw6+g==')

WebUI.click(findTestObject('Object Repository/Page_Clearlink Authentication/button_Login'))

WebUI.click(findTestObject('Screen pops/Page_ Fuse (Matthew Browning)/a_EMBARQ'))

WebUI.navigateToUrl('https://uatfuse.clearlink.com/order?BRAND_SHORT_CODE=CTL')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_First Name _customer_first_name (10)'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_Last Name _customer_last_name (10)'), 
    'Order')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_Email _customer_email (10)'), 'Test@testing.com')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Yes (10)'))

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_ZipPostal Code _customer_addresses_primary_postal_code (10)'), 
    '33991')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_Street Address _customer_addresses_primary_line1 (10)'), 
    '1316 lavaca ct')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/span_1316 Lavaca Ct Cape Coral FL (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_select (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_Date of Birth _el-input__inner (10)'), 
    '11051956')

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_SSN _order_ssn (10)'), '111-11-1111')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/select_Self InstallationProfessional Installation (10)'), 
    'SELF', true)

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Yes (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/span_20 (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_select (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_select (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_select (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Yes (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Yes (10)'))

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_Card Number _order_additionals_credit_card_info_card_number (10)'), 
    '5111005111051128')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/select_American ExpressVisaMaster CardDiscoverNovus (10)'), 
    'mc', true)

WebUI.setText(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/input_Expiration Date _el-input__inner (10)'), 
    '1122')

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_select_1 (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Collect and confirm Name Email address phone number alternate phone number (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_You have selected our'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_The security deposit'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_The one-time charges are 210500. These charges will be reflected on your first bill.'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_We bill for services one-month in a'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Your Home Phone package includes 30 minutes of long-distance and will be billed  0.20 per minute  after that.'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_We encourage you to enroll in Auto PayPaperles'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Near the date your services become a'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Confirm installation date and time'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Allow 2-6 hours for set up. An adult over the age of 18 will need to be present during the installation.'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_There is no term commitment with your Price for Life package.'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_CenturyLink services are subject to ser'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Confirm and play recap audio disclosure before placing the order.'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/label_Confirm and Give the customer the applicable TPI phone number.'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Next (10)'))

WebUI.click(findTestObject('Object Repository/Page_ Fuse (Matthew Browning)/button_Schedule'))

WebUI.closeBrowser()

