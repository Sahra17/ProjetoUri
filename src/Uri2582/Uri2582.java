/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2582;

import java.util.Scanner;

/**
 *
 * @author Sahra
 */
public class Uri2582 {
    public static void run(){
        Systems S = new Systems();
        int X=0; 
        
        System.out.println("Digite a quantidade de músicas: ");
        Scanner input = new Scanner(System.in);
        int quantidade = input.nextInt();
      
        System.out.println("Digite os numeros da música: ");
        for(int i=0; i < quantidade; i++){
            Scanner input2 = new Scanner(System.in);
            X = input.nextInt(); 
            Scanner input3 = new Scanner(System.in);
            X += input.nextInt(); 
            S.musica(X);  
        }
    }       
}
