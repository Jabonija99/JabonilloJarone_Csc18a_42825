/* Chapter 2 Excersize 2.24

Largest and Smallest ints

Write an application that reads five ints and determines and prints the largest
and smallest ints in the group.

USE ONLY THE LEARNING TECHNIQUES YOU LEARNED IN THIS CHAPTER:
* Input/output
* printf
* math operations
* decision making

*/

package ch2.pkg24_bigsmallints;

import java.util.Scanner;

public class Ch224_BigSmallInts {
    public static void main(String[] args) {
        //Initiate scanner for input
        Scanner userIn = new Scanner (System.in);
        
        //Declare number variables
        int num1, num2, num3, num4, num5;
        
        //Prompt user
        System.out.println("Enter number 1:");
        num1 = userIn.nextInt();
        
        System.out.println("Enter number 2:");
        num2 = userIn.nextInt();
        
        System.out.println("Enter number 3:");
        num3 = userIn.nextInt();
        
        System.out.println("Enter number 4:");
        num4 = userIn.nextInt();
        
        System.out.println("Enter number 5:");
        num5 = userIn.nextInt();
        
        //Break lines
        System.out.println();
        System.out.println();
        
        //Begin sorting output
        System.out.printf("%9s\n", "Largest");
        System.out.println("===================");
        
        //If number 1 >= all
        if(num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5){
            System.out.println(num1);
            
            //If number 2 >
            if(num2 >= num3 && num2 >= num4 && num2 >= num5){
                System.out.println(num2);
                
                //If number 3 >
                if(num3 >= num4 && num3 >= num5){
                    System.out.println(num3);
                
                    //If number 4 >
                    if(num4 >= num5){
                        System.out.println(num4);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num4);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num3 && num4 >= num5){
                    System.out.println(num4);
                
                    //If number 3 >
                    if(num3 >= num5){
                        System.out.println(num3);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num3);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num3 && num5 >= num4){
                    System.out.println(num5);
                
                    //If number 3 >
                    if(num3 >= num4){
                        System.out.println(num3);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num3);
                    }
                }
            } 
            
            
            
            //If number 3 >
            else if(num3 >= num2 && num3 >= num4 && num3 >= num5){
                System.out.println(num3);
                
                //If number 2 >
                if(num2 >= num4 && num2 >= num5){
                    System.out.println(num2);
                
                    //If number 4 >
                    if(num4 >= num5){
                        System.out.println(num4);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num4);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num2 && num4 >= num5){
                    System.out.println(num4);
                
                    //If number 2 >
                    if(num2 >= num5){
                        System.out.println(num2);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num2);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num2 && num5 >= num4){
                    System.out.println(num5);
                
                    //If number 2 >
                    if(num2 >= num4){
                        System.out.println(num2);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num2);
                    }
                }
            }
            
            
            
            //If number 4 >
            else if(num4 >= num2 && num4 >= num3 && num4 >= num5){
                System.out.println(num4);
                
                //If number 2 >
                if(num2 >= num3 && num2 >= num5){
                    System.out.println(num2);
                
                    //If number 3 >
                    if(num3 >= num5){
                        System.out.println(num3);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num3);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num2 && num3 >= num5){
                    System.out.println(num3);
                
                    //If number 2 >
                    if(num2 >= num5){
                        System.out.println(num2);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num2);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num2 && num5 >= num3){
                    System.out.println(num5);
                
                    //If number 2 >
                    if(num2 >= num3){
                        System.out.println(num2);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num2);
                    }
                }
            }
            
            
            
            //If number 5 >
            else if(num5 >= num2 && num5 >= num3 && num5 >= num4){
                System.out.println(num5);
                
                //If number 2 >
                if(num2 >= num3 && num2 >= num4){
                    System.out.println(num2);
                
                    //If number 3 >
                    if(num3 >= num4){
                        System.out.println(num3);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num3);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num2 && num3 >= num4){
                    System.out.println(num3);
                
                    //If number 2 >
                    if(num2 >= num4){
                        System.out.println(num2);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num2);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num2 && num4 >= num3){
                    System.out.println(num4);
                
                    //If number 2 >
                    if(num2 >= num3){
                        System.out.println(num2);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num2);
                    }
                }
            }  
        }
        
        //Else if number 2 >= all
        else if(num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5){
            System.out.println(num2);
            
            //If number 1 >
            if(num1 >= num3 && num1 >= num4 && num1 >= num5){
                System.out.println(num1);
                
                //If number 3 >
                if(num3 >= num4 && num3 >= num5){
                    System.out.println(num3);
                
                    //If number 4 >
                    if(num4 >= num5){
                        System.out.println(num4);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num4);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num3 && num4 >= num5){
                    System.out.println(num4);
                
                    //If number 3 >
                    if(num3 >= num5){
                        System.out.println(num3);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num3);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num3 && num5 >= num4){
                    System.out.println(num5);
                
                    //If number 3 >
                    if(num3 >= num4){
                        System.out.println(num3);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num3);
                    }
                }
            } 
            
            
            
            //If number 3 >
            else if(num3 >= num1 && num3 >= num4 && num3 >= num5){
                System.out.println(num3);
                
                //If number 1 >
                if(num1 >= num4 && num1 >= num5){
                    System.out.println(num1);
                
                    //If number 4 >
                    if(num4 >= num5){
                        System.out.println(num4);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num4);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num1 && num4 >= num5){
                    System.out.println(num4);
                
                    //If number 1 >
                    if(num1 >= num5){
                        System.out.println(num1);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num1 && num5 >= num4){
                    System.out.println(num5);
                
                    //If number 1 >
                    if(num1 >= num4){
                        System.out.println(num1);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 4 >
            else if(num4 >= num1 && num4 >= num3 && num4 >= num5){
                System.out.println(num4);
                
                //If number 1 >
                if(num1 >= num3 && num1 >= num5){
                    System.out.println(num1);
                
                    //If number 3 >
                    if(num3 >= num5){
                        System.out.println(num3);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num3);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num1 && num3 >= num5){
                    System.out.println(num3);
                
                    //If number 1 >
                    if(num1 >= num5){
                        System.out.println(num1);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num1 && num5 >= num3){
                    System.out.println(num5);
                
                    //If number 1 >
                    if(num1 >= num3){
                        System.out.println(num1);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 5 >= 
            else if(num5 >= num1 && num5 >= num3 && num5 >= num4){
                System.out.println(num5);
                
                //If number 1 >
                if(num1 >= num3 && num1 >= num4){
                    System.out.println(num1);
                
                    //If number 3 >
                    if(num3 >= num4){
                        System.out.println(num3);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num3);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num1 && num3 >= num4){
                    System.out.println(num3);
                
                    //If number 1 >
                    if(num1 >= num4){
                        System.out.println(num1);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num1);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num1 && num4 >= num3){
                    System.out.println(num4);
                
                    //If number 1 >
                    if(num1 >= num3){
                        System.out.println(num1);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num1);
                    }
                }
            }  
        }
        
        //else if number 3 >= all
        else if(num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5){
            System.out.println(num3);
            
            //If number 1 >
            if(num1 >= num2 && num1 >= num4 && num1 >= num5){
                System.out.println(num1);
                
                //If number 2 >
                if(num2 >= num4 && num2 >= num5){
                    System.out.println(num2);
                
                    //If number 4 >
                    if(num4 >= num5){
                        System.out.println(num4);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num4);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num2 && num4 >= num5){
                    System.out.println(num4);
                
                    //If number 2 >
                    if(num2 >= num5){
                        System.out.println(num2);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num2);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num2 && num5 >= num4){
                    System.out.println(num5);
                
                    //If number 2 >
                    if(num2 >= num4){
                        System.out.println(num2);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num2);
                    }
                }
            } 
            
            
            
            //If number 2 >
            else if(num2 >= num1 && num2 >= num4 && num2 >= num5){
                System.out.println(num2);
                
                //If number 1 >
                if(num1 >= num4 && num1 >= num5){
                    System.out.println(num1);
                
                    //If number 4 >
                    if(num4 >= num5){
                        System.out.println(num4);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num4);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num1 && num4 >= num5){
                    System.out.println(num4);
                
                    //If number 1 >
                    if(num1 >= num5){
                        System.out.println(num1);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num1 && num5 >= num4){
                    System.out.println(num5);
                
                    //If number 1 >
                    if(num1 >= num4){
                        System.out.println(num1);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 4 >
            else if(num4 >= num1 && num4 >= num2 && num4 >= num5){
                System.out.println(num4);
                
                //If number 1 >
                if(num1 >= num2 && num1 >= num5){
                    System.out.println(num1);
                
                    //If number 2 >
                    if(num2 >= num5){
                        System.out.println(num2);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num2);
                    }
                }
                
                //If number 2 >
                else if(num2 >= num1 && num2 >= num5){
                    System.out.println(num2);
                
                    //If number 1 >
                    if(num1 >= num5){
                        System.out.println(num1);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num1 && num5 >= num2){
                    System.out.println(num5);
                
                    //If number 1 >
                    if(num1 >= num2){
                        System.out.println(num1);
                        System.out.println(num2);
                    }
                    //If number 2 >
                    else{
                        System.out.println(num2);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 5 >
            else if(num5 >= num1 && num5 >= num2 && num5 >= num4){
                System.out.println(num5);
                
                //If number 1 >
                if(num1 >= num2 && num1 >= num4){
                    System.out.println(num1);
                
                    //If number 2 >
                    if(num2 >= num4){
                        System.out.println(num2);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num2);
                    }
                }
                
                //If number 2 >
                else if(num2 >= num1 && num2 >= num4){
                    System.out.println(num2);
                
                    //If number 1 >
                    if(num1 >= num4){
                        System.out.println(num1);
                        System.out.println(num4);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num4);
                        System.out.println(num1);
                    }
                }
                
                //If number 4 >
                else if(num4 >= num1 && num4 >= num2){
                    System.out.println(num4);
                
                    //If number 1 >
                    if(num1 >= num2){
                        System.out.println(num1);
                        System.out.println(num2);
                    }
                    //If number 2 >
                    else{
                        System.out.println(num2);
                        System.out.println(num1);
                    }
                }
            }  
        }
        
        //else if number 4 >= all
        else if(num4 >= num2 && num4 >= num3 && num4 >= num4 && num4 >= num5){
            System.out.println(num4);
            
            //If number 1 >
            if(num1 >= num2 && num1 >= num3 && num1 >= num5){
                System.out.println(num1);
                
                //If number 2 >
                if(num2 >= num3 && num2 >= num5){
                    System.out.println(num2);
                
                    //If number 3 >
                    if(num3 >= num5){
                        System.out.println(num3);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num3);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num2 && num3 >= num5){
                    System.out.println(num3);
                
                    //If number 2 >
                    if(num2 >= num5){
                        System.out.println(num2);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num2);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num2 && num5 >= num3){
                    System.out.println(num5);
                
                    //If number 2 >
                    if(num2 >= num3){
                        System.out.println(num2);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num2);
                    }
                }
            } 
            
            
            
            //If number 2 >
            else if(num2 >= num1 && num2 >= num3 && num2 >= num5){
                System.out.println(num2);
                
                //If number 1 >
                if(num1 >= num3 && num1 >= num5){
                    System.out.println(num1);
                
                    //If number 3 >
                    if(num3 >= num5){
                        System.out.println(num3);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num3);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num1 && num3 >= num5){
                    System.out.println(num3);
                
                    //If number 1 >
                    if(num1 >= num5){
                        System.out.println(num1);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num1 && num5 >= num3){
                    System.out.println(num5);
                
                    //If number 1 >
                    if(num1 >= num3){
                        System.out.println(num1);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 3 >
            else if(num3 >= num1 && num3 >= num2 && num3 >= num5){
                System.out.println(num3);
                
                //If number 1 >
                if(num1 >= num2 && num1 >= num5){
                    System.out.println(num1);
                
                    //If number 2 >
                    if(num2 >= num5){
                        System.out.println(num2);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num2);
                    }
                }
                
                //If number 2 >
                else if(num2 >= num1 && num2 >= num5){
                    System.out.println(num2);
                
                    //If number 1 >
                    if(num1 >= num5){
                        System.out.println(num1);
                        System.out.println(num5);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num5);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num5 >= num1 && num5 >= num2){
                    System.out.println(num5);
                
                    //If number 1 >
                    if(num1 >= num2){
                        System.out.println(num1);
                        System.out.println(num2);
                    }
                    //If number 2 >
                    else{
                        System.out.println(num2);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 5 >
            else if(num5 >= num1 && num5 >= num2 && num5 >= num3){
                System.out.println(num5);
                
                //If number 1 >
                if(num1 >= num2 && num1 >= num3){
                    System.out.println(num1);
                
                    //If number 2 >
                    if(num2 >= num3){
                        System.out.println(num2);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num2);
                    }
                }
                
                //If number 2 >
                else if(num2 >= num1 && num2 >= num3){
                    System.out.println(num2);
                
                    //If number 1 >
                    if(num1 >= num3){
                        System.out.println(num1);
                        System.out.println(num3);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num3);
                        System.out.println(num1);
                    }
                }
                
                //If number 3 >
                else if(num3 >= num1 && num3 >= num2){
                    System.out.println(num3);
                
                    //If number 1 >
                    if(num1 >= num2){
                        System.out.println(num1);
                        System.out.println(num2);
                    }
                    //If number 2 >
                    else{
                        System.out.println(num2);
                        System.out.println(num1);
                    }
                }
            }  
        }
        
        //Else number 5 > all
        else{
            System.out.println(num5);
            
            //If number 2 >
            if(num1 >= num2 && num1 >= num3 && num1 >= num4){
                System.out.println(num1);
                
                //If number 3 >
                if(num2 >= num3 && num2 >= num4){
                    System.out.println(num2);
                
                    //If number 4 >
                    if(num3 >= num4){
                        System.out.println(num3);
                        System.out.println(num4);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num4);
                        System.out.println(num3);
                    }
                }
                
                //If number 4 >
                else if(num3 >= num2 && num3 >= num4){
                    System.out.println(num3);
                
                    //If number 3 >
                    if(num2 >= num4){
                        System.out.println(num2);
                        System.out.println(num4);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num4);
                        System.out.println(num2);
                    }
                }
                
                //If number 5 >
                else if(num4 >= num2 && num4 >= num3){
                    System.out.println(num4);
                
                    //If number 3 >
                    if(num2 >= num3){
                        System.out.println(num2);
                        System.out.println(num3);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num3);
                        System.out.println(num2);
                    }
                }
            } 
            
            
            
            //If number 3 >
            else if(num2 >= num1 && num2 >= num3 && num2 >= num4){
                System.out.println(num2);
                
                //If number 2 >
                if(num1 >= num3 && num1 >= num4){
                    System.out.println(num1);
                
                    //If number 4 >
                    if(num3 >= num4){
                        System.out.println(num3);
                        System.out.println(num4);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num4);
                        System.out.println(num3);
                    }
                }
                
                //If number 4 >
                else if(num3 >= num1 && num3 >= num4){
                    System.out.println(num3);
                
                    //If number 2 >
                    if(num1 >= num4){
                        System.out.println(num1);
                        System.out.println(num4);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num4);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num4 >= num1 && num4 >= num3){
                    System.out.println(num4);
                
                    //If number 2 >
                    if(num1 >= num3){
                        System.out.println(num1);
                        System.out.println(num3);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num3);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 4 >
            else if(num3 >= num1 && num3 >= num2 && num3 >= num4){
                System.out.println(num3);
                
                //If number 2 >
                if(num1 >= num2 && num1 >= num4){
                    System.out.println(num1);
                
                    //If number 3 >
                    if(num2 >= num4){
                        System.out.println(num2);
                        System.out.println(num4);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num4);
                        System.out.println(num2);
                    }
                }
                
                //If number 3 >
                else if(num2 >= num1 && num2 >= num4){
                    System.out.println(num2);
                
                    //If number 2 >
                    if(num1 >= num4){
                        System.out.println(num1);
                        System.out.println(num4);
                    }
                    //If number 5 >
                    else{
                        System.out.println(num4);
                        System.out.println(num1);
                    }
                }
                
                //If number 5 >
                else if(num4 >= num1 && num4 >= num2){
                    System.out.println(num4);
                
                    //If number 2 >
                    if(num1 >= num2){
                        System.out.println(num1);
                        System.out.println(num2);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num2);
                        System.out.println(num1);
                    }
                }
            }
            
            
            
            //If number 5 >
            else if(num4 >= num1 && num4 >= num2 && num4 >= num3){
                System.out.println(num4);
                
                //If number 2 >
                if(num1 >= num2 && num1 >= num3){
                    System.out.println(num1);
                
                    //If number 3 >
                    if(num2 >= num3){
                        System.out.println(num2);
                        System.out.println(num3);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num3);
                        System.out.println(num2);
                    }
                }
                
                //If number 3 >
                else if(num2 >= num1 && num2 >= num3){
                    System.out.println(num2);
                
                    //If number 2 >
                    if(num1 >= num3){
                        System.out.println(num1);
                        System.out.println(num3);
                    }
                    //If number 4 >
                    else{
                        System.out.println(num3);
                        System.out.println(num1);
                    }
                }
                
                //If number 4 >
                else if(num3 >= num1 && num3 >= num2){
                    System.out.println(num3);
                
                    //If number 2 >
                    if(num1 >= num2){
                        System.out.println(num1);
                        System.out.println(num2);
                    }
                    //If number 3 >
                    else{
                        System.out.println(num2);
                        System.out.println(num1);
                    }
                }
            }  
        }
        
        System.out.println("===================");
        System.out.printf("%10s\n", "Smallest");
        
    }
}