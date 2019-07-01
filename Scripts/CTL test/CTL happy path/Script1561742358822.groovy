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

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'centurylink.qa@clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('All screen pop updated/Page_ Fuse all screen pop updated/a_EMBARQ'))

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

WebUI.click(findTestObject('CTL full order/Page_ Fuse (Matthew Browning)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/CTL products page/Page_ Fuse (Centurylink qa)/h1_Products'), 90)

WebUI.scrollToElement(findTestObject('Matts objects/CTL products page/Page_ Fuse (Centurylink qa)/button_select'), 0)

WebUI.click(findTestObject('Matts objects/CTL products page/Page_ Fuse (Centurylink qa)/button_select'))

WebUI.scrollToElement(findTestObject('Matts objects/CTL products page/Page_ Fuse (Centurylink qa)/button_Next'), 0)

WebUI.click(findTestObject('Matts objects/CTL products page/Page_ Fuse (Centurylink qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/h1_CreditCheck'), 
    0)

WebUI.setText(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/input_Date of Birth _el-input__inner'), 
    '10041962')

WebUI.setText(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/input_SSN _order_ssn'), '411111111')

WebUI.selectOptionByIndex(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/select_Self InstallationProfessional Installation'), 
    '1')

WebUI.scrollToElement(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/span_Yes'), 0)

WebUI.click(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/span_Yes'))

WebUI.scrollToElement(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/button_Next'), 0)

WebUI.click(findTestObject('Matts objects/CTL credit check page/Page_ Fuse (Centurylink qa)/button_Next'))

WebUI.waitForElementVisible(findTestObject('Matts objects/CTL Addons/Page_ Fuse (Centurylink qa)/h1_Addons'), 120)

WebUI.click(findTestObject('Matts objects/CTL Addons/Page_ Fuse (Centurylink qa)/input_Addons_el-input__inner'))

