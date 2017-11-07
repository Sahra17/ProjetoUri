/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1879lesma;

/**
 *
 * @author sahra.flohr
 */
public class Lesma {
    private int []lesma;
    private int quant;
       
    public Lesma(int i1) {       
        lesma= new int[i1];
        quant=i1;
    }
    
    public int addLesma(int i2){
        int i;
       
        for(i=0; i<quant; i++){
            lesma[i]=i2;
        }
        nivel();
        
        return lesma[i];
    }    
     
    public void nivel(){
        int i;
        for(i=0; i<quant; i++){
            if(lesma[i] < 10){
                System.out.println("Está lesma é de nível 1!");
            }else{
                if((lesma[i] >= 10) && (lesma[i] < 20)){
                    System.out.println("Está lesma é de nível 2!");
                }else{
                    if(lesma[i] >= 20){
                        System.out.println("Está lesma é de nível 3!");
                    }
                }
            }
        }
        
    }
    
}
