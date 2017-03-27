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
class LineItem {

    private Product product;
    private double qty;

    public LineItem(String productId, double qty, ReceiptDataAccessStrategy data) {
        product = searchProduct(productId, data);
        this.qty = qty;
    }

    private Product searchProduct(String productId, ReceiptDataAccessStrategy data) {
        return data.searchProduct(productId);
    }

    public final double calculateSubTotal() {
        return (product.getPrice() * qty);
    }

   

    public double getQty() {
        return qty;
    }

    public final void setQty(double qty) {
        this.qty = qty;
    }

    public String getLineItemData() {
        String data = "";
        data += product.getProductId()+"\t";
        data +=product.getProductName()+"t";
        data+= product.getPrice()+"\t";
        data+= this.qty;
        data+=calculateSubTotal();
        
        data+=product.getDiscount().calculateDiscountAmount(qty, product.getPrice());
        return data;
    }
    
}
