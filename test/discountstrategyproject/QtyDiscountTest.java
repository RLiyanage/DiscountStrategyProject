/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanuth
 */
public class QtyDiscountTest {

    private DiscountStrategy qtyDiscount;

    public QtyDiscountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        DiscountStrategy qtyDiscount = new QtyDiscount(5, 15);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calculateDiscountAmount method, of class QtyDiscount.
     */
    @Test
    public void testCalculateDiscountAmount() {
        System.out.println("calculateDiscountAmount");
        double qty = 5.0;
        double price = 15.0;
        DiscountStrategy instance = new QtyDiscount(5, 15);
        double expResult = 5.0;
        double result = instance.calculateDiscountAmount(5, 15);
        assertEquals(expResult, result, 0.0);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
