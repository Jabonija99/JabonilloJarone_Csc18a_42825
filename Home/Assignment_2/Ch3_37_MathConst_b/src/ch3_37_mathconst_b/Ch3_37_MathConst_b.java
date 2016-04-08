
package ch3_37_mathconst_b;

import java.util.Scanner;

public class Ch3_37_MathConst_b {
    public static void main(String[] args) {
        //Mathematical constant e
        float e = 0;
        //Number of terms, counter
        int nTerms, counter;
        
        //Scanner for user input
        Scanner userIn = new Scanner (System.in);
        
        //User Prompt
        System.out.println("Enter the number of terms: ");
        //Read in value
        nTerms = userIn.nextInt();
        
        if(nTerms > -1){
            
            
            //Calculate mathematical constant e
            for(counter = 0; counter < nTerms; counter++){
                //Factorial value
                int fVal=1;
                
                //Calculate factorial
                for(int i = counter; i > 0; i--){
                    fVal *= i;
                }
                //Add quotient to constant
                e += 1 / (float)fVal;
            }
        
            //Output results
            System.out.printf("The value of the mathematical constant with %d"
                    + " terms is %f.\n",nTerms, e);
            
        }
        else{
            //Prompt error
            System.out.println("Error: Invalid input!");
        }
        
        
        
        
        
    }
}
