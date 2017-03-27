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
public class PercentOffDiscount implements DiscountStrategy{
    private double discountPercentage;
    
    

    public PercentOffDiscount(double discountPer) {
        setDiscountPercentage(discountPer);
    }
    
    

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscountAmount(double qty,double price) {
        return qty *price * discountPercentage;
    }

    
    
}
