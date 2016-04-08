/*
This program reviews:
* Input/Output in Java
* Scanner utility 
    - Used for input
* Printf specifiers
    - Can be used to input data within output
* Datatypes
    - Stores values
* Mathematical Arguments
*/

package printf_example;

//Imports the scanner class
import java.util.Scanner;

//Class for program
public class Printf_example {
    public static void main(String[] args) {
        /**  REVIEW PRINTF SPECIFIER REFERENCES FOR MORE INFO  **/
        //** Notes **//
        /*
            - printf specifiers have similar functionality as several c++ output
            modifiers:
                *fixed
                *fill
                *Left/Right
                *setw()
        */
        
        //Left Justified output with width of 4
        System.out.println("** Left justified (4) **");
        System.out.printf("%-4d\n",1);      //Outputs 1
        System.out.printf("%-4d\n",13);     //Outptus 13
        System.out.printf("%-4d\n",263);    //Outputs 263
        System.out.printf("%-4d\n",1114);   //Outputs 1114
        System.out.println(); //Prints an empty line
        
        //Right Justified output with width of 4
        System.out.println("** Right justified (4)  **");
        System.out.printf("%4d\n",1);       //Outputs 1
        System.out.printf("%4d\n",13);      //Outputs 13
        System.out.printf("%4d\n",263);     //Outputs 263
        System.out.printf("%4d\n",1114);    //Outputs 1114
        System.out.println(); //Prints an empty line
        
        //Right Justified width of 5 with zero fill
        System.out.println("** Right justified with zero filled (5) **");
        System.out.printf("%05d\n",1);       //Outputs 1
        System.out.printf("%05d\n",13);      //Outputs 13
        System.out.printf("%05d\n",263);     //Outputs 263
        System.out.printf("%05d\n",1114);    //Outputs 1114
        System.out.println(); //Prints an empty line
        
        //Right justificiation with the floating specifier of 3
        System.out.println("** Right justified floats(.3)  **");
        System.out.printf("%.3f\n",.1333);      //Outputs 1
        System.out.printf("%.3f\n",1.3);     //Outptus 13
        System.out.printf("%.3f\n",.263);    //Outputs 263
        System.out.printf("%.3f\n",11.14);   //Outputs 1114
        System.out.println(); //Prints an empty line
        
         //Right justificiation with 8 digits and 3 decimals
        System.out.println("** Right justified floats(8.3)  **");
        System.out.printf("%8.3f\n",.133);   //Outputs 1
        System.out.printf("%8.3f\n",1.3);     //Outptus 13
        System.out.printf("%8.3f\n",.263);    //Outputs 263
        System.out.printf("%8.3f\n",11.14);   //Outputs 1114
        System.out.println(); //Prints an empty line
        
        
        
        //============================================================
        /**  REVIEW DATA TYPES  **/
        
         //Creates a scanner that recieves user input from the keyboard
        Scanner userIn = new Scanner(System.in);
        
        //User prompt
        System.out.print("Enter an integer value: ");
        
        //Data type for integer
        int x;
        //Receives the next integer from the scanner
        x = userIn.nextInt();
        
        //Inputted integer value
        System.out.println("** Inputted Value **");
        System.out.printf("%-4d\n",x);        //Outputs x
        System.out.printf("%-4d\n",x+13);     //Outptus x+13
        System.out.printf("%-4d\n",x+263);    //Outputs x+263
        System.out.printf("%-4d\n",x+1114);   //Outputs x+1114
        System.out.println(); //Prints an empty line
        
        //Integer division with floats
        System.out.println("** Division **");
        System.out.printf("%d / 7 = %d\n",11,11/7);    //Integer division
        System.out.printf("%d %% 7 = %d\n",11,11%7);   //Mod Operator
        System.out.printf("%8.4f\n",11/7.0);      //Integer to float conversion
        System.out.println(); //Prints an empty line
        
        /** Static Casting **/
        int a = 5;
        int b = 3;
        //Output formula with static cast (float)
        System.out.printf("%d / %d = %f\n", a, b, (float)a/b);
        
        
        //=============================================================
        
    }
    
}
