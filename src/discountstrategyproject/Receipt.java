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
    private String columnHeadings;

    Receipt(String customerId, String storeName, ReceiptDataAccessStrategy data)
            throws IllegalArgumentException {
        setCustomer(searchCustomer(customerId, data));
        setData( data);
        setStoreName(storeName);
        lineItems = new LineItem[0];
        setColoumHeadings("ProdId\tProductName\t\tPrice\tQuantity");
    }

    public final ReceiptDataAccessStrategy getData() {
        return data;
    }

    public final void setData(ReceiptDataAccessStrategy data) throws IllegalArgumentException{
        if (data == null){
            throw new IllegalArgumentException("Please initialize the database");
        }
        this.data = data;
    }

    public final void setStoreName(String storeName)throws IllegalArgumentException {
        if(storeName == null || storeName.length() < 1){
            throw new IllegalArgumentException("Please enter valid store name");
        }
        this.storeName = storeName;
    }
    

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        if (customer == null){
            customer = new Customer("new ID", "New Customer");
        }
        this.customer = customer;
    }

    private final Customer searchCustomer(String customerId, ReceiptDataAccessStrategy data)
    {
        return data.searchCustomer(customerId);
    }

    public final void addLineItem(String productId, double qty) {
        LineItem lineItem = new LineItem(productId, qty, data);
        addToArray(lineItem);
    }

    private final void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }

    private final String getReceiptData() {
        String data = "";
        data += "Store Name: " + this.storeName + "\n";        
        data += customer.getCustomerName() + "\n\n";
        data += getColoumHeadings()+ "\n";        
        data += getLineItem() + "\n";
        return data;
    }
    
    private String getLineItem(){
        String Items = "";
        double total = 0.0;
        for (LineItem item : lineItems) {
            Items += item.getProduct().getProductId() + "\t" 
                    + item.getProduct().getProductName() + "\t"
                    + item.getProduct().getPrice() + "\t"
                    + item.getQty() + "\n";
            total += item.calculateSubTotal();
        }    
        return Items += "\nGrandTotal : $ " +total;
    }

    public final void setColoumHeadings(String coloumHeadings)throws IllegalArgumentException {
        if(coloumHeadings== null || coloumHeadings.isEmpty()){
          throw new IllegalArgumentException("Colomn Headings is required.");  
        }
        this.columnHeadings = coloumHeadings;
    }

    private final String getColoumHeadings() {
        return columnHeadings;
    }
    public final String formatReceipt(){
        return getReceiptData();
    }
}
