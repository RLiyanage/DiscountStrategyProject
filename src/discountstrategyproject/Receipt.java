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
public class Receipt {

    private ReceiptDataAccessStrategy data;
    private LineItem[] lineItems;
    private Customer customer;
    private String storeName;
    private double grandTotal= 0.0;
    private String columnHeadings;

    Receipt(String customerId, String storeName, ReceiptDataAccessStrategy data) {
        setCustomer(searchCustomer(customerId, data));
        setData( data);
        this.storeName = storeName;
        lineItems = new LineItem[0];
        
    }

    public ReceiptDataAccessStrategy getData() {
        return data;
    }

    public void setData(ReceiptDataAccessStrategy data) {
        this.data = data;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if(customer== null){
            throw new IllegalArgumentException("Please enter customer again");
        }
        this.customer = customer;
    }

    private final Customer searchCustomer(String customerId, ReceiptDataAccessStrategy data) {
        return data.searchCustomer(customerId);
    }

    public final void addLineItem(String productId, double qty) {
        LineItem lineItem = new LineItem(productId, qty, data);
        addToArray(lineItem);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }

    public String getReceiptData() {
        String data = "";
        data += "Store Name: "+ this.storeName + "\n";        
        data+=(customer.getCustomerName()==null? "":"Customer Name: "+customer.getCustomerName())+ "\n";
        data += getColoumHeadings()+ "\n";        
        for (LineItem item : lineItems) {
            data += item.getLineItemData()+ "\n";
            //grandTotal+=item.calculateSubTotal();
        }
        return data;
    }

    public void setColoumHeadings(String coloumHeadings) {
        coloumHeadings ="ProductId\tProductName\tPrice\tQuantity";
        this.columnHeadings = coloumHeadings;
    }

    public String getColoumHeadings() {
        return columnHeadings;
    }
    public String formatReceipt(){
        return getReceiptData();
    }
}
