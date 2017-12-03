/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sahra
 */
public class PumTest {
    
    public PumTest() {
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
     * Test of gerarSequencia method, of class Pum.
     */
    @Test
    public void testGerarSequencia() {
        System.out.println("1 2 3 PUM\n" +"5 6 7 PUM\n" +"9 10 11 PUM\n" +"13 14 15 PUM\n" +
                            "17 18 19 PUM\n" +"21 22 23 PUM\n" +"25 26 27 PUM\n");
        int numero = 7;
        Pum instance = new Pum();
        String expResult = "1 2 3 PUM\n" +"5 6 7 PUM\n" +"9 10 11 PUM\n" +"13 14 15 PUM\n" +
                            "17 18 19 PUM\n" +"21 22 23 PUM\n" +"25 26 27 PUM\n";
        String result = instance.gerarSequencia(numero);
        assertEquals(expResult, result);
     
    }
    
}
