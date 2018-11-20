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
public class GrupoFamiliarTest {
    
    public GrupoFamiliarTest() {
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
     * Test of getAfiliado method, of class GrupoFamiliar.
     */
    @Test
    public void testGetAfiliado() {
        System.out.println("getAfiliado");
        GrupoFamiliar instance = null;
        Afiliados expResult = null;
        Afiliados result = instance.getAfiliado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAfiliado method, of class GrupoFamiliar.
     */
    @Test
    public void testSetAfiliado() {
        System.out.println("setAfiliado");
        Afiliados afiliado = null;
        GrupoFamiliar instance = null;
        instance.setAfiliado(afiliado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
