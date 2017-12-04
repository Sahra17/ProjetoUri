/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1789lesmas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sahra
 */
public class Uri1789 {
    public static void run(){
        System.out.println("Digite a quantidade de lesmas: ");
        Scanner input = new Scanner(System.in);
        int quantidade = input.nextInt();
      
        int[] numero = new int[quantidade];
        
        System.out.println("Digite a velocidade das lesmas: ");
        for(int i=0; i < quantidade; i++){
            Scanner input2 = new Scanner(System.in);
            numero[i] = input.nextInt();   
            
        }
        
        
        System.out.println(Lesmas.maior(numero));
    }     
}
