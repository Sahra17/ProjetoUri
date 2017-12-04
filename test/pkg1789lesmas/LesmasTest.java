/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1789lesmas;

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
public class LesmasTest {
    
    public LesmasTest() {
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
     * Test of maior method, of class Lesmas.
     */
    @Test
    public void testMaior() {
        System.out.println("maior");
        int[] num = {10, 10, 10, 10, 15, 18, 20, 15, 11, 10};
        String expResult = "Nível 3";
        String result = Lesmas.maior(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of nivel method, of class Lesmas.
     */
    @Test
    public void testNivel() {
        System.out.println("nivel");
        int maior = 20;
        String expResult = "Nível 3";
        String result = Lesmas.nivel(maior);
        assertEquals(expResult, result);
    
    }
    
           /**
     * Test of maior method, of class Lesmas.
     */
    @Test
    public void testMaior2() {
        System.out.println("maior");
        int[] num = {1, 5, 2, 9, 5, 5, 8, 4, 4, 3};
        String expResult = "Nível 1";
        String result = Lesmas.maior(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of nivel method, of class Lesmas.
     */
    @Test
    public void testNivel2() {
        System.out.println("nivel");
        int maior = 9;
        String expResult = "Nível 1";
        String result = Lesmas.nivel(maior);
        assertEquals(expResult, result);
    
    }
    
           /**
     * Test of maior method, of class Lesmas.
     */
    @Test
    public void testMaior3() {
        System.out.println("maior");
        int[] num = {19, 9, 1, 4, 5, 8, 6, 11, 9, 7};
        String expResult = "Nível 2";
        String result = Lesmas.maior(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of nivel method, of class Lesmas.
     */
    @Test
    public void testNivel3() {
        System.out.println("nivel");
        int maior = 19;
        String expResult = "Nível 2";
        String result = Lesmas.nivel(maior);
        assertEquals(expResult, result);
    
    }

}
