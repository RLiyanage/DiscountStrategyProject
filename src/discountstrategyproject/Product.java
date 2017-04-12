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
public class Product {
   
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy discount;
    
     Product(){
        
    }
    
    

    Product(String productId, String productName, double price, DiscountStrategy discount) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String poductId) {
         if(poductId == null || poductId.isEmpty() ){
        throw new IllegalArgumentException();
        }
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.isEmpty() ){
        throw new IllegalArgumentException();
        }
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        
         if(price < 1 || price > 2000 ) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }
    
    // optional
    public double getDiscountAmt(int qty) {
         if(qty < 1  ) {
            throw new IllegalArgumentException();
        }
        return discount.calculateDiscountAmount(qty, price);
    }

    public void setDiscount(DiscountStrategy discount) {
         if(discount == null){
        throw new NullPointerException();
        }
        this.discount = discount;
    }

}
