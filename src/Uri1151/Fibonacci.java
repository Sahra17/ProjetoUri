/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1151;

/**
 *
 * @author Sahra
 */
public class Fibonacci {
    public String gerarFibonacci(int numero){
        StringBuilder b = new StringBuilder();
        int n1 = 1, n2 = 0;
        b.append(n2);
        b.append(" ");
        b.append(n1);
        b.append(" ");
        
            for(int j = 0; j < (numero-2); j++){
                n1 = n1 + n2;
                n2 = n1 - n2;
                b.append(n1);
                
                if(j+1 != numero-2){
                    b.append(" ");
                }
            }
            return b.toString();
    }
}
