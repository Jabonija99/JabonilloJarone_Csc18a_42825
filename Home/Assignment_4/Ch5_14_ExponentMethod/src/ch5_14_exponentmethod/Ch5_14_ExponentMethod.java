
package ch5_14_exponentmeth0od;

//Writes a method to return the value of a base to the power of an exponent

import java.util.Scanner;

public class Ch5_14_ExponentMethod {

   //Main
    public static void main(String[] args) {
       int base, expnt;
       
       Scanner userIn = new Scanner(System.in);
       
       System.out.println("Enter the base: ");
       base = userIn.nextInt();
       
       System.out.println("Enter the exponent: ");
       expnt = userIn.nextInt();
       
       System.out.printf("The power of %d and %d is %d.\n",base,expnt, 
               intPow(base,expnt));
        
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
