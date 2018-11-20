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
 * @author alumno
 */
public class PagoTest {
    
    public PagoTest() {
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
     * Test of getNombre method, of class Pago.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pago instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Pago.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Pago instance = null;
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Pago.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Pago instance = null;
        int expResult = 0;
        int result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Pago.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 0;
        Pago instance = null;
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNuevo method, of class Pago.
     */
    @Test
    public void testGetNuevo() {
        System.out.println("getNuevo");
        Pago instance = null;
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getNuevo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNuevo method, of class Pago.
     */
    @Test
    public void testSetNuevo() {
        System.out.println("setNuevo");
        LinkedList<String> nuevo = null;
        Pago instance = null;
        instance.setNuevo(nuevo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAño method, of class Pago.
     */
    @Test
    public void testGetAño() {
        System.out.println("getA\u00f1o");
        Pago instance = null;
        int expResult = 0;
        int result = instance.getAño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAño method, of class Pago.
     */
    @Test
    public void testSetAño() {
        System.out.println("setA\u00f1o");
        int año = 0;
        Pago instance = null;
        instance.setAño(año);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class Pago.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        Pago instance = null;
        int expResult = 0;
        int result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class Pago.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int cont = 0;
        Pago instance = null;
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
