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

    Product(String productId, String productName, double price, DiscountStrategy discount) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }
    
    // optional
    public double getDiscountAmt(int qty) {
        return discount.calculateDiscountAmount(qty, price);
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

}
