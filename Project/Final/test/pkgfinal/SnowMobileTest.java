/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kauru99
 */
public class SnowMobileTest {
    
    public SnowMobileTest() {
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
     * Test of getCap method, of class SnowMobile.
     */
    @Test
    public void testGetCap() {
        System.out.println("**getCap");
        
        SnowMobile instance = new SnowMobile(true, 500.99, 993819, 3, "A39");
        
        int expResult = 3;
        int result = instance.getCap();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", 
                expResult, result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setCap method, of class SnowMobile.
     */
    @Test
    public void testSetCap() {
        System.out.println("**setCap");
        SnowMobile instance = new SnowMobile(true, 670.99, 59310, 1, "BC3");
        instance.setCap(5);
        
        int expResult = 5;
        int result = instance.getCap();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", 
                expResult, result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getVin method, of class SnowMobile.
     */
    @Test
    public void testGetVin() {
        System.out.println("**getVin");
        
        SnowMobile instance = new SnowMobile(false, 450.23, 9183, 4, "A4D");
        
        String expResult = "A4D";
        String result = instance.getVin();
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n",
                expResult, result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setVin method, of class SnowMobile.
     */
    @Test
    public void testSetVin() {
        System.out.println("**setVin");
        
        SnowMobile instance = new SnowMobile(false, 367.25, 29178, 2, "C30");
        instance.setVin("8F0");
        
        String expResult = "8F0";
        String result = instance.getVin();
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n",
                expResult, result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SnowMobile.
     */
    @Test
    public void testToString() {
        System.out.println("**toString");
        
        SnowMobile instance = new SnowMobile(true, 399.75, 30009, 4, "Z22");
        
        String expResult = "New Model: true\nRental Cost: 399.75\n"
                + "Rental Number: 30009\nCapacity: 4\nVIN: Z22\n";
        String result = instance.toString();
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n",
                expResult, result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of lateCharge method, of class SnowMobile.
     */
    @Test
    public void testLateCharge() {
        System.out.println("**lateCharge");
        
        SnowMobile instance = new SnowMobile(false, 400.50, 72198, 2, "J3K");
        
        double expResult = 520.65;
        double result = instance.lateCharge();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n",
                expResult, result);
        
        assertEquals(expResult, result, 0.0001);
    }
    
}
