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
     * Test of getNombre method, of class RegistroPago.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        RegistroPago instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class RegistroPago.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        RegistroPago instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class RegistroPago.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        RegistroPago instance = null;
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class RegistroPago.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        RegistroPago instance = null;
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class RegistroPago.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        RegistroPago instance = null;
        int expResult = 0;
        int result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class RegistroPago.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 0;
        RegistroPago instance = null;
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class RegistroPago.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        RegistroPago instance = null;
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMes method, of class RegistroPago.
     */
    @Test
    public void testSetMes() {
        System.out.println("setMes");
        LinkedList<String> mes = null;
        RegistroPago instance = null;
        instance.setMes(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAño method, of class RegistroPago.
     */
    @Test
    public void testGetAño() {
        System.out.println("getA\u00f1o");
        RegistroPago instance = null;
        int expResult = 0;
        int result = instance.getAño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAño method, of class RegistroPago.
     */
    @Test
    public void testSetAño() {
        System.out.println("setA\u00f1o");
        int año = 0;
        RegistroPago instance = null;
        instance.setAño(año);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio_base method, of class RegistroPago.
     */
    @Test
    public void testGetPrecio_base() {
        System.out.println("getPrecio_base");
        RegistroPago instance = null;
        int expResult = 0;
        int result = instance.getPrecio_base();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio_base method, of class RegistroPago.
     */
    @Test
    public void testSetPrecio_base() {
        System.out.println("setPrecio_base");
        int precio_base = 0;
        RegistroPago instance = null;
        instance.setPrecio_base(precio_base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of setFam_precio method, of class RegistroPago.
     */
    @Test
    public void testSetFam_precio() {
        System.out.println("setFam_precio");
        int fam_precio = 0;
        RegistroPago instance = null;
        instance.setFam_precio(fam_precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAfiliado method, of class RegistroPago.
     */
    @Test
    public void testGetAfiliado() {
        System.out.println("getAfiliado");
        RegistroPago instance = null;
        Afiliados expResult = null;
        Afiliados result = instance.getAfiliado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAfiliado method, of class RegistroPago.
     */
    @Test
    public void testSetAfiliado() {
        System.out.println("setAfiliado");
        Afiliados afiliado = null;
        RegistroPago instance = null;
        instance.setAfiliado(afiliado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Mes method, of class RegistroPago.
     */
    @Test
    public void testIngresar_Mes() throws Exception {
        System.out.println("Ingresar_Mes");
        String pago_mes = "";
        RegistroPago instance = null;
        instance.Ingresar_Mes(pago_mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
