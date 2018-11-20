/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
public class FechaTest {
    
    public FechaTest() {
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
     * Test of getDia method, of class Fecha.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Fecha instance = null;
        int expResult = 0;
        int result = instance.getDia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDia method, of class Fecha.
     */
    @Test
    public void testSetDia() {
        System.out.println("setDia");
        int dia = 0;
        Fecha instance = null;
        instance.setDia(dia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Fecha.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Fecha instance = null;
        int expResult = 0;
        int result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMes method, of class Fecha.
     */
    @Test
    public void testSetMes() {
        System.out.println("setMes");
        int mes = 0;
        Fecha instance = null;
        instance.setMes(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAño method, of class Fecha.
     */
    @Test
    public void testGetAño() {
        System.out.println("getA\u00f1o");
        Fecha instance = null;
        int expResult = 0;
        int result = instance.getAño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAño method, of class Fecha.
     */
    @Test
    public void testSetAño() {
        System.out.println("setA\u00f1o");
        int año = 0;
        Fecha instance = null;
        instance.setAño(año);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
