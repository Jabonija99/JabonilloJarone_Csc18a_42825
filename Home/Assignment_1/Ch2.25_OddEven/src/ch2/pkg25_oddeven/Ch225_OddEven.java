/* Chapter 2 Excersize 2.25

Odd or Even

Write an application that reads an integer and determines and prints whether 
it's odd or even. 

[Hint: User the remainder operator. An even number is a multiple of 2. Any 
multiple of 2 leaves a remainder of 0 when divided by 2.]


 */
package ch2.pkg25_oddeven;

import java.util.Scanner;

public class Ch225_OddEven {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        
        int num;
        
        System.out.println("Enter a number: ");
        num = userIn.nextInt();
        
        if(num%2 == 0){
            System.out.printf("%d is even!\n", num);
        }
        else{
            System.out.printf("%d is odd!\n", num);
        }
        
        
    }
    
}
