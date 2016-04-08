
package recursive_square;

import java.util.Scanner;

public class Recursive_Square {
    public static void main(String[] args) {
        Scanner userIn = new Scanner (System.in);
        int userNum, exp;
        
        System.out.println("Enter the base value: ");
        userNum = userIn.nextInt();
        
        System.out.println("Enter the exponent: ");
        exp = userIn.nextInt();
        
        System.out.printf("%d to the power of %d is %d.\n", userNum, exp, 
                expnent(userNum, exp));
                
        
    }
    
    public static int expnent(int num, int exp){
       if(exp == 0)
           return 1;
        
       int pow = num;
       
       if(exp > 1){
           pow *= expnent(num, exp-1);
       }
     
       return pow;
    }
    
}
