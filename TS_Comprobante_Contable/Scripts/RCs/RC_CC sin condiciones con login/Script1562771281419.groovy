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

WebUI.comment(Direccion)

WebUI.callTestCase(findTestCase('TS_Login/TC_Login'), [('Direccion') : Direccion, ('Usuario') : '', ('Contrasena') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TS_Menu/TC_Menu_CC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CC/CC_Crea_Enca/TC_CC_Crea_Enca'), [('XLS_No_Comprobante_Enca') : '', ('XLS_Tipo_Comprobante') : ''
        , ('XLS_Maneja_Numeracion_Automatica') : '', ('XLS_Numero_Documento') : '', ('XLS_Digita_Valida') : '', ('XLS_Fecha_Ano') : ''
        , ('XLS_Fecha_Mes') : '', ('XLS_Fecha_Dia') : '', ('XLS_Maneja_Moneda_Extranjera') : '', ('XLS_Moneda_Extranjera') : ''
        , ('XLS_Valor_Tasa_Extranjera') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CC/CC_Crea_Secu/TC_CC_Crea_Secu Con IF'), [('XLS_No_Comprobante_Secu') : '21', ('XLS_Tipo_Cuenta') : ''
        , ('XLS_Cuenta') : '', ('XLS_Descripcion') : '', ('XLS_NitTercero') : '', ('XLS_Debito_o_Credito') : '', ('XLS_Valor') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CC/Crea_Pie/TC_Crea_Pie'), [('XLS_No_Comprobante_Enca') : '', ('XLS_Observaciones_Nota_Interna') : ''], 
    FailureHandling.STOP_ON_FAILURE)
