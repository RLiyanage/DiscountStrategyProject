/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author Sanuth
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DisplayStrategy display1 = new GuiDisplay();
        DisplayStrategy display2 = new ConsoleDisplay();
                
        ReceiptDataAccessStrategy data = new InMemoryDataAccess();
        
        PosTerminal pos = new PosTerminal(display1,display2);
        pos.startSale("200", data, "Kohls");
        pos.addItemToSale("A101", 1.0);
        pos.addItemToSale("B205", 2.0);
        pos.endSale();
    }

}
