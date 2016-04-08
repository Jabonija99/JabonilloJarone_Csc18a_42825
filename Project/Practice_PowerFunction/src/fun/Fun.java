package fun;

import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = userIn.nextInt();
        System.out.println("Enter a power: " );
        int y = userIn.nextInt();
        
        System.out.println("Answer: " + power(x,y) + "\n");
    }
    
    static int power(int num, int pow){
        int ans = num;
        for(int i = 1; i < pow; i++){
            ans *=num;
        }
        return ans;
    }
}
