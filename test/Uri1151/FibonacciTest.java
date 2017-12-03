/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1151;

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
public class FibonacciTest {
    
    public FibonacciTest() {
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
     * Test of gerarFibonacci method, of class Fibonacci.
     */
    @Test
    public void testGerarFibonacci() {
        System.out.println("0 1 1 2 3");
        int numero = 5;
        Fibonacci instance = new Fibonacci();
        String expResult = "0 1 1 2 3";
        String result = instance.gerarFibonacci(numero);
        assertEquals(expResult, result);

    }
    
}
