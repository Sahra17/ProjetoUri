/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1042sortsimples;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sahra.flohr
 */
public class SortSimplesTest {
    
    public SortSimplesTest() {
    }

    /**
     * Test of sortSimples method, of class SortSimples.
     */
    @Test
    public void testSortSimples1() {
        System.out.println("sort 7 21 -14");
        SortSimples instance = new SortSimples(7, 21, -14);
        int[] expResult = {-14, 7, 21};
        int[] result = instance.sort();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSortSimples2() {
        System.out.println("sort -14 21 7");
        SortSimples instance = new SortSimples(-14, 7, 21);
        int[] expResult = {-14, 7, 21};
        int[] result = instance.sort();
        assertArrayEquals(expResult, result);
    }
    
}
