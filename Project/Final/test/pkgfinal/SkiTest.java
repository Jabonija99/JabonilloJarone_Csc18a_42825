/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

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
public class SkiTest {
    
    public SkiTest() {
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

    @Test
    public void testEquals() {
        System.out.println("**Equals");
        Ski instance = new Ski(false,30.25, 55555, 120);
        boolean expResult = true;
        boolean reslt = instance.equals(55555);
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n", expResult, reslt);
        
        assertEquals(expResult, reslt);
    }
    
    @Test
    public void testIsNewModel(){
        System.out.println("**isNewModel");
        
        Ski instance = new Ski(true, 45.50, 43424, 140);
        boolean expReslt = true;
        boolean reslt = instance.isNewModel();
        
         System.out.printf("Expected Result: %s\nResult: %s\n\n", expReslt, reslt);
        
        assertEquals(expReslt,reslt);
    }
    
    @Test
    public void testSetNewModel(){
        System.out.println("**setNewModel");
        
        Ski instance = new Ski(true, 45.50, 43424, 140);
        instance.setNewModel(false);
        
        boolean expReslt = false;
        boolean reslt = instance.isNewModel();
        
         System.out.printf("Expected Result: %s\nResult: %s\n\n", 
                 expReslt, reslt);
        
        assertEquals(expReslt,reslt);
    }
    
    
    @Test
    public void testGetRentCost(){
        System.out.println("**getRentCost");
        
        Ski instance = new Ski(true, 55.75, 30491, 170);
        
        double expReslt = 55.75;
        double reslt = instance.getRentCost();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", 
                expReslt, reslt);
        
        assertEquals(expReslt,reslt, 0.0001);
    }
    
    
    @Test
    public void testSetRentCost(){
        System.out.println("**setRentCost");
        
        Ski instance = new Ski(true, 45.50, 43424, 140);
        instance.setRentCost(60.45);
        
        
        double expReslt = 60.45;
        double reslt = instance.getRentCost();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", 
                expReslt, reslt);
        
        assertEquals(expReslt,reslt, 0.0001);
    }
    
    
    //Get rent number test
    @Test
    public void testGetRentNum(){
        System.out.println("**getRentNum");
        
        Ski instance = new Ski(false, 125.99, 348492, 155);
      
        long expReslt = 348492;
        long reslt = instance.getRentNum();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", 
                expReslt, reslt);
        
        assertEquals(expReslt,reslt);
    
    
    }
    
    
    //Set rent number test
    @Test
    public void testSetRentNum(){
        System.out.println("**setRentNum");
        
        Ski instance = new Ski(false, 125.99, 348492, 155);
        instance.setRentNum(10002);
      
        long expReslt = 10002;
        long reslt = instance.getRentNum();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", 
                expReslt, reslt);
        
        assertEquals(expReslt,reslt);
    
    
    }
    
    
    /**
     * Test of getSize method, of class Ski.
     */
    @Test
    public void testGetSize() {
        System.out.println("**getSize");
        Ski instance = new Ski(false,10.99, 12345, 100);
        int expResult = 100;
        int result = instance.getSize();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", expResult, result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class Ski.
     */
    @Test
    public void testSetSize() {
        System.out.println("**setSize");
        int size = 75;
        Ski instance = new Ski(true, 15.99, 54321, 50);
        instance.setSize(size);
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", size, instance.getSize());
        
        assertEquals(size, instance.getSize());
    }

    /**
     * Test of toString method, of class Ski.
     */
    @Test
    public void testToString() {
        System.out.println("**toString");
        Ski instance = new Ski(false, 12.99, 67890, 15);
        String expResult = "New Model: false\nRental Cost: 12.99\n"
                + "Rental Number: 67890\nSize: 15 cm\n";
        String result = instance.toString();
        
        System.out.println(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of lateCharge method, of class Ski.
     */
    @Test
    public void testLateCharge() {
        System.out.println("**lateCharge");
        Ski instance = new Ski(true, 20.00, 19876, 250);
        double expResult = 22;
        double result = instance.lateCharge();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", expResult, 
                result);
        
        assertEquals(expResult, result, 0.0001);
    }
    
    
    
}
