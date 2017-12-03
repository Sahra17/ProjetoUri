/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Uri1142.Uri1142;
import Uri1151.Uri1151;
import Uri2582.Uri2582;
import pkg1042sortsimples.Uri1042;
import pkg1045triangulo.Uri1045;
import pkg1114senha.Uri1114;
import pkg1789lesmas.Uri1789;
import pkg2031.Uri2031;
import pkg2167.Uri2167;
import uri1960.URI1960;

/**
 *
 * @author sahra.flohr
 */
public class Main {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Passe o número de um problema");
        }else{
            switch(args[0]){
                case"1042":
                    Uri1042.run();
                break;
                case"1045":
                    Uri1045.run();
                break;
                case"1114":
                    Uri1114.run();
                break;
                case"1151":
                    Uri1151.run();
                break;
                 case"2031":
                    Uri2031.run();
                break;
                 case"2167":
                    Uri2167.run();
                break;
                 case"1960":
                    URI1960.run();
                break;
                 case"1142":
                    Uri1142.run();
                break;
                case"1789":
                    Uri1789.run();
                break;
                case"2582":
                    Uri2582.run();
                break;
                default:
                    System.out.println("Problema não existente");
                    
            }
        }
    }
}
