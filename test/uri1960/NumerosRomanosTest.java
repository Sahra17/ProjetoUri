/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1960;

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
public class NumerosRomanosTest {
    
    public NumerosRomanosTest() {
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
     * Test of getRomanos method, of class NumerosRomanos.
     */
    @Test
    public void testGetRomanos1() {
        System.out.println("DCLXVI");
        String numeroS = "666";
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "DCLXVI";
        String result = instance.getRomanos(numeroS);
        assertEquals(expResult, result);    
    }
    
    @Test
    public void testGetRomanos2() {
        System.out.println("LXXXIII");
        String numeroS = "83";
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "LXXXIII";
        String result = instance.getRomanos(numeroS);
        assertEquals(expResult, result);    
    }
    
    @Test
    public void testGetRomanos3() {
        System.out.println("CMXCIX");
        String numeroS = "999";
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "CMXCIX";
        String result = instance.getRomanos(numeroS);
        assertEquals(expResult, result);    
    }  
}
