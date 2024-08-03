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

WebUI.navigateToUrl('https://www.fitpeo.com/')

WebUI.click(findTestObject('Object Repository/Validating_text_feild/Page_Remote Patient Monitoring (RPM) - fitpeo.com/svg_Home_MuiSvgIcon-root MuiSvgIcon-fontSiz_83d044'))

WebUI.click(findTestObject('Object Repository/Validating_text_feild/Page_Remote Patient Monitoring (RPM) - fitpeo.com/span_Revenue Calculator'))

WebUI.setText(findTestObject('Object Repository/Validating_text_feild/Page_Remote Patient Monitoring (RPM) - fitpeo.com/input_Medicare Eligible Patients_R57alklff9da'), 
    '560')

WebUI.click(findTestObject('Object Repository/Validating_text_feild/Page_Remote Patient Monitoring (RPM) - fitpeo.com/div_Medicare Eligible PatientsRPM and CCM P_cfee46'))

WebUI.closeBrowser()

