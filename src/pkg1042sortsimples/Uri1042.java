/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1042sortsimples;
import java.util.Scanner; 
/**
 *
 * @author sahra.flohr
 */
public class Uri1042 {

    public static void run() {
        Scanner input = new Scanner(System.in);
        
        SortSimples ns = new SortSimples(input.nextInt(), 
                input.nextInt(), input.nextInt());
        
        int[] num  = ns.getArray();
        int[] sor = ns.sort();
        
        System.out.printf("%d\n%d\n%d\n", sor[0], sor[1], sor[2]);
        System.out.println();
        System.out.printf("%d\n%d\n%d\n", num[0], num[1], num[2]);
    }

    
    
}
   

   


