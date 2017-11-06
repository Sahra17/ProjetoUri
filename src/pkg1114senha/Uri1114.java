package pkg1114senha;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sahra
 */
public class Uri1114 {
    public static void run(){
        VerificarSenha verifica = new VerificarSenha();
        Scanner reader;       
        reader = new Scanner (System.in);
        int senhalida = reader.nextInt();
        int senha = verifica.Senha(senhalida);
    }
    
}
