/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1042sortsimples;
import java.util.Arrays;

/**
 *
 * @author sahra.flohr
 */
public class SortSimples {
    private int[] num;
    
    public SortSimples(int i1, int i2, int i3) {
        num = new int[3];
        num[0] = i1;
        num[1] = i2;
        num[2] = i3;
    }
    
    public int[] getArray() {
        return num;
    }
    
    public int[] sort() {
        int[] arrTmp  = Arrays.copyOf(num, 3);
        
        Arrays.sort(arrTmp);
        
        return arrTmp;
    }
}
