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

WebUI.navigateToUrl('https://uatsso.clearlink.com/v1/auth/?client_id=93689a31e7c577342a1ff51124fff9a57ad48ef455bd203fa1c37fd61fa16298&response_type=code&redirect_uri=http%3A%2F%2Fuatfuse.clearlink.com&scope=read+write&state=143f5199-8aac-473a-aedf-d36b3f588a83')

WebUI.setText(findTestObject('Object Repository/uatlogin1/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'matthew.browning@clearlink.com')

WebUI.setEncryptedText(findTestObject('Object Repository/uatlogin1/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 
    'h/wZhaWomj2B9M0yhkw6+g==')

WebUI.click(findTestObject('Object Repository/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'matthew.browning@clearlink.com')

WebUI.setText(findTestObject('uatlogin1/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2018%^')

