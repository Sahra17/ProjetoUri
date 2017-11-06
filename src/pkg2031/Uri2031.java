/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2031;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Sahra
 */
public class Uri2031 {

    public static void run(String[] args) {
        int i;
        int j, vencedor;
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        Scanner reader;
        reader = new Scanner (System.in);
        String[] sinal = new String[2];
        String qntd = reader.nextLine();
        int qtd = Integer.parseInt(qntd);
        
        for (i=0;i<qtd;i++){
            for(j=0;j<2;j++){
                sinal[j] = reader.nextLine();
            }
        vencedor = jokenpo.verificarVencedor(sinal);
        jokenpo.imprimirVencedor(vencedor);
        System.out.println();
        } 
    }    

    public static void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
