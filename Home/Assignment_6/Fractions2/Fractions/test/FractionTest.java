
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {
    
    public FractionTest() {
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
     * Test of getNumerator method, of class Fraction.
     */
    
    @Test
    public void testEquals()
    {
        System.out.println("test equals method");
        Fraction instance = new Fraction(1,6);
        Fraction f2 = new Fraction(1,6);
        assertEquals(true,instance.equals(f2));
    }
    
    @Test 
    public void testCopyConstructor()
    {
        System.out.println("test copy constructor");
        Fraction instance = new Fraction(1,6);
        Fraction f2 = new Fraction(instance);
        assertEquals(true,instance.equals(f2));
    }
    
    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        Fraction instance = new Fraction(1,4);
        int expResult = 1;
        int result = instance.getNumerator();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumerator method, of class Fraction.
     */
    @Test
    public void testSetNumerator() {
        System.out.println("setNumerator");
        int newNumerator = 1;
        Fraction instance = new Fraction(1,4);
        instance.setNumerator(newNumerator);
        int actualValue = instance.getNumerator();
        assertEquals(newNumerator,actualValue);
    }

    /**
     * Test of getDenominator method, of class Fraction.
     */
    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        Fraction instance = new Fraction(1,4);
        int expResult = 4;
        int result = instance.getDenominator();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setDenominator method, of class Fraction.
     */
    @Test
    public void testSetDenominator() {
        System.out.println("setDenominator");
        int newDenominator = 1;
        Fraction instance = new Fraction(1,4); // fraction is 1/4
        instance.setDenominator(newDenominator);
        int actualValue = instance.getDenominator();
        assertEquals(newDenominator,actualValue);
    }

    /**
     * Test of value method, of class Fraction.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        Fraction instance = new Fraction(1,4);
        double expResult = 0.25;
        double result = instance.value();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Fraction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fraction instance = new Fraction(1,4);
        String expResult = "1 / 4";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }

    
    
    
    /**
     * Test of add method, of class Fraction.
     */
    
    //Non-Static Addition Test
    @Test
    public void testAdd(){
        System.out.println("Addition");
        Fraction val = new Fraction(4,9);// 4/9
        Fraction val2 = new Fraction (2,9);// 2/9
        
        Fraction expReslt = new Fraction (6,9);// 6/9
        Fraction result = val.add(val2);
        
        System.out.println("Result:"+result.toString());
        assertEquals(true, result.equals(expReslt));
    }
    
    @Test
    public void testAdd2(){
        System.out.println("Addition 2");
        Fraction val1 = new Fraction(10,35);// 10/35
        Fraction val2 = new Fraction (5,70);// 5/70
        
        Fraction expReslt = new Fraction (25,70);// 25/70
        Fraction result = val1.add(val2);
        
        System.out.println("Result:"+result.toString());
        assertEquals(true, result.equals(expReslt));
    }
    
    //Static Addition Test
    @Test
    public void testStAdd(){
        System.out.println("Static Addition");
        Fraction val1 = new Fraction(3,16);// 3/16
        Fraction val2 = new Fraction(1,16);// 1/16
        
        Fraction expReslt = new Fraction(1,4);// 1/4
        Fraction result = val1.add(val1,val2);
        
        System.out.println("Result:"+result.toString());
        assertEquals(true, result.equals(expReslt));
    }
    
    @Test
    public void testStAdd2(){
        System.out.println("Static Addition 2");
        Fraction val1 = new Fraction(4,21);// 4/21
        Fraction val2 = new Fraction(2,7);// 2/7
        
        Fraction expReslt = new Fraction(10,21);// 10/21
        Fraction result = val1.add(val1,val2);
        
        System.out.println("Result:"+result.toString());
        assertEquals(true, result.equals(expReslt));
    }
    
    
    /** Class Examples=============================================
    @Test
    public void testAdd() {
        System.out.println("add");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(4,7); // 4/7
        Fraction result = instance.add(f2);
        System.out.println("....."+result.toString());
        assertEquals(true, result.equals(expResult));        
    }

    @Test
    public void testAdd2() {
        System.out.println("add2");
        Fraction f2 = new Fraction(32,58); // 32/58
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(199,203); // 199/203
        Fraction result = instance.add(f2);
        System.out.println("....."+result.toString());
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testAdd3() {
        System.out.println("test static Fraction.add");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction f1 = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(4,7); // 4/7
        Fraction result = Fraction.add(f1,f2); // invoke static add
        System.out.println("....."+result.toString());
        assertEquals(true, result.equals(expResult));        
    }
    */
    
    
    
    
    /**
     * Test of subtract method, of class Fraction.
     */
    
    //Non-static subtraction tests
    @Test
    public void testSub(){
        System.out.println("Subtraction");
        
        Fraction val1 = new Fraction(5,13);// 5/13
        Fraction val2 = new Fraction(2,26);// 2/26
        
        Fraction expReslt = new Fraction(4,13);// 4/13
        Fraction reslt = val1.subtract(val2);
        
        System.out.println("Result"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    @Test
    public void testSub2(){
        System.out.println("Subtraction 2");
        
        Fraction val1 = new Fraction(10,32);// 10/32
        Fraction val2 = new Fraction(1,8);// 1/8
        
        Fraction expReslt = new Fraction(3,16);// 3/16
        Fraction reslt = val1.subtract(val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    //Static subtraction tests
    @Test
    public void testStSub(){
        System.out.println("Static Subtraction");
        
        Fraction val1 = new Fraction(9,24);// 9/24
        Fraction val2 = new Fraction(1,12);// 1/12
        
        Fraction expReslt = new Fraction(7,24);// 7/24
        Fraction reslt = val1.subtract(val1,val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    @Test
    public void testStSub2(){
        System.out.println("Static Subtraction 2");
        
        Fraction val1 = new Fraction(1,2);// 1/2
        Fraction val2 = new Fraction(3,16);// 3/16
        
        Fraction expReslt = new Fraction(5,16);// 5/16
        Fraction reslt = val1.subtract(val1,val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    /** Class Examples=============================================
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(2,7); // 2/7
        Fraction result = instance.subtract(f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        Fraction f2 = new Fraction(1,12); // 1/12
        Fraction instance = new Fraction(387,388); // 3/7
        Fraction expResult = new Fraction(266,291); // 266/291
        Fraction result = instance.subtract(f2);
        assertEquals(true, result.equals(expResult));        
    }

    @Test
    public void testSubtract3() {
        System.out.println("test Fraction.subtract");
        Fraction f2 = new Fraction(1,12); // 1/12
        Fraction f1 = new Fraction(387,388); // 3/7
        Fraction expResult = new Fraction(266,291); // 266/291
        Fraction result = Fraction.subtract(f1, f2);
        assertEquals(true, result.equals(expResult));        
    }
    */
    
    
    /**
     * Test of multiply method, of class Fraction.
     */
    
    //Non-Static multiplication tests
    @Test
    public void testMult(){
        System.out.println("Multiplication");
        Fraction val1 = new Fraction (2,4);// 2/4
        Fraction val2 = new Fraction (1,16);// 1/16
        
        Fraction expReslt = new Fraction (1,32);// 1/32
        Fraction reslt = val1.multiply(val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    @Test
    public void testMult2(){
        System.out.println("Multiplication 2");
        Fraction val1 = new Fraction (3,7);// 3/7
        Fraction val2 = new Fraction (21,2);// 21/2
        
        Fraction expReslt = new Fraction (9,2);// 9/2
        Fraction reslt = val1.multiply(val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    //Static multiplication tests
    @Test
    public void testStMult(){
        System.out.println("Static Multiplication");
        Fraction val1 = new Fraction (5,12);// 5/12
        Fraction val2 = new Fraction (2,13);// 2/13
        
        Fraction expReslt = new Fraction (5,78);// 5/78
        Fraction reslt = val1.multiply(val1,val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    @Test
    public void testStMult2(){
        System.out.println("Static Multiplication 2");
        Fraction val1 = new Fraction (1,4);// 1/4
        Fraction val2 = new Fraction (32,7);// 32/7
        
        Fraction expReslt = new Fraction (8,7);// 8/7
        Fraction reslt = val1.multiply(val1,val2);
        
        System.out.println("Result:"+reslt.toString());
        
        assertEquals(true, reslt.equals(expReslt));
    }
    
    
    
    /** Class Examples=============================================
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(3,49);
        Fraction result = instance.multiply(f2);
        assertEquals(true, result.equals(expResult));        
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        Fraction f2 = new Fraction(1,20); // 1/20
        Fraction instance = new Fraction(10,37); // 10/37
        Fraction expResult = new Fraction(1,74);
        Fraction result = instance.multiply(f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testMultiply3() {
        System.out.println("test Fraction.multiply2");
        Fraction f2 = new Fraction(1,20); // 1/20
        Fraction f1 = new Fraction(10,37); // 10/37
        Fraction expResult = new Fraction(1,74);
        Fraction result = Fraction.multiply(f1,f2);
        assertEquals(true, result.equals(expResult));        
    }
    */
    
    
    /**
     * Test of divide method, of class Fraction.
     */
    
    //Non-Static division test
    @Test
    public void testDivde(){
        System.out.println("Division");
        Fraction val1 = new Fraction(4,3);// 4/3
        Fraction val2 = new Fraction(2, 27);// 27/2
        
        Fraction expReslt = new Fraction(18,1); // 18/1
        Fraction reslt = val1.divide(val2); 
        
        System.out.println("Result:"+reslt.toString());
    
        assertEquals(true,reslt.equals(expReslt));
    }
    
    @Test
    public void testDivde2(){
        System.out.println("Division 2");
        Fraction val1 = new Fraction(2,3);// 2/3
        Fraction val2 = new Fraction(7, 15);// 7/15
        
        Fraction expReslt = new Fraction(10,7); // 10/7
        Fraction reslt = val1.divide(val2); 
        
        System.out.println("Result:"+reslt.toString());
    
        assertEquals(true,reslt.equals(expReslt));
    }
    
    //Static division test
    @Test
    public void testStDivde(){
        System.out.println("Static Division");
        Fraction val1 = new Fraction(22,50);// 22/50
        Fraction val2 = new Fraction(32, 25);// 32/25
        
        Fraction expReslt = new Fraction(11,32); // 11/32
        Fraction reslt = val1.divide(val1,val2); 
        
        System.out.println("Result:"+reslt.toString());
    
        assertEquals(true,reslt.equals(expReslt));
    }
    
    @Test
    public void testStDivde2(){
        System.out.println("Static Division 2");
        Fraction val1 = new Fraction(7,9);// 7/9
        Fraction val2 = new Fraction(1, 2);// 1/2
        
        Fraction expReslt = new Fraction(14,9); // 14/9
        Fraction reslt = val1.divide(val1,val2); 
        
        System.out.println("Result:"+reslt.toString());
    
        assertEquals(true,reslt.equals(expReslt));
    }
    
    /** Class Examples=============================================
    @Test
    public void testDivide() {
        System.out.println("divide");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(3,1);
        Fraction result = instance.divide(f2);
        assertEquals(true, result.equals(expResult));        
    }    
    
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Fraction f2 = new Fraction(3,40); // 3/40
        Fraction instance = new Fraction(30,97); // 30/97
        Fraction expResult = new Fraction(400,97);
        Fraction result = instance.divide(f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testDivide3() {
        System.out.println("test Fraction.divide2");
        Fraction f2 = new Fraction(3,40); // 3/40
        Fraction f1 = new Fraction(30,97); // 30/97
        Fraction expResult = new Fraction(400,97);
        Fraction result = Fraction.divide(f1,f2);
        assertEquals(true, result.equals(expResult));        
    }
    */
    
}
