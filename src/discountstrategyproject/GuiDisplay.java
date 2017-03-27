/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Sanuth
 */
public class GuiDisplay implements DisplayStrategy{

    @Override
    public void print(String receipt) {
        JOptionPane.showMessageDialog(null,receipt);
    }
    
}
