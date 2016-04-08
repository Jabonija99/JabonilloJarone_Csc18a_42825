
package ch3_37_factorials_a;


import java.util.Scanner;

public class Ch3_37_Factorials_a {
    public static void main(String[] args) {
        //integer variables for User value, Factorial value, counter
        int usrVal, fctVal=1, counter;
        
        //Scanner for user input
        Scanner usrIn = new Scanner (System.in);
        
        //User prompt
        System.out.println("Enter a nonnegative value: ");
        //Assigns input to user value
        usrVal = usrIn.nextInt();
        
        //If user value is positive
        if(usrVal > -1){
            //Calculate factorial
            for(counter = usrVal; counter > 0; counter--){
                fctVal *= counter;
            }
            
            //Output answer
            System.out.printf("The factorial of %d is %d.\n", usrVal, fctVal);
        }
        //If user value is negative
        else{
            System.out.println("Invalid input!");
        }
        
        
    }
    
}
