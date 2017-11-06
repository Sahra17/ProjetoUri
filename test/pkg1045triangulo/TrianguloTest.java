/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1045triangulo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sahra
 */
public class TrianguloTest {
    
@Test
    public void teste1(){
        System.out.println("Valores de A, B e C   7.0 5.0 7.0");
        Triangulo define = new Triangulo();
        String expResult ="TRIANGULO ACUTANGULO"+"TRIANGULO ISOSCELES";
        String result = define.verifica(7.0, 5.0, 7.0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Valores de A, B e C   6.0 6.0 10.0");
        Triangulo define = new Triangulo();
        String expResult ="TRIANGULO OBTUSANGULO" + "TRIANGULO ISOSCELES";
        String result = define.verifica(6.0, 6.0, 10.0);
        assertEquals(expResult, result);
    }
    @Test
    public void teste3(){
        System.out.println("Valores de A, B e C  6.0 6.0 6.0");
        Triangulo define = new Triangulo();
        String expResult ="TRIANGULO ACUTANGULO"+"TRIANGULO EQUILATERO";
        String result = define.verifica(6.0, 6.0, 6.0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste4(){
        System.out.println("Valores de A, B e C   5.0 7.0 2.0");
        Triangulo define = new Triangulo();
        String expResult ="NAO FORMA UM TRIANGULO";
        String result = define.verifica(5.0, 7.0, 2.0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste5(){
        System.out.println("Valores de A, B e C   6.0 8.0 10.0");
        Triangulo define = new Triangulo();
        String expResult ="TRIANGULO RETANGULO";
        String result = define.verifica(6.0, 8.0, 10.0);
        assertEquals(expResult, result);
    }
}
