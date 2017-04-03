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
class Customer {
private String customerId;
private String customerName;
    Customer(String customerId, String customerName) {
      setCustomerId(customerId);
      setCustomerName(customerName);
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId)throws IllegalArgumentException {
        if (customerId == null|| customerId.isEmpty()){
            throw new IllegalArgumentException("CustomerId ir required.");
        }
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName)throws IllegalArgumentException {
        if(customerName == null || customerName.isEmpty()) {  
            throw new IllegalArgumentException("Customer Name is required.");
        }
        this.customerName = customerName;
    }

    
    
}
