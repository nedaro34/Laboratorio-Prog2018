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
 * @author TAPIA
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
     * Test of suma_familia method, of class Afiliados.
     */
    @Test
    public void testSuma_familia() {
        Afiliados nuevo = new Afiliados (4,"Lautaro","Tapia","Catamarca","25/09/1991",123456789,"123456","ejemplo@gmail.com");
        int ExpResultado = 5;
        nuevo.suma_familia();
        int Resultado = nuevo.getFamilia();
        assertEquals(ExpResultado,Resultado);
    }

    /**
     * Test of restar_familia method, of class Afiliados.
     */
    @Test
    public void testRestar_familia() {
        Afiliados nuevo = new Afiliados (4,"Lautaro","Tapia","Catamarca","25/09/1991",123456789,"123456","ejemplo@gmail.com");
        int ExpResultado = 3;
        nuevo.restar_familia();
        int Resultado = nuevo.getFamilia();
        assertEquals(ExpResultado,Resultado);
    }
    
}
