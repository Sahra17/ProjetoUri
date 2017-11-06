/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1960;

import javax.swing.JOptionPane;

/**
 *
 * @author Sahra
 */
public class URI1960 {
    public static void run(String[] args) {
        NumerosRomanos NR = new NumerosRomanos();
        
        String num = JOptionPane.showInputDialog("Digite o número:");
        
        JOptionPane.showMessageDialog(null, NR.getRomanos(num));
    }

    public static void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
