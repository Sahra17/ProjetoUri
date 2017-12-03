/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2582;

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
public class SystemsTest {
    
    public SystemsTest() {
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
     * Test of musica method, of class Systems.
     */
    @Test
    public void testMusica1() {
        System.out.println("musica");
        int X = 7;
        Systems.musica(X);
    }
    
    @Test 
    public void testMusica2() {
        System.out.println("musica");
        int X = 0;
        Systems.musica(X);
    }
    
    @Test
    public void testMusica3() {
        System.out.println("musica");
        int X = 1;
        Systems.musica(X);
    }
    
}
