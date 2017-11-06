/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2167;
import java.util.Scanner;

/**
 *
 * @author Sahra
 */
public class Uri2167 {
    public static void run(String[] args) {
        int i, caso=0;
        falhaDoMotor motor = new falhaDoMotor();
        Scanner reader;
        reader = new Scanner (System.in);
        int medidasVelocidade; //1<N<=100
        boolean continuar = true;
        
        do{
            medidasVelocidade = reader.nextInt();
            int[] rotacoesMinutos = new int[medidasVelocidade];
            if ((medidasVelocidade>1) && (medidasVelocidade<=101)){
                for(i=0;i<rotacoesMinutos.length;i++){
                    rotacoesMinutos[i] = reader.nextInt();
                    continuar = false;             
                }
                caso = motor.falha(rotacoesMinutos);
            } else {
                System.out.println("Digite um número maior de 1 e menor de 100.");
            }
        }while(continuar);  
        System.out.println(caso);
    }

    public static void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
