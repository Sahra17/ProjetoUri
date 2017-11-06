/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1045triangulo;
import java.util.Scanner;
/**
 *
 * @author Sahra
 */
public class Uri1045 {
      public  static void run() {
      Triangulo define = new Triangulo();
      Scanner reader;       
      reader = new Scanner (System.in);
      float a = reader.nextFloat();
      float b = reader.nextFloat();
      float c = reader.nextFloat();
      String triangulo;
          triangulo = define.verifica(a, b, c);
      
   }  
}
