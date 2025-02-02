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

WebUI.click(findTestObject('Object Repository/Page_/i_Hola sudha_icon-arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_/a_Mi Cuenta'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/span_Direcciones'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Agregar direccin'))

RandomName = CustomKeywords.'com.customKeywords.myKeywords.randomString'()

RandomName = GlobalVariable.RandomName
WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Direccin de envo_shortName'), 'randomName')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Alias de la direccin_cp'), '12000')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Estado_city'), 'ciudad')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Colonia_street'), 'santafe')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Calle_numext'), '1232323432')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_y calle_cellphone'), '4223423423')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_text'), '1242342343')

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Guardar'))

