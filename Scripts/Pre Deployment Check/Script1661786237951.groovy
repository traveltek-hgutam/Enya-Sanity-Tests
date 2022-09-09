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
import java.time.format.DateTimeFormatter as DateTimeFormatter
import com.github.kklisura.cdt.protocol.commands.Page as Page
import com.github.kklisura.cdt.protocol.commands.Runtime as Runtime
import com.github.kklisura.cdt.protocol.events.runtime.ConsoleAPICalled as ConsoleAPICalled
import com.github.kklisura.cdt.protocol.events.runtime.ConsoleAPICalledType as ConsoleAPICalledType
import com.github.kklisura.cdt.protocol.types.runtime.RemoteObject as RemoteObject
import com.github.kklisura.cdt.services.ChromeDevToolsService as ChromeDevToolsService
import com.google.gson.Gson as Gson
import com.google.gson.GsonBuilder as GsonBuilder
//import com.katalon.cdp.CdpUtils
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.logging.LogEntry as LogEntry
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType

Gson gson = new GsonBuilder().setPrettyPrinting().create()


WebUI.openBrowser('')

//ChromeDevToolsService devToolsService = CdpUtils.getService()
//
///** Get indivisual CDP commands */
//Page page = devToolsService.getPage()
//
//Runtime runtime = devToolsService.getRuntime()
//
//page.enable()
//
//runtime.enable()
//
///** Listen to the events that JavaScript console.log(msg) was called on the web page */
//runtime.onConsoleAPICalled({ ConsoleAPICalled event ->
//        // println gson.toJson(event)     // for debug
//        ConsoleAPICalledType type = event.getType()
//
//        List<RemoteObject> args = event.getArgs()
//
//        for (def rm : args) {
//            KeywordUtil.logInfo(">>>$type.toString() $rm.getValue()")
//        }
//    })
//
///** Wait for on load event */
//page.onLoadEventFired({ def event ->
//        // Evaluate javascript
//        devToolsService.close()
//    })

WebUI.navigateToUrl(GlobalVariable.urlCruise)

WebDriver driver = DriverFactory.getWebDriver()

LogEntries logs = driver.manage().logs().get('browser')

for (LogEntry entry : logs) {
    println(">>> $entry")
}

WebUI.takeScreenshotAsCheckpoint('SearchPage')

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/input_Destination_destination-auto-suggest-input'), 'Northern Europe')

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/label_Departure Start Date'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/h1_Traveltek Cruise Search'), 'Traveltek Cruise Search')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/h1_Traveltek Cruise Search'))

WebUI.waitForElementVisible(findTestObject('Page_Cruise Search/span_Results'), 15)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Filter'), 'Filter')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Ship Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/div_searchsearch'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/div_resultsresults'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Results'), 'Results')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Price range'), 'Price range')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/img_(found 980, showing 980)_ms-Image-image_74fe7e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Northern Europe Andscandinavia'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i_'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Itinerary'), 'Itinerary:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Select'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_PRICES FROM'), 'PRICES FROM:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Call us to book. or something, tbc'), 
    'Call us to book... or something, tbc')

WebUI.takeScreenshotAsCheckpoint('Results Page')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/div_Northern Europe Andscandinavia2 Jul 202_f8e9b1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/img_Northern Europe Andscandinavia_ms-Image_a39bd3'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/i__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/button_Select'))

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/input_Passenger 1_TextField3008'), '25')

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/input_Passenger 2_TextField3013'), '25')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Passenger Information'), 'Passenger Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/label_No. of Passengers'), 'No. of Passengers')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/h2_Passenger Ages'), 'Passenger Ages')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/label_Passenger 1'), 'Passenger 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/label_Passenger 2'), 'Passenger 2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/h2_Rates'), 'Rates')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Military Rates'), 'Military Rates')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Residential Rates'), 'Residential Rates')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Confirm'), 'Cancel')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/button_Confirm'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Cruise Search/button_Confirm'))

WebUI.navigateToUrl('https://enya.traveltekdev.com/sailing/?cruiseId=Y228')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/h1_Traveltek Cruise Search'), 'Traveltek Cruise Search')

WebUI.delay(15)

WebUI.waitForElementVisible(findTestObject('Page_Cruise Search/div_searchsearch'), 15)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/a_searchsearch'), 'search')

WebUI.verifyElementText(findTestObject('Page_Cruise Search/div_resultsresults'), 'results')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_sailingsailing'), 'sailing')

WebUI.takeScreenshotAsCheckpoint('Sailing Page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Information'), 'Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Id'), 'Cruise Id:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Departing Date'), 'Departing Date:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Returning Date'), 'Returning Date:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Duration'), 'Duration:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Sea Days'), 'Sea Days:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Round Trip'), 'Round Trip:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Line'), 'Cruise Line:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Ship'), 'Cruise Ship:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Grades'), 'Grades')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Itinerary_1'), 'Itinerary')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabin Grade'), 'Cabin Grade')

WebUI.verifyElementPresent(findTestObject('Page_Cruise Search/span_British Isles with Portland (for Stonehenge)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_G322N'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_13062023'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_25062023'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/dd_2'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Yes'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Princess Cruises'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Regal Princess'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/button_View Passenger Info'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_View Passenger Info'), 'View Passenger Info')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/a_18888.00'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/a_18888.00'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cruise Search/span_Cabins'), 15)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/a_searchsearch'), 'search')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_resultsresults'), 'results')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_sailingsailing'), 'sailing')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_cabincabin'), 'cabin')

WebUI.takeScreenshotAsCheckpoint('Cabin Page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabins'), 'Cabins')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Information'), 'Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Departing'), 'Departing:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Returning'), 'Returning:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Duration'), 'Duration:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Line'), 'Cruise Line:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Ship'), 'Cruise Ship:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabin Grade_1'), 'Cabin Grade:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Grade Description'), 'Grade Description:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabin Rate'), 'Cabin Rate:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Rate Description'), 'Rate Description:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_View Passenger Info_1'), 'View Passenger Info')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/button_View Passenger Info'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Guaranteed Cabin'), 'Guaranteed Cabin')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/th_Grade'), 'Grade')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/th_Cabin'), 'Cabin')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/td_Guaranteed Cabin'), 'Guaranteed Cabin')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/td_Guaranteed Cabin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Select Cabin'), 'Select Cabin')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Select Deck'), 'Select Deck')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/span_Select Deck'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabin'), 'Cabin')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Deck'), 'Deck')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Location'), 'Location')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Obstruction'), 'Obstruction')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Accessibility'), 'Accessibility')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/div_'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Bedding'), 'Bedding')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/label_Bedding Options'), 'Bedding Options')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Select bedding'), 'Select bedding')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/span_Select bedding'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Dining'), 'Dining')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/label_Dining Options'), 'Dining Options')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Select dining option'), 'Select dining option')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/span_Select dining option'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Special Requests'), 'Special Requests')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_(optional)'), '(optional)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/label_Special Requests'), 'Special Requests')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/p_Characters remaining 500'), 'Characters remaining: 500')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/button_Confirm'), 'Confirm')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/button_Confirm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/textarea_Special Requests_special-request-input'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_Confirm_1'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/input_Guaranteed Cabin_GUAR-cabin-radio'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_Select bedding'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_TWINS'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_Select dining option'))

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_Reserve in Medallion App'))

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/textarea_t'), 't')

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/textarea_te'), 'te')

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/textarea_tes'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Cruise Search/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Cruise Search/span_Confirm_1'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cruise Search/span_OrderBasket'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_searchsearch'), 'search')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_resultsresults'), 'results')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_sailingsailing'), 'sailing')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/a_cabincabin'), 'cabin')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_orderorder'), 'order')

WebUI.takeScreenshotAsCheckpoint('Order Page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_OrderBasket'), 'Order/Basket')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Itinerary'), 'Itinerary:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabin Type'), 'Cabin Type:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cabin Number'), 'Cabin Number:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Deck_1'), 'Deck:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Rate Code'), 'Rate Code:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Id'), 'Cruise Id:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Supplier Name'), 'Supplier Name:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Ship Name_1'), 'Ship Name:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Hold Time Info'), 'Hold Time Info')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1_2_3_4_5'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Refresh'), 'Refresh')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1_2_3_4_5_6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/span_Pricing Information'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cruise Search/button_Cancellation Policy'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Pricing Information_1'), 'Pricing Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cancellation Policy'), 'Cancellation Policy')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Summary'), 'Summary')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Cruise Fare'), 'Cruise Fare')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Non-commissionable Fare'), 'Non-commissionable Fare')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Tax  Fees'), 'Tax & Fees')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_Caribbean CruiseCruise Fare2055.00Non-c_0bf4ce'), 
    'Caribbean CruiseCruise Fare$2055.00Non-commissionable Fare$100.00Tax & Fees$200.00Discount-??.00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Total'), 'Total')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_On-Board Credit'), 'On-Board Credit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Deposit'), 'Deposit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Commission'), 'Commission')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Profit'), 'Profit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Nett Fare'), 'Nett Fare')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/div_Passenger Summary'), 'Passenger Summary')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Lead Passenger'), 'Lead Passenger')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Passenger 2'), 'Passenger 2')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1_2_3_4_5_6_7'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/i__1_2_3_4_5_6_7'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Contact Details'), 'Contact Details')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_Make Payment'), 'Make Payment')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/button_Make Payment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/div_Caribbean Cruise2023-05-13 - 2023-05-20_54dbe3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cruise Search/span_Inside with Shower'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cruise Search/span_123'), '123')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_9 - Dolphin'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_N342'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Princess'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cruise Search/span_Caribbean Princess'), 0)

//devToolsService.waitUntilClosed()
//
//WebUI.delay(3)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

