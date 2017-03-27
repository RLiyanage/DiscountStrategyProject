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
public class NoDiscount implements DiscountStrategy {

    /**
     *
     * @param qty
     * @return
     */
    @Override
    public double calculateDiscountAmount(double qty,double price) {
        return 0.0;
    }

   
    
    
}
