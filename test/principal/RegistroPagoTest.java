/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TAPIA
 */
public class RegistroPagoTest {
    
    public RegistroPagoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of getFam_precio method, of class RegistroPago.
     */
    @Test
    public void testGetFam_precio() {
        System.out.println("getFam_precio");
        RegistroPago instance = null;
        int expResult = 0;
        int result = instance.getFam_precio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of Ingresar_Mes method, of class RegistroPago.
     */
    @Test
    public void testIngresar_Mes() throws Pago_mes_Igual_Excepcion {
        Afiliados afiliado = new Afiliados (4,"Lautaro","Tapia","Catamarca","25/09/1991",123456789,"123456","ejemplo@gmail.com");
        RegistroPago nuevo = new RegistroPago("Lautaro","Tapia",123456789,2018,500,4,afiliado);
        String mes = "9";
        nuevo.Ingresar_Mes(mes);
        
        
    }

    /**
     * Test of pago method, of class RegistroPago.
     */
    @Test
    public void testPago() {
        Afiliados afiliado = new Afiliados (4,"Lautaro","Tapia","Catamarca","25/09/1991",123456789,"123456","ejemplo@gmail.com");
        RegistroPago nuevo = new RegistroPago("Lautaro","Tapia",123456789,2018,500,4,afiliado);
        
      //  assertEquals(expResult, result);
        
    }

    /**
     * Test of mora method, of class RegistroPago.
     */
    @Test
    public void testMora() {
        Afiliados afiliado = new Afiliados (4,"Lautaro","Tapia","Catamarca","25/09/1991",123456789,"123456","ejemplo@gmail.com");
        RegistroPago nuevo = new RegistroPago("Lautaro","Tapia",123456789,2018,500,4,afiliado);

 
    }
    
}
