/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2167;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sahra
 */
public class falhaDoMotorTest {
    
     /**
     * Test of main method, of class Main.
     */
    @Test
    public void test1() {
        System.out.println("3");
        falhaDoMotor motor = new falhaDoMotor();
        int[] teste = {1,4,2};
        int expResult = 3;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2() {
        System.out.println("5");
        falhaDoMotor motor = new falhaDoMotor();
        int[] teste = {100,199,199,198,0};
        int expResult = 4;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3() {
        System.out.println("4");
        falhaDoMotor motor = new falhaDoMotor();
        int[] teste = {1,2,2,2};
        int expResult = 0;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
}
