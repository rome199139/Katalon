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

WebUI.comment(GlobalVariable.Var_Global_No_Comp)

WebUI.comment(XLS_No_Comprobante_Secu)

WebUI.comment(XLS_Secuencia)

GlobalVariable.Var_Global_Secuencia = XLS_Secuencia

while (GlobalVariable.Var_Global_Secuencia == XLS_Secuencia) {
    if (XLS_No_Comprobante_Secu != GlobalVariable.Var_Global_No_Comp) {
        GlobalVariable.Var_Global_Secuencia = ''
    } else {
        while (XLS_No_Comprobante_Secu == GlobalVariable.Var_Global_No_Comp) {
            WebUI.comment(GlobalVariable.Var_Global_No_Comp)

            WebUI.comment(XLS_No_Comprobante_Secu)

            WebUI.comment(XLS_Secuencia)

            WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Concepto_Contable'), XLS_Cuenta)

            WebUI.delay(1)

            WebUI.click(findTestObject('Object Repository/Page_iSiigo/lst_Concepto_Contable'))

            try {
                WebUI.click(findTestObject('Object Repository/Page_iSiigo/btn_Borrar_Tercero'))
            }
            catch (Exception e) {
            } 
            
            WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Tercero'), XLS_NitTercero)

            WebUI.delay(1)

            WebUI.click(findTestObject('Object Repository/Page_iSiigo/lst_Tercero'))

            WebUI.callTestCase(findTestCase('CC Con popups/CC_Crea_Secu/PopUps'), [('XLS_Tipo_Cuenta') : XLS_Tipo_Cuenta
                    , ('XLS_Valor') : XLS_Valor, ('XLS_Secuencia') : XLS_Secuencia, ('XLS_CreaVencimiento') : XLS_CreaVencimiento
                    , ('XLS_Prefijo_Vencimiento') : XLS_Prefijo_Vencimiento, ('XLS_numero_documento') : XLS_numero_documento
                    , ('XLS_vencimiento') : XLS_vencimiento, ('XLS_Fecha_Vencimiento') : XLS_Fecha_Vencimiento, ('XLS_Producto') : XLS_Producto
                    , ('XLS_BodegaProducto') : XLS_BodegaProducto, ('XLS_CantidadProducto') : XLS_CantidadProducto, ('XLS_ValorProducto') : XLS_ValorProducto
                    , ('XLS_AccionProducto') : XLS_AccionProducto, ('XLS_Base_Impuesto') : XLS_Base_Impuesto, ('XLS_Impuesto') : XLS_Impuesto
                    , ('XLS_ActivoFijo') : XLS_ActivoFijo], FailureHandling.STOP_ON_FAILURE)

            if (XLS_Debito_o_Credito == 'D') {
                WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Debito'), XLS_Valor)
            } else if (XLS_Debito_o_Credito == 'C') {
                WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Credito'), XLS_Valor)
            }
            
            WebUI.click(findTestObject('Object Repository/Page_iSiigo/btn_Adicionar_Item'))

            WebUI.comment(GlobalVariable.Var_Global_No_Comp)

            WebUI.comment(XLS_No_Comprobante_Secu)

            GlobalVariable.Var_Global_Secuencia = ''

            XLS_No_Comprobante_Secu = ''
        }
    }
}

