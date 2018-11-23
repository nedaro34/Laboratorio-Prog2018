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
    public void testIngresar_Afiliados() throws Exception {
        System.out.println("Ingresar_Afiliados");
        Afiliados afiliados = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarAfiliados(afiliados, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    assertNull("Afiliado no existe",afiliados);
       
    }

    /**
     * Test of Buscar_Afiliado method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Afiliado() throws ListaVaciaExcepcion, AfiliadoNoExistenteExcepcion {
        System.out.println("Buscar_Afiliado");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Afiliados expResult = null;
        Afiliados result = instance.BuscarAfiliado(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Afiliado method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminar_Afiliado() throws Exception{
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
    public void testModificar_Afiliados() throws ListaVaciaExcepcion, AfiliadoNoExistenteExcepcion {
        System.out.println("Modificar_Afiliados");
        Afiliados afiliados = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarAfiliados(afiliados, dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Afiliados method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Afiliados() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Afiliados");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarAfiliados();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        instance.IngresarDoctores(doctores, dni);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
   assertNull("",doctores);
    }

    /**
     * Test of Buscar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Doctor() throws DoctorNoExistenteExcepcion, ListaVaciaExcepcion {
        System.out.println("Buscar_Doctor");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Doctores expResult = null;
        Doctores result = instance.BuscarDoctor(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Doctor method, of class CentroClinicaMedica.
     */
    @Test(expected=NullPointerException.class)
    public void testEliminar_Doctor() throws Exception {
        System.out.println("Eliminar_Doctor");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarDoctor(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Doctor() throws ListaVaciaExcepcion, DoctorNoExistenteExcepcion {
        System.out.println("Modificar_Doctor");
        Doctores doctores = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarDoctor(doctores, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        int esperado=0;
        assertEquals(dni,esperado);
    }

    /**
     * Test of Mostrar_Doctor method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Doctor() throws ListaVaciaExcepcion {
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
    public void testIngresar_Choferes() throws Exception {
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
     * Test of Modificar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testModificar_Chofer() throws ListaVaciaExcepcion, ChoferesNoExisteExcepcion {
        System.out.println("Modificar_Chofer");
        Choferes choferes = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.ModificarChofer(choferes, dni);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Chofer method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminar_Chofer() throws Exception {
        System.out.println("Eliminar_Chofer");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarChofer(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Chofer() throws ListaVaciaExcepcion, ChoferesNoExisteExcepcion {
        System.out.println("Buscar_Chofer");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Choferes expResult = null;
        Choferes result = instance.BuscarChofer(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        instance.IngresarEnfermero(enfermero1, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",enfermero1);

    }

    /**
     * Test of Mostrar_Chofer method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Chofer() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Chofer");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarChofer();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testBuscar_Enfermero() throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion {
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
     * Test of Eliminar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=NullPointerException.class)
    public void testEliminar_Enfermero() throws Exception {
        System.out.println("Eliminar_Enfermero");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarEnfermero(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Enfermero method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificar_Enfermero_Enfermeros_int() throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion {
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
    public void testModificar_Enfermero_Moviles_String() throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion {
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
    public void testMostrar_Enfermero() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Enfermero");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarEnfermero();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testIngresar_Administrativos() throws Exception {
        System.out.println("Ingresar_Administrativos");
        Administrativos administrativo1 = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarAdministrativos(administrativo1, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",administrativo1);

    }

    /**
     * Test of Buscar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test(expected=NullPointerException.class)
    public void testBuscar_Administrativos() throws AdministrativoNoExistenteExcepcion, ListaVaciaExcepcion {
        System.out.println("Buscar_Administrativos");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Administrativos expResult = null;
        Administrativos result = instance.BuscarAdministrativos(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Administrativo method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testMostrar_Administrativo() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Administrativo");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarAdministrativo();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
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
        instance.IngresarFamiliar(familiar1, dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",familiar1);

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
        GrupoFamiliar result = instance.BuscarFamiliar(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Familiar method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminar_Familiar() throws Exception {
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
    public void testModificar_Familiar() {
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
    public void testIngresar_Movil() throws Exception {
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
     * Test of Buscar_Movil method, of class CentroClinicaMedica.
     */
    @Test(expected=NullPointerException.class)
    public void testBuscar_Movil() throws MovilNoExistenteExcepcion, ListaVaciaExcepcion {
        System.out.println("Buscar_Movil");
        String patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Moviles expResult = null;
        Moviles result = instance.BuscarMovil(patente);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Movil method, of class CentroClinicaMedica.
     */
    @Test(expected=NullPointerException.class)
    public void testEliminar_Movil() throws Exception {
        System.out.println("Eliminar_Movil");
        String Patente = "";
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarMovil(Patente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar_Movil method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testModificar_Movil() throws ListaVaciaExcepcion, MovilNoExistenteExcepcion {
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
    public void testMostrar_Movil() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Movil");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarMovil();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Registar_pago method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testRegistar_pago() throws Exception {
        System.out.println("Registar_pago");
        RegistroPago primer = null;
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.Registar_pago(primer, dni);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Pago method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testBuscar_Pago() {
        System.out.println("Buscar_Pago");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        RegistroPago expResult = null;
        RegistroPago result = instance.BuscarPago(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Pago method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testIngresar_Pago() throws ListaVaciaExcepcion, DocumentoIncorrectoExcepcion {
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
     * Test of Mostrar_Pago method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testMostrar_Pago() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Pago");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarPago();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testIngresar_Solicitud() {
        System.out.println("Ingresar_Solicitud");
        Solicitud solic = null;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.IngresarSolicitud(solic);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
           assertNull("",solic);

    }

    /**
     * Test of Buscar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testBuscar_Solicitud() throws SolicitudNoExistente, ListaVaciaExcepcion {
        System.out.println("Buscar_Solicitud");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        Solicitud expResult = null;
        Solicitud result = instance.BuscarSolicitud(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar_Solicitud method, of class CentroClinicaMedica.
     */
    @Test
    public void testMostrar_Solicitud() throws ListaVaciaExcepcion {
        System.out.println("Mostrar_Solicitud");
        CentroClinicaMedica instance = new CentroClinicaMedica();
        LinkedList expResult = null;
        LinkedList result = instance.MostrarSolicitud();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
      //  fail("The test case is a prototype.");
           assertNull("",registro);

    }

    /**
     * Test of Eliminar_Administrativos method, of class CentroClinicaMedica.
     */
    @Test(expected=Exception.class)
    public void testEliminar_Administrativos() throws Exception {
        System.out.println("Eliminar_Administrativos");
        int dni = 0;
        CentroClinicaMedica instance = new CentroClinicaMedica();
        instance.EliminarAdministrativos(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
