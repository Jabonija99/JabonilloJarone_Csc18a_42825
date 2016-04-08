
//Returns the GCD of two numbers

package ch5_27_gcd;

import java.util.Scanner;

public class Ch5_27_GCD {

    public static void main(String[] args) {
        Scanner userIn = new Scanner (System.in);
        int num1, num2; //Variables to hold user numbers
        
        //Prompt user for first number
        System.out.println("Enter the first value: ");
        num1 = userIn.nextInt();
        
        //Prompt user for second number
        System.out.println("Enter the second value: ");
        num2 = userIn.nextInt();
        
        //Output numbers and result
        System.out.printf("The GCD of %d and %d is %d.\n", num1, num2, 
                gcd(num1,num2));
        
        
    }
    
    //Calculates the gcd of two numbers
    public static int gcd(int num1, int num2){
        //Value for the gcd and i counter
        int gcdVal = 0, i = 1;
        
        //While the counter has not reached the number
        while(i <= num1){
            //If the first number is divisible
            if(num1%i == 0){
                //If the second number is divisible
                if(num2%i == 0){
                    //Set the gcd value to counter
                    gcdVal = i;
                }
            }
            
            //Increment counter
            i++;
        }
        
        //Return the gcd value
        return gcdVal;
    }
}
