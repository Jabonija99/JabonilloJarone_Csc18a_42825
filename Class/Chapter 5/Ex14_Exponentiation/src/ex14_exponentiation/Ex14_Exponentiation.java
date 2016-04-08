
package ex14_exponentiation;

//Writes a method to return the value of a base to the power of an exponent

import java.util.Random;

public class Ex14_Exponentiation {

    private static final int NUM= 5;
    //Main
    public static void main(String[] args) {
       Random rand = new Random();
   
        
       //Random int
       int num1 = 1 + rand.nextInt(6), num2 = rand.nextInt(4);
       //Calculates and outputs power
       System.out.printf("The power of %d and %d is %d.\n",num1,num2, 
               intPow(num1,num2));
       
       //Random double
       double num3 = rand.nextDouble();
       //Output value
       System.out.println(num3);
       
       //Output constant
       System.out.println(NUM);
        
    }
    
    //Power Method
    public static int intPow(int base, int exp){
        int power=1;
        
        for(int i = 0; i < exp; i++){
            power*=base;
        }
        
        return power;
    }
    
    
}
