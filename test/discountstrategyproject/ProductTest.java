/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanuth
 */
public class ProductTest {

    private Product instance;
    private DiscountStrategy discount;

    public ProductTest() {
    }

    @Before
    public void setUp() {
        instance = new Product();
        DiscountStrategy discount;
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getProductId method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetProductIDShouldThrowIaeIfProductIdIsNull() {

        instance.setProductId(null);

    }

    /**
     * Test of setProductId method, of class Product.
     *
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetProductIDShouldThrowIaeIfProductIdIsEmpty() {

        instance.setProductId("");

    }

    @Test(expected = IllegalArgumentException.class)
    public void SetProductNameShouldThrowIaeIfProductNameIsNull() {

        instance.setProductName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetProductNameShouldThrowIaeIfProductNameIsEmpty() {

        instance.setProductName("");
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetPriceShouldThrowIoeIfPriceGraterThanTwoThousand() {

        instance.setPrice(2002);
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetPriceShouldThrowIoeIfPriceLessThanZero() {

        instance.setPrice(-1);
    }

    /**
     * Test of getDiscount method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetPriceShouldThrowIoeIfPriceGraterThantwoThousand() {

        instance.setPrice(2002);
    }

    @Test
    public void testSetPriceShouldAllow1To2000() {

        for (int i = 1; i < 2001; i++) {
            try {
                instance.setPrice(i);
            } catch (IllegalArgumentException iae) {
                fail("Arguments from 1 to 2000 inclusive should be legal,"
                        + " but fails with IllegalArgumentException");
            }
        }
    }

    /**
     * Test of getDiscountAmt method, of class Product.
     */
//  @Test (expected = NullPointerException.class)
//    public void testGetDiscountAmt() {
//       
//        int qty = -1;
//       
//        double expResult = 0.0;
//        double result = instance.getDiscountAmt(qty);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setDiscount method, of class Product.
     */
    @Test(expected = NullPointerException.class)
    public void SetDiscountShouldThrowIaeIfDiscountIsNull() {

        instance.setDiscount(discount);

    }
}
