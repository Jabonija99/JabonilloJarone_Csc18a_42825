/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcc
 */
public class CircleTest {
    
    public CircleTest() {
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
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Circle instance = new Circle(5.5);
        double expResult = 5.5;
        double result = instance.getRadius();
        assertEquals(expResult, result, 0.0); 
        //Third parameter is the allowable diffence between results
        
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double radius = 5.5;
        Circle instance = new Circle(5.5);
        instance.setRadius(radius);
        double result =instance.getRadius();
        assertEquals(radius, result, 0.0);
    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circle instance = new Circle(3.5);
        double expResult = 38.4845;
        double result = instance.area();
        assertEquals(expResult, result, 0.0001); //Tolerates 4 decimal places
    }

    /**
     * Test of perimeter method, of class Circle.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Circle instance = new Circle(3.5);
        double expResult = 21.9912;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0001);
       
    }

    /**
     * Test of surface_area method, of class Circle.
     */
    @Test
    public void testSurface_area() {
        System.out.println("surface_area");
        Circle instance = new Circle(3.5);
        double expResult = 38.4845;
        double result = instance.surface_area();
        assertEquals(expResult, result, 0.0001);
        
    }

    /**
     * Test of volume method, of class Circle.
     */
    @Test
    public void testVolume() {
        System.out.println("volume");
        Circle instance = new Circle(5.5);
        double expResult = 0.0;
        double result = instance.volume();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
