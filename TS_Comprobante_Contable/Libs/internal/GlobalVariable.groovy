package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Toma el numero de comprobante de Crea Enca</p>
     */
    public static Object Var_Global_No_Comp
     
    /**
     * <p></p>
     */
    public static Object Var_Global_Secuencia
     
    /**
     * <p></p>
     */
    public static Object Valor
     
    /**
     * <p></p>
     */
    public static Object Var_Global_Flag
     
    /**
     * <p></p>
     */
    public static Object Var_GlobalFinDocu
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            Var_Global_No_Comp = selectedVariables['Var_Global_No_Comp']
            Var_Global_Secuencia = selectedVariables['Var_Global_Secuencia']
            Valor = selectedVariables['Valor']
            Var_Global_Flag = selectedVariables['Var_Global_Flag']
            Var_GlobalFinDocu = selectedVariables['Var_GlobalFinDocu']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
