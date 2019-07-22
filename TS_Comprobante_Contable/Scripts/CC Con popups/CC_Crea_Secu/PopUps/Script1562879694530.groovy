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

if (XLS_Tipo_Cuenta == 'Vencimiento') {
    if (XLS_CreaVencimiento == 'SI') {
        WebUI.click(findTestObject('Page_iSiigo/btn_Muestra_PopUp'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Page_iSiigo/PopUp Vencimiento/Page_iSiigo/rbtn_Accion_Vencimiento_1'))

        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/txt_Prefijo_Vencimiento'), 
            XLS_Prefijo_Vencimiento)

        WebUI.setText(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/txt_Concecutivo_Vencimiento'), 
            XLS_numero_documento)

        WebUI.setText(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/txt_No_Cuota_Vencimiento'), 
            XLS_vencimiento)

        WebUI.click(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/btn_Limpiar_Fecha_Vencimiento'))

        WebUI.setText(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/txt_Fecha_Vencimiento'), 
            XLS_Fecha_Vencimiento)

        WebUI.click(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/btn_Guardar_Vencimeinto'))
    } else if (XLS_CreaVencimiento == 'NO') {
    }
} else if (XLS_Tipo_Cuenta == 'Inventario') {
    WebUI.click(findTestObject('Page_iSiigo/btn_Muestra_PopUp'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/txt_Producto_PopUp'), XLS_Producto)

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/lst_Producto_PopUp'))

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/set_Bodega_PopUp'), 
        XLS_BodegaProducto, true)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/set_Accion_Producto_PopUp'), 
        XLS_AccionProducto, true)

    WebUI.setText(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/txt_Cantidad_PopUp'), XLS_BodegaProducto)

    WebUI.setText(findTestObject('Page_iSiigo/PopUp Producto/Page_iSiigo/txt_Valor_Producto_PopUp (1)'), XLS_ValorProducto)

    WebUI.click(findTestObject('Object Repository/Page_iSiigo/PopUp Producto/Page_iSiigo/btn_Guardar_Producto_PopUp'))
}

com.sun.org.apache.xpath.internal.operations.String AccionProducto(def XLS_AccionProducto) {
    if (XLS_AccionProducto == '-') {
        XLS_AccionProducto = '0'
    } else if (XLS_AccionProducto == '+') {
        XLS_AccionProducto = '1'
    }
    
    return XLS_AccionProducto
}

