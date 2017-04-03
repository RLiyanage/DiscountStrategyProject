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
    public final void print(String receipt)throws IllegalArgumentException {
        if(receipt == null|| receipt.isEmpty()){
            throw new IllegalArgumentException();
        }
        JOptionPane.showMessageDialog(null,receipt);
    }
    
}
