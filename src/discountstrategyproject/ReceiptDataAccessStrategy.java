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
public interface  ReceiptDataAccessStrategy {

    public abstract Customer searchCustomer(String customerId);
    public abstract Product searchProduct( String prodId);
}
