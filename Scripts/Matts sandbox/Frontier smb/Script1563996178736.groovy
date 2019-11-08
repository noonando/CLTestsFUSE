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

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'frontiersmb.qa@clearlink.com')

WebUI.setText(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019!')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/FTRB customer slab/Page_ Fuse (Frontiersmb qa)/a_FTRB'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

//WebUI.sendKeys(findTestObject('txt_Comment'), Keys(Keys.return))
//WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
//    FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    'John')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Last Name _customer_last_name'), 
    'Scott')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Email _customer_email'), 'Miloiscool@testing.com')

//WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
//    '5645656587')

WebUI.waitForElementClickable(findTestObject('vznmb customer page/Page_ Fuse (verizonsmb qa)/span_Yes'), 0)

WebUI.click(findTestObject('VZN phone consent/Page_ Fuse (verizonsmb qa)/span_Yes'))

//WebUI.scrollToElement(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/button_Next'), 0)
//WebUI.click(findTestObject('VZN phone consent/Page_ Fuse (verizonsmb qa)/label_Yes'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1222 w athleen dr')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_City _customer_addresses_primary_city'), 
    'West Jordan')

WebUI.selectOptionByIndex(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/select_Alabama'), '45')

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/FTRB customer slab/Page_ Fuse (Frontiersmb qa)/span_Yes'))

WebUI.setText(findTestObject('Matts objects/Ftrb customer/Page_ Fuse (Frontiersmb qa)/input_Business Name _order_business_name'), 
    'Test company')

WebUI.click(findTestObject('Matts objects/Ftrb customer/Page_ Fuse (Frontiersmb qa)/span_NA'))

WebUI.click(findTestObject('Matts objects/FTRB customer slab/Page_ Fuse (Frontiersmb qa)/Page_ Fuse (Frontiersmb qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/h1_Products'), 0)

WebUI.setText(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/input_Frontier Order ID _frontierOrderID'), 
    '321654987')

WebUI.setText(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/input_Frontier Account Number _frontierAccountNumber'), 
    '123456789')

WebUI.setText(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/input_Installation Date _el-input__inner'), 
    '07/10/2022')

WebUI.selectOptionByIndex(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/select_8am-12pm9am-1pm10am-2pm11am-3pm12pm-4pm1pm-5pm'), 
    3)

WebUI.click(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/input_Available Products_form-control'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/Page_ Fuse (Frontiersmb qa)/a_CTF Internet - FiOS 300300'))

WebUI.delay(2)

WebUI.click(findTestObject('Matts objects/ftrb products/Page_ Fuse (Frontiersmb qa)/button_Next'))

WebUI.delay(3)

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Collect and confirm customer Name'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Repeat name of package package'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Mention to the customer about Upfront'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Read below Installation script for the'))

WebUI.scrollToElement(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Mention the Customer Service number- 1'), 
    0)

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Mention the Customer Service number- 1'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Read disclosure (NEW VERSION) for'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Read below SMB Terms  Conditions'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_If FIOS is Sold play the Frontier FIOS Installation'))

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/span_Pitch Home Security to the customerPitch'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/ftrb recaps 2/Page_ Fuse (Frontiersmb qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/ftrb summary page/Page_ Fuse (Frontiersmb qa)/a_Status Log'), 
    0)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Matts objects/ftrb summary page/Page_ Fuse (Frontiersmb qa)/button_Schedule'))

//WebUI.waitForElementClickable(findTestObject('Matts objects/ftrb summary page/Page_ Fuse (Frontiersmb qa)/a_Status Log'), 
//    0)
WebUI.verifyTextPresent('scheduled', false, FailureHandling.STOP_ON_FAILURE)

