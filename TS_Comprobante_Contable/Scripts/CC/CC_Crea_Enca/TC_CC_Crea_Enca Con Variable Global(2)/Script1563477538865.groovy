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

WebUI.comment(GlobalVariable.Var_Global_Flag)

WebUI.comment(XLS_No_Comprobante_Enca)

WebUI.comment(XLS_No_Comprobante_Secu)

if (XLS_No_Comprobante_Enca == XLS_No_Comprobante_Secu) {
    GlobalVariable.Var_Global_No_Comp = XLS_No_Comprobante_Enca

    if (GlobalVariable.Var_Global_Flag == 'NO') {
        WebUI.comment(GlobalVariable.Var_Global_No_Comp)

        WebUI.comment(XLS_No_Comprobante_Enca)

        WebUI.comment(XLS_No_Comprobante_Secu)

        GlobalVariable.Var_Global_Flag = 'SI'

        WebUI.click(findTestObject('Page_iSiigo/set_Tipo_Comprobante'))

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('Page_iSiigo/set_Tipo_Comprobante'), XLS_Tipo_Comprobante)

        WebUI.sendKeys(findTestObject('Page_iSiigo/set_Tipo_Comprobante'), Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Page_iSiigo/txt_Fecha_Ano'))

        WebUI.sendKeys(findTestObject('Page_iSiigo/txt_Fecha_Ano'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
                Keys.BACK_SPACE))

        WebUI.sendKeys(findTestObject('Page_iSiigo/txt_Fecha_Ano'), XLS_Fecha_Ano)

        not_run: WebUI.selectOptionByValue(findTestObject('Page_iSiigo/set_Fecha_Mes'), XLS_Fecha_Mes, true)

        WebUI.sendKeys(findTestObject('Page_iSiigo/set_Fecha_Dia'), XLS_Fecha_Dia, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementPresent(findTestObject('Page_iSiigo/lbl_Numeracion Automtica'), 0)

        if (XLS_Maneja_Moneda_Extranjera.equals('SI')) {
            WebUI.selectOptionByValue(findTestObject('Page_iSiigo/set_Moneda_Extrajera'), XLS_Moneda_Extranjera, true)
        }
        
        WebUI.callTestCase(findTestCase('CC Con popups/CC_Crea_Secu/TC_CC_Crea_Secu Con While PopUps(2)'), [('XLS_No_Comprobante_Secu') : XLS_No_Comprobante_Secu
                , ('XLS_Tipo_Cuenta') : XLS_Tipo_Cuenta, ('XLS_Cuenta') : XLS_Cuenta, ('XLS_Descripcion') : XLS_Descripcion
                , ('XLS_NitTercero') : XLS_NitTercero, ('XLS_Debito_o_Credito') : XLS_Debito_o_Credito, ('XLS_Valor') : XLS_Valor
                , ('XLS_Secuencia') : XLS_Secuencia, ('XLS_CreaVencimiento') : XLS_CreaVencimiento, ('XLS_Prefijo_Vencimiento') : XLS_Prefijo_Vencimiento
                , ('XLS_numero_documento') : XLS_numero_documento, ('XLS_vencimiento') : XLS_vencimiento, ('XLS_Fecha_Vencimiento') : XLS_Fecha_Vencimiento
                , ('XLS_Producto') : XLS_Producto, ('XLS_BodegaProducto') : XLS_BodegaProducto, ('XLS_CantidadProducto') : XLS_CantidadProducto
                , ('XLS_ValorProducto') : XLS_ValorProducto, ('XLS_AccionProducto') : XLS_AccionProducto, ('XLS_Base_Impuesto') : XLS_Base_Impuesto
                , ('XLS_Impuesto') : XLS_Impuesto, ('XLS_ActivoFijo') : XLS_ActivoFijo], FailureHandling.STOP_ON_FAILURE)

        not_run: GlobalVariable.Var_Global_Flag = 'SI'
    } else {
        WebUI.callTestCase(findTestCase('CC Con popups/CC_Crea_Secu/TC_CC_Crea_Secu Con While PopUps(2)'), [('XLS_No_Comprobante_Secu') : XLS_No_Comprobante_Secu
                , ('XLS_Tipo_Cuenta') : XLS_Tipo_Cuenta, ('XLS_Cuenta') : XLS_Cuenta, ('XLS_Descripcion') : XLS_Descripcion
                , ('XLS_NitTercero') : XLS_NitTercero, ('XLS_Debito_o_Credito') : XLS_Debito_o_Credito, ('XLS_Valor') : XLS_Valor
                , ('XLS_Secuencia') : XLS_Secuencia, ('XLS_CreaVencimiento') : XLS_CreaVencimiento, ('XLS_Prefijo_Vencimiento') : XLS_Prefijo_Vencimiento
                , ('XLS_numero_documento') : XLS_numero_documento, ('XLS_vencimiento') : XLS_vencimiento, ('XLS_Fecha_Vencimiento') : XLS_Fecha_Vencimiento
                , ('XLS_Producto') : XLS_Producto, ('XLS_BodegaProducto') : XLS_BodegaProducto, ('XLS_CantidadProducto') : XLS_CantidadProducto
                , ('XLS_ValorProducto') : XLS_ValorProducto, ('XLS_AccionProducto') : XLS_AccionProducto, ('XLS_Base_Impuesto') : XLS_Base_Impuesto
                , ('XLS_Impuesto') : XLS_Impuesto, ('XLS_ActivoFijo') : XLS_ActivoFijo], FailureHandling.STOP_ON_FAILURE)
    }
} else if (GlobalVariable.Var_Global_Flag == 'SI') {
    WebUI.comment(XLS_No_Comprobante_Enca)

    WebUI.comment(XLS_No_Comprobante_Secu)

    WebUI.callTestCase(findTestCase('CC/Crea_Pie/TC_Crea_Pie'), [('XLS_No_Comprobante_Enca') : '', ('XLS_Observaciones_Nota_Interna') : ''], 
        FailureHandling.STOP_ON_FAILURE)

    GlobalVariable.Var_Global_Flag = 'NO'

    not_run: GlobalVariable.Var_GlobalFinDocu = 'NO'

    WebUI.callTestCase(findTestCase('TS_Menu/TC_Menu_CC'), [:], FailureHandling.STOP_ON_FAILURE)
}

