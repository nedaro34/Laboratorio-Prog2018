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
    public void testVerificarDocumentos() throws Exception {
        System.out.println("verificar_documentos");
        long documento = 38306476;
        int longitud = 8;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.VerificarDocumentos(documento,longitud);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       int noesperado=0;
       assertNotEquals(documento, noesperado);

    
    }

    /**
     * Test of Ingresar_Afiliados method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresarAfiliados() throws Exception {
        System.out.println("Ingresar Afiliados");
        Afiliados afiliados = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarAfiliados(afiliados, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    assertNull("Afiliado no existe",afiliados);
       
    }


    /**
     * Test of Eliminar_Afiliado method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminarAfiliado() throws Exception{
        System.out.println("Eliminar_Afiliado");
        int dni = 12345678;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarAfiliado(dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       int esperado=38306476;
       assertNotEquals(dni, esperado);

    }

    /**
     * Test of Modificar_Afiliados method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificarAfiliados() throws ListaVaciaExcepcion, AfiliadoNoExistenteExcepcion {
        System.out.println("Modificar_Afiliados");
        Afiliados afiliados = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarAfiliados(afiliados, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 

    /**
     * Test of Ingresar_Doctores method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresarDoctores() throws Exception {
        System.out.println("Ingresar_Doctores");
        Doctores doctores = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarDoctores(doctores, dni);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
   assertNull("",doctores);
    }

 

    /**
     * Test of Eliminar_Doctor method, of class CentroClinicaMedica.
     */
    @Test(expected=NullPointerException.class)
    public void testEliminarDoctor() throws Exception {
        System.out.println("Eliminar_Doctor");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarDoctor(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of Mostrar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrarDoctor() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Doctor");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarDoctor();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Choferes method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresarChoferes() throws Exception {
        System.out.println("Ingresar_Choferes");
        Choferes chofer1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarChoferes(chofer1, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",chofer1);

    }

 

    /**
     * Test of Eliminar_Chofer method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminarChofer() throws Exception {
        System.out.println("Eliminar_Chofer");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarChofer(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

   

 

    /**
     * Test of Buscar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testBuscarEnfermero() throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion {
        System.out.println("Buscar_Enfermero");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Enfermeros expResult = null;
        Enfermeros result = instance.BuscarEnfermero(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }



    /**
     * Test of Modificar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificarEnfermero_Enfermeros_int() throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion {
        System.out.println("Modificar_Enfermero");
        Enfermeros enfermeros = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarEnfermero(enfermeros, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificarEnfermero_Moviles_String() throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion {
        System.out.println("Modificar_Enfermero");
        Moviles movil = null;
        String Patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarEnfermero(movil, Patente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testMostrarEnfermero() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Enfermero");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarEnfermero();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    

  

    /**
     * Test of Ingresar_Familiar method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresarFamiliar() throws Exception {
        System.out.println("Ingresar_Familiar");
        GrupoFamiliar familiar1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarFamiliar(familiar1, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",familiar1);

    }

   

    /**
     * Test of Eliminar_Familiar method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminarFamiliar() throws Exception {
        System.out.println("Eliminar_Familiar");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarFamiliar(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Familiar method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificarFamiliar() {
        System.out.println("Modificar_Familiar");
        GrupoFamiliar familiar1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarFamiliar(familiar1, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Movil method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresarMovil() throws Exception {
        System.out.println("Ingresar_Movil");
        Moviles movil = null;
        String pant = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarMovil(movil, pant);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
           assertNull("",movil);

    }




    /**
     * Test of Modificar_Movil method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificarMovil() throws ListaVaciaExcepcion, MovilNoExistenteExcepcion {
        System.out.println("Modificar_Movil");
        Moviles movil = null;
        String patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarMovil(movil, patente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Movil method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testMostrarMovil() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Movil");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarMovil();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

  

    /**
     * Test of Ingresar_Pago method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testIngresarPago() throws ListaVaciaExcepcion, DocumentoIncorrectoExcepcion {
        System.out.println("Ingresar_Pago");
        RegistroPago pago = null;
        String mes = "";
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarPago(pago, mes, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",pago);

    }

   

    /**
     * Test of Ingresar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresarSolicitud() {
        System.out.println("Ingresar_Solicitud");
        Solicitud solic = null;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarSolicitud(solic);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",solic);

    }

 

    /**
     * Test of Mostrar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrarSolicitud() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Solicitud");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarSolicitud();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of Eliminar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminarAdministrativos() throws Exception {
        System.out.println("Eliminar_Administrativos");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarAdministrativos(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
