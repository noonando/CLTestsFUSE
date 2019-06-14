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

WebUI.openBrowser('uatfuse.clearlink.com')

WebUI.setText(findTestObject('UAT login/Page_Clearlink Authentication/input_to Fuse (Dev)_usr'), 'verizonsmb.qa@clearlink.com')

WebUI.setText(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/input_to Fuse (Dev)_pwd'), 'Clink2019')

WebUI.click(findTestObject('REST examples/uatlogin1/Page_Clearlink Authentication/button_Login'))

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
WebUI.delay(3)
=======
WebUI.delay(2)
>>>>>>> branch 'master' of https://github.com/noonando/CLTestsFUSE.git

WebUI.click(findTestObject('All screen pop updated/Page_ Fuse all screen pop updated/a_VZNB'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Verizon SMB Object repo/Scotts Repo/Page_ Fuse (verizonsmb qa)/div_Yes'), FailureHandling.OPTIONAL)

WebUI.delay(2)

//WebUI.sendKeys(findTestObject('txt_Comment'), Keys(Keys.return))
WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_First Name _customer_first_name'), 
    'Changedagain4')
WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Last Name _customer_last_name'), 
    'Person3')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Email _customer_email'), 'Miloiscool@testing.com')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Phone _customer_phone_numbers_primary_phone_number'), 
    '5645656587')

WebUI.click(findTestObject('Verizon SMB Object repo/Scotts Repo/Page_ Fuse (verizonsmb qa)/div_Yes'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Street Address _customer_addresses_primary_line1'), 
    '1222 w athleen dr')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_City _customer_addresses_primary_city'), 
    'West Jordan')

WebUI.selectOptionByIndex(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/select_Alabama'), '45')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Business Name _customer_business_name'), 
    'Milo is cool so let him buy the things you need')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/button_Next'), 0)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/button_Next'))

<<<<<<< HEAD
WebUI.delay(5)
=======
WebUI.delay(2)

WebUI.click(findTestObject('CTL full order/Page_ Fuse (Matthew Browning)/label_Yes'))
>>>>>>> branch 'master' of https://github.com/noonando/CLTestsFUSE.git

//>>>>>>> branch 'master' of https://github.com/noonando/CLTestsFUSE.git
WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Products'))

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Verizon Order Number (MON) _order_brand_account_number'), 
    '321654897')

WebUI.setText(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Installation Date _el-input__inner'), 
    '06/18/2020')

WebUI.selectOptionByIndex(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/select_8am-10am8am-12pm10am-12pm12pm-2pm12pm-4pm1pm-5pm'), 
    3)

WebUI.delay(3)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/input_Available Products_form-control'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/Page_ Fuse (verizonsmb qa)/a_Bus Digital Voice Solutions Bundle MTM'))

WebUI.delay(2)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/Page_ Fuse (verizonsmb qa)/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Collect and confirm customer Name (spell back) address primary Contact Number'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Collect and confirm alternate contact number email (spell back) if customer has one'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Business Digital Voice Only Advise the customer they will receive their equipment and a phone call 3 days prior to'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Credit Check Statement Must Be Read'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Life On FiOS - Do you have access to your email to go over your order with me'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Discuss FiOS mobile access app when TV is sold'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Customer Info (Collect Rebuttal Confirm) Customer Name Business name Address Primary Phone Alternate Email'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Package Name Products Sold (Phone internet TV etc) Package Details (Speed long distance etc) Equipment'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Monthly Recurring Pricing1st2nd Ye'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Order Number and BTN (not guaranteed until date of installation)'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Business Digital Voice Only Advise the customer they will receive their equipment and a phone call 3 days prior to'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Business Digital Voice Only Verizon Business Digital'))

WebUI.scrollToElement(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_First call resolution - I dont want you to have to call back so do you have any other questions for me'), 
    0)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Read Verbatim Only If LEC Phone Service Verizon wants you to know that you have a choice of'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Read Verbatim on all Phone Setups The fulfillment information you receive will also contain'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Read verbatim in Optix if set up MLB Extra Innings NHL Center Ice NFL Redzone etc'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Read Verbatim if Collecting Card Information Please read me the name as it appears on the card'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Provide wwwverizoncomwhatsnextbusiness to check order status'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_SMB Customer Service number 844-565-2532'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Offer Referral Program (Encourage to fill out while on the phone)'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Must get verbal permission to place order'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Pitch Home Security'))

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_First call resolution - I dont want you to have to call back so do you have any other questions for me'))

WebUI.delay(2)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/span_Summary'))

WebUI.delay(2)

WebUI.click(findTestObject('Verizon SMB Object repo/Page_ Fuse (verizonsmb qa)/button_Schedule'))

WebUI.closeBrowser()



