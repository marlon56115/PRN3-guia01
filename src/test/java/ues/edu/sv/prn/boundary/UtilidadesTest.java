/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.prn.boundary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marlon
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
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
     * Test of textualizar method, of class Utilidades.
     */
    @Test
    public void testTextualizar() {
        System.out.println("textualizar cosas raras");
        String marca = "fer";
        String modelo = "mas";
        String color = "ver";
        String anio = "2016";
        String tipo = "neg";
        Utilidades util = new Utilidades();
        String esperado = "el resultado es: "+"2016 Fer Mas Neg Ver";
        String result = util.textualizar(marca, modelo, color, anio, tipo);
        assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
