/*Chapter 2 Excersize 26

Multiples

Write an application that reads two integers, determines wheter the first is a 
multiple of the second and prints the result.

[Hint: Use the mod operator.]
 
 */
package ch2.pkg26_multiples;

import java.util.Scanner;

public class Ch226_Multiples {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Enter a number: ");
        num1 = userIn.nextInt();
        
        System.out.println("Enter a potential multiple of the number: ");
        num2 = userIn.nextInt();
        
        if(num2%num1 == 0){
            System.out.printf("%d is a multiple of %d.\n", num2, num1);
        }
        else{
            System.out.printf("%d is not a multiple of %d.\n", num2, num1);
        }
        
        
    }
}
