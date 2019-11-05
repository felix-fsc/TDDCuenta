
import cuenta.Cuenta;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;




public class CuentaTest {
    Cuenta cuenta;
    
    public CuentaTest() {
    }
    
   
    public static void setUpClass() {
    }
    
   
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cuenta = new Cuenta("0001.0002.12.1234567890", "Fulano de Tal",0);
                     }
    
  
    public void tearDown() {
    }

        @Test
    public void testIngresar_double()  {
        System.out.println("ingresar");
        double x = 1000.0;
        try {
        cuenta.ingresar(x);
        assertTrue(cuenta.getsaldo()==1000.0);
            }
        catch (Exception e)
        {
        
        }
     
                                               }
       @Test
    public void testRetirar_double() throws Exception {
        System.out.println("retirar");
        double x = 1000.0;
        try
        {
        cuenta.retirar(x);
        }
        catch (Exception e)
         {
        
        }
        assertTrue(cuenta.getsaldo()==-1000);
         }
   
}
