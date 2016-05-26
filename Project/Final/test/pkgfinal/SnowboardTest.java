/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.HashSet;
import java.util.Set;
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
public class SnowboardTest {
    
    public SnowboardTest() {
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
     * Test of getSize method, of class Snowboard.
     */
    @Test
    public void testGetSize() {
        System.out.println("**getSize");
        
        Snowboard instance = new Snowboard(true, 87.90, 683920, 200, true);
        int expResult = 200;
        int result = instance.getSize();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", expResult,
                result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class Snowboard.
     */
    @Test
    public void testSetSize() {
        System.out.println("**setSize");
        
        Snowboard instance = new Snowboard(false, 72.80, 328197, 300, false);
        instance.setSize(250);
        
        int expResult = 250;
        int result = instance.getSize();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", expResult,
                result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of isFreestyle method, of class Snowboard.
     */
    @Test
    public void testIsFreestyle() {
        System.out.println("**isFreestyle");
        
        Snowboard instance = new Snowboard(true,68.70, 2038183, 160, true);
        
        boolean expResult = true;
        boolean result = instance.isFreestyle();
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n", expResult,
                result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setFreestyle method, of class Snowboard.
     */
    @Test
    public void testSetFreestyle() {
        System.out.println("**setFreestyle");
        
        Snowboard instance = new Snowboard(true, 89.18, 491038, 240, true);
        instance.setFreestyle(false);
        
        boolean expResult = false;
        boolean result = instance.isFreestyle();
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n", expResult,
                result);
        
        assertEquals(expResult, result);
    }

    
    /**
     * Test of toString method, of class Snowboard.
     */
    @Test
    public void testToString() {
        System.out.println("**toString");
        Snowboard instance = new Snowboard(true, 72.80, 683920, 200, true);
        
        String expResult = "New Model: true\nRental Cost: 72.80\n"
                + "Rental Number: 683920\nSize: 200 cm\nFreestyle: true\n";
        String result = instance.toString();
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n", expResult,
                result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of lateCharge method, of class Snowboard.
     */
    @Test
    public void testLateCharge() {
        System.out.println("**lateCharge");
        
        Snowboard instance = new Snowboard(true, 100.00, 49199, 275, false);
        
        double expResult = 120;
        double result = instance.lateCharge();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", expResult,
                result);
        
        assertEquals(expResult, result, 0.0001);
    }
    
}
