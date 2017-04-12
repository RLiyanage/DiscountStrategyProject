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
public class QtyDiscount implements DiscountStrategy {

    private double minimumQty = 3;
    private double discountPercentage;

    public QtyDiscount(double discountPercentage, int qty) {
        minimumQty = qty;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public final double calculateDiscountAmount(double qty, double price) {
        double discount = 5.0;
        if (qty < 0 || price < 0.0) {
            throw new IllegalArgumentException("Quantity cannot be null or price cannot be null.");
        } else {
            if (qty >= minimumQty) {
                discount = this.discountPercentage;
            }
            return discount;
        }
    }
}
