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
import Funciones_Generales as Funciones_Generales
import Prueba as Prueba


GlobalVariable.Var_Global_No_Comp = XLS_No_Comprobante_Enca

WebUI.comment(XLS_No_Comprobante_Enca)

WebUI.comment(GlobalVariable.Var_Global_No_Comp)

if (GlobalVariable.Var_Global_No_Comp == XLS_No_Comprobante_Enca) {
    WebUI.click(findTestObject('Page_iSiigo/set_Tipo_Comprobante'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Page_iSiigo/set_Tipo_Comprobante'), XLS_Tipo_Comprobante)

    WebUI.sendKeys(findTestObject('Page_iSiigo/set_Tipo_Comprobante'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Page_iSiigo/txt_Fecha_Ano'))

    WebUI.sendKeys(findTestObject('Page_iSiigo/txt_Fecha_Ano'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
            Keys.BACK_SPACE))

    WebUI.sendKeys(findTestObject('Page_iSiigo/txt_Fecha_Ano'), XLS_Fecha_Ano)

    WebUI.selectOptionByIndex(findTestObject('Page_iSiigo/set_Fecha_Mes'), XLS_Fecha_Mes, FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('Page_iSiigo/set_Fecha_Dia'), XLS_Fecha_Dia, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Page_iSiigo/lbl_Numeracion Automtica'), 0)

    if (XLS_Maneja_Moneda_Extranjera.equals('SI')) {
        WebUI.selectOptionByValue(findTestObject('Page_iSiigo/set_Moneda_Extrajera'), XLS_Moneda_Extranjera, true)
    }
}

Prueba.clickElement(findTestObject(null))

