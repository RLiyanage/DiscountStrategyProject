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
public class PosTerminal {
    
    private DisplayStrategy display;
    private Receipt receipt;
    
            

    PosTerminal(DisplayStrategy display1,DisplayStrategy display2) {
        this.display = display1;
        this.display = display2;
    }
    
    public void startSale(String customerId, ReceiptDataAccessStrategy data, String storeName) {
        receipt = new Receipt(customerId, storeName, data);
        
    }

    public void addItemToSale(String productId, double qty) {
        receipt.addLineItem(productId, qty);
    }
    
    public void endSale() {
        display.print(receipt.formatReceipt());
        
    }
    
}
