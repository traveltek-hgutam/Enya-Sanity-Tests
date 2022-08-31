import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enya.traveltekdev.com/')

WebUI.setText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/input_Destination_destination-auto-suggest-input'), 
    'Northern Europe')

WebUI.click(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/label_Departure Start Date'))

WebUI.click(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/h1_Traveltek Cruise Search'), 
    'Traveltek Cruise Search')

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/h1_Traveltek Cruise Search'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/h1_Traveltek Cruise Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Filter'), 'Filter')

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Ship Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/div_searchsearch'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/div_resultsresults'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Results'), 'Results')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Price range'), 'Price range')

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/img_(found 980, showing 980)_ms-Image-image_74fe7e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Northern Europe Andscandinavia'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/i_'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/i__1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/i__1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/i__1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Itinerary'), 'Itinerary:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Select'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_PRICES FROM'), 'PRICES FROM:')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Call us to book. or something, tbc'), 
    'Call us to book... or something, tbc')

WebUI.rightClick(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/div_Tax is NOT included in pricing displayed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/div_Northern Europe Andscandinavia2 Jul 202_f8e9b1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/img_Northern Europe Andscandinavia_ms-Image_a39bd3'))

WebUI.click(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/i__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/button_Select'))

WebUI.setText(findTestObject('Enya Cruise Journey/Page_Cruise Search/input_Passenger 1_TextField3008'), '25')

WebUI.setText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/input_Passenger 2_TextField3013'), 
    '25')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Passenger Information'), 
    'Passenger Information')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/label_No. of Passengers'), 
    'No. of Passengers')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/h2_Passenger Ages'), 'Passenger Ages')

WebUI.verifyElementPresent(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/label_Passenger 1'), 'Passenger 1')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/label_Passenger 2'), 'Passenger 2')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/h2_Rates'), 'Rates')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/h2_Cabins'), 'Cabins')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Military Rates'), 
    'Military Rates')

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Residential Rates'), 
    'Residential Rates')

WebUI.verifyElementClickable(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/span_Confirm'), 'Cancel')

WebUI.verifyElementClickable(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Enya Cruise Journey/Page_Cruise Search/button_Confirm'))

WebUI.takeScreenshot('')

WebUI.closeBrowser()

