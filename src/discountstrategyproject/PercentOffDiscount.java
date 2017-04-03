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
public class PercentOffDiscount implements DiscountStrategy {

    private double discountPercentage;

    public PercentOffDiscount(double discountPer) {
        setDiscountPercentage(discountPer);
    }

    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    public final void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage > 0) {
            this.discountPercentage = discountPercentage;
        }
    }

    @Override
    public final double calculateDiscountAmount(double qty, double price) {
        return qty * price * discountPercentage;
    }

}
