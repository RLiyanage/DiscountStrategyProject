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
    
    public final void startSale(String customerId, ReceiptDataAccessStrategy data, String storeName) {
        try{
            receipt = new Receipt(customerId, storeName,data);
        } catch(IllegalArgumentException e){
            display.print(e.getMessage());
            //throw new CustomException 
        }
    }

    public void addItemToSale(String productId, double qty){
        if (receipt != null) {
            receipt.addLineItem(productId, qty);
        } else {
            //throw new CustomException
        }
    }
    
    public void endSale() {
        if (receipt != null) {
            display.print(receipt.formatReceipt());
        } else {
            //throw new CustomException
        }
    }
}
