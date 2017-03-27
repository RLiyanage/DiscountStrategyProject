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

    private double minimumQty;
    private double discountPercentage;

    public QtyDiscount(double discountPercentage,int qty ) {

    }


    @Override
    public final double calculateDiscountAmount(double qty,double price) {
        double discount = 0.0;
        if (qty >= minimumQty ){
            discount = this.discountPercentage;
        }
        return discount;
    }

}
