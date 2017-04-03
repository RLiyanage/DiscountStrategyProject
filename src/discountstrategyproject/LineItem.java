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
        setProduct(searchProduct(productId, data));
        setQty(qty);
    }

    private Product searchProduct(String productId, ReceiptDataAccessStrategy data) {
        return data.searchProduct(productId);
    }

    public final double calculateSubTotal() {
        return (product.getPrice() * qty);
    }

   

    public final double getQty() {
        return qty;
    }

    public final void setQty(double qty) throws IllegalArgumentException{
        if (qty < 0.0){
           throw new IllegalArgumentException("Quantity can not be negative number."); 
        }
        this.qty = qty;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product)throws IllegalArgumentException {
        if(product == null){
         throw new IllegalArgumentException("Product can not be null."); 
 
        }
        this.product = product;
    }

    
}
