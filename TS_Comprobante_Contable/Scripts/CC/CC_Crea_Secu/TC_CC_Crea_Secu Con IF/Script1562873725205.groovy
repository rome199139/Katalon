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

WebUI.comment(XLS_No_Comprobante_Secu)

WebUI.comment(GlobalVariable.Var_Global_No_Comp)

if (GlobalVariable.Var_Global_No_Comp == XLS_No_Comprobante_Secu) {
    WebUI.comment('Si entro')

    WebUI.comment(GlobalVariable.Var_Global_No_Comp)

    WebUI.comment(XLS_Secuencia)

    WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Concepto_Contable'), XLS_Cuenta)

    WebUI.click(findTestObject('Object Repository/Page_iSiigo/lst_Concepto_Contable'))

    try {
        WebUI.click(findTestObject('Object Repository/Page_iSiigo/btn_Borrar_Tercero'))
    }
    catch (Exception e) {
    } 
    
    WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Tercero'), XLS_NitTercero)

    WebUI.click(findTestObject('Object Repository/Page_iSiigo/lst_Tercero'))

    if (XLS_Debito_o_Credito == 'D') {
        WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Debito'), XLS_Valor)
    } else if (XLS_Debito_o_Credito == 'C') {
        WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Credito'), XLS_Valor)
    }
    
    WebUI.click(findTestObject('Object Repository/Page_iSiigo/btn_Adicionar_Item'))
} else {
    WebUI.comment('No entro')

    WebUI.comment(GlobalVariable.Var_Global_No_Comp)
}

WebUI.comment('No entro')

WebUI.comment(GlobalVariable.Var_Global_No_Comp)

