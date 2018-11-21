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
public class CentroClinicaMedicaTest {
    
    public CentroClinicaMedicaTest() {
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
     * Test of verificar_documentos method, of class CentroClinicaMedica.
     */
    @Test
    public void testVerificar_documentos() throws Exception {
        System.out.println("verificar_documentos");
        long documento = 0L;
        int longitud = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.verificar_documentos(documento, longitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Afiliados method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Afiliados() throws Exception {
        System.out.println("Ingresar_Afiliados");
        Afiliados afiliados = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Afiliados(afiliados, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Afiliado method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Afiliado() {
        System.out.println("Buscar_Afiliado");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Afiliados expResult = null;
        Afiliados result = instance.Buscar_Afiliado(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Afiliado method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Afiliado() throws Exception {
        System.out.println("Eliminar_Afiliado");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Afiliado(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Afiliados method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Afiliados() {
        System.out.println("Modificar_Afiliados");
        Afiliados afiliados = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Afiliados(afiliados, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Afiliados method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Afiliados() {
        System.out.println("Mostrar_Afiliados");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Afiliados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Doctores method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Doctores() throws Exception {
        System.out.println("Ingresar_Doctores");
        Doctores doctores = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Doctores(doctores, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Doctor() {
        System.out.println("Buscar_Doctor");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Doctores expResult = null;
        Doctores result = instance.Buscar_Doctor(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Doctor() throws Exception {
        System.out.println("Eliminar_Doctor");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Doctor(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Doctor() {
        System.out.println("Modificar_Doctor");
        Doctores doctores = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Doctor(doctores, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Doctor() {
        System.out.println("Mostrar_Doctor");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Doctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Choferes method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Choferes() throws Exception {
        System.out.println("Ingresar_Choferes");
        Choferes chofer1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Choferes(chofer1, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Chofer() {
        System.out.println("Modificar_Chofer");
        Choferes choferes = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Chofer(choferes, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Chofer() throws Exception {
        System.out.println("Eliminar_Chofer");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Chofer(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Chofer() {
        System.out.println("Buscar_Chofer");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Choferes expResult = null;
        Choferes result = instance.Buscar_Chofer(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Enfermero() throws Exception {
        System.out.println("Ingresar_Enfermero");
        Enfermeros enfermero1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Enfermero(enfermero1, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Chofer() {
        System.out.println("Mostrar_Chofer");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Chofer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Enfermero() {
        System.out.println("Buscar_Enfermero");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Enfermeros expResult = null;
        Enfermeros result = instance.Buscar_Enfermero(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Enfermero() throws Exception {
        System.out.println("Eliminar_Enfermero");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Enfermero(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Enfermero_Enfermeros_int() {
        System.out.println("Modificar_Enfermero");
        Enfermeros enfermeros = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Enfermero(enfermeros, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Enfermero_Moviles_String() {
        System.out.println("Modificar_Enfermero");
        Moviles movil = null;
        String Patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Enfermero(movil, Patente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Enfermero() {
        System.out.println("Mostrar_Enfermero");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Enfermero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Administrativos() throws Exception {
        System.out.println("Ingresar_Administrativos");
        Administrativos administrativo1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Administrativos(administrativo1, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Administrativos() {
        System.out.println("Buscar_Administrativos");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Administrativos expResult = null;
        Administrativos result = instance.Buscar_Administrativos(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Administrativo method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Administrativo() {
        System.out.println("Mostrar_Administrativo");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Administrativo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Familiar method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Familiar() throws Exception {
        System.out.println("Ingresar_Familiar");
        GrupoFamiliar familiar1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Familiar(familiar1, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Familiar method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Familiar() {
        System.out.println("Buscar_Familiar");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        GrupoFamiliar expResult = null;
        GrupoFamiliar result = instance.Buscar_Familiar(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Familiar method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Familiar() throws Exception {
        System.out.println("Eliminar_Familiar");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Familiar(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Familiar method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Familiar() {
        System.out.println("Modificar_Familiar");
        GrupoFamiliar familiar1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Familiar(familiar1, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Movil method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Movil() throws Exception {
        System.out.println("Ingresar_Movil");
        Moviles movil = null;
        String pant = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Movil(movil, pant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Movil method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Movil() {
        System.out.println("Buscar_Movil");
        String patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Moviles expResult = null;
        Moviles result = instance.Buscar_Movil(patente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Movil method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Movil() throws Exception {
        System.out.println("Eliminar_Movil");
        String Patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Movil(Patente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Movil method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Movil() {
        System.out.println("Modificar_Movil");
        Moviles movil = null;
        String patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Modificar_Movil(movil, patente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Movil method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Movil() {
        System.out.println("Mostrar_Movil");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Movil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Registar_pago method, of class CentroClinicaMedica.
     */
    @Test
    public void testRegistar_pago() throws Exception {
        System.out.println("Registar_pago");
        RegistroPago primer = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Registar_pago(primer, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Pago method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Pago() {
        System.out.println("Buscar_Pago");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        RegistroPago expResult = null;
        RegistroPago result = instance.Buscar_Pago(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Pago method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Pago() {
        System.out.println("Ingresar_Pago");
        RegistroPago pago = null;
        String mes = "";
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Pago(pago, mes, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Pago method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Pago() {
        System.out.println("Mostrar_Pago");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Pago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Solicitud() {
        System.out.println("Ingresar_Solicitud");
        Solicitud solic = null;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Solicitud(solic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Solicitud() {
        System.out.println("Buscar_Solicitud");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Solicitud expResult = null;
        Solicitud result = instance.Buscar_Solicitud(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Solicitud() {
        System.out.println("Mostrar_Solicitud");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.Mostrar_Solicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Resultado method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Resultado() throws Exception {
        System.out.println("Ingresar_Resultado");
        Registro registro = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Ingresar_Resultado(registro, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test
    public void testEliminar_Administrativos() throws Exception {
        System.out.println("Eliminar_Administrativos");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Eliminar_Administrativos(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
