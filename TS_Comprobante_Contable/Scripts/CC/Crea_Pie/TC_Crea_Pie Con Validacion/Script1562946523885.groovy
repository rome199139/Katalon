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
import atu.testrecorder.media.Format as Format
import java.text.DecimalFormat as DecimalFormat

Var_Local_Total_Debitos = WebUI.getText(findTestObject('Page_iSiigo/lbl_Total_Debito'), FailureHandling.STOP_ON_FAILURE)

Var_Local_Total_Credito = WebUI.getText(findTestObject('Page_iSiigo/lbl_Total_Credito'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment(Var_Local_Total_Debitos)

WebUI.comment(Var_Local_Total_Credito)

WebUI.comment(XLS_Crea_Total_Debitos)

WebUI.comment(XLS_Crea_Total_Creditos)

WebUI.comment('Valida si es igual los debito con credito')

WebUI.verifyEqual(Var_Local_Total_Debitos, Var_Local_Total_Credito)

WebUI.comment('Valida si es igual al Excel')

WebUI.verifyEqual(XLS_Crea_Total_Debitos, Var_Local_Total_Debitos, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(XLS_Crea_Total_Creditos, Var_Local_Total_Credito, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_iSiigo/txt_Observaciones'), XLS_Observaciones_Nota_Interna)

WebUI.click(findTestObject('Object Repository/Page_iSiigo/btn_Guardar'))

WebUI.delay(10)

not_run: WebUI.callTestCase(findTestCase('CC/Crea_Pie/TC_Valida_Vista'), [('XLS_Moneda_Extranjera') : XLS_Moneda_Extranjera
        , ('XLS_Maneja_Moneda_Extranjera') : XLS_Maneja_Moneda_Extranjera, ('Local_Var_Label_Total') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: X = CulturaDecimalComaAPunto(X)

// Depends on default Locale
not_run: WebUI.comment(X // reemplaza todas las apariciones de '.' a ''
    ) // reemplaza todas las apariciones de '.' a ''
//Valor = Integer.toString(DComaValor)	
//Valor = DPuntoValor.ToString("#,##0.00");

