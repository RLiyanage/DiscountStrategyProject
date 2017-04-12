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
    
    public QtyDiscountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
        double qty = 0.0;
        double price = 0.0;
        QtyDiscount instance = null;
        double expResult = 0.0;
        double result = instance.calculateDiscountAmount(qty, price);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
