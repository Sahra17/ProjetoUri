/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1789lesmas;

/**
 *
 * @author Sahra
 */
public class Lesmas {
    public static String maior(int[] num){
        int maior=0;
        
        for(int valor : num) {  
            if(valor > maior) {
                maior = valor;
            }
        }
        
        return nivel(maior);
    }
    
    public static String nivel(int maior){
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
