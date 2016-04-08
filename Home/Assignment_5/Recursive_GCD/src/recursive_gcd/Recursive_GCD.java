
package recursive_gcd;

import java.util.Scanner;

public class Recursive_GCD {
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
    
    public static int gcd(int num1, int num2){
        int gcdVal;
        
        if(num1%num2 !=0 && num2%num1 !=0){
            if(num1 > num2){
                gcdVal = gcd(num2, num1%num2);
            }
            else{
                gcdVal = gcd(num1, num2%num1);
            }
        }
        else{
            if(num1 > num2){
                gcdVal = num2;
            }
            else{
                gcdVal = num1;
            }
        }
        
        return gcdVal;
    }
}
