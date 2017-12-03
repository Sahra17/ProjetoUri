/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import java.util.Scanner;

/**
 *
 * @author Sahra
 */
public class Pum {
        public String gerarSequencia(int numero){
        StringBuilder b = new StringBuilder();
            int cont = 0;
            for(int j = 1; j <= (numero * 4); j++){
                b.append(j+" ");
                cont++;
                if(cont == 3){
                    j++;
                    b.append("PUM\n");
                    cont = 0;
                }
            }
            return b.toString();
        }
}
