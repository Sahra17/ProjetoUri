/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1789lesmas;

import java.util.ArrayList;
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
        ArrayList<Integer> num = new ArrayList<Integer>(20);
        int expResult = 20;
        int result = Lesmas.maior(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of nivel method, of class Lesmas.
     */
    @Test
    public void testNivel() {
        System.out.println("nivel");
        int maior = 20;
        Lesmas instance = new Lesmas();
        String expResult = "Nível 3";
        String result = instance.nivel(maior);
        assertEquals(expResult, result);
    
    }
    
}
