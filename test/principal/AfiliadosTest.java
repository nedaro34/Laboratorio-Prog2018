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
public class AfiliadosTest {
    
    public AfiliadosTest() {
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
     * Test of getFamilia method, of class Afiliados.
     */
    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        Afiliados instance = null;
        int expResult = 0;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamilia method, of class Afiliados.
     */
    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int familia = 0;
        Afiliados instance = null;
        instance.setFamilia(familia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma_familia method, of class Afiliados.
     */
    @Test
    public void testSuma_familia() {
        System.out.println("suma_familia");
        Afiliados instance = null;
        instance.suma_familia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar_familia method, of class Afiliados.
     */
    @Test
    public void testRestar_familia() {
        System.out.println("restar_familia");
        Afiliados instance = null;
        instance.restar_familia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
