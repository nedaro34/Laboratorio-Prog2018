/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFrame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author alumno
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({jFrame.jAsistenciaMedicaTest.class, jFrame.jAdministractivoTest.class, jFrame.jAfiliadosTest.class, jFrame.jPagoTest.class, jFrame.jChoferTest.class, jFrame.jLoginTest.class, jFrame.jEmpleadosTest.class, jFrame.jInicioTest.class, jFrame.jGrupoFamiliarTest.class, jFrame.jDoctorTest.class, jFrame.jEmfermeroTest.class, jFrame.jMovilTest.class})
public class JFrameSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
