/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1789lesmas;

import java.util.ArrayList;

/**
 *
 * @author Sahra
 */
public class Lesmas {
    public static int maior(ArrayList<Integer> num){
        int maior=0;
        
        for(Integer valor : num) {  
            if(valor > maior) {
                maior = valor;
            }
        }
        
        return maior;
    }
    
    public String nivel(int maior){
        String nivel = null;
        
        if(maior < 10){
            nivel = "Nível 1";
        }else{
            if((maior >=10) && (maior < 20)){
                nivel = "Nível 2";
            }else{
                if(maior >= 20){
                    nivel = "Nível 3";
                }
            }         
        }
        return nivel;
    }
}
