
package ch3_37_computeval_c;

import java.util.Scanner;

public class Ch3_37_ComputeVal_c {
    public static void main(String[] args) {
        //Mathematical constant e
        float e = 0;
        //Number of terms, counter, exponent, x value
        int nTerms, counter, nExpnt;
        
        //Scanner for user input
        Scanner userIn = new Scanner (System.in);
        
        //Prompt user number of terms
        System.out.println("Enter the number of terms: ");
        //Read in value
        nTerms = userIn.nextInt();
        
        //Prompt user exponent
        System.out.println("Enter exponent value: ");
        //Assign exponent
        nExpnt = userIn.nextInt();
        
        
        if(nTerms > -1 && nExpnt > -1){
            //Calculate mathematical constant e
            for(counter = 0; counter < nTerms; counter++){
                //Factorial value
                int fVal=1;
                //Exponent value
                int eVal = 1;
                
                
                //Calculate factorial
                for(int i = counter; i > 0; i--){
                    fVal *= i;
                }
                
                //Calculate exponent
                for (int i = 0; i < counter; i++){
                    eVal*=nExpnt;
                }
                
                //Add quotient to constant
                e += eVal / (float)fVal;
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
