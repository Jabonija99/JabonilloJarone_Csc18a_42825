/*Chapter 4 Excersize 20

Calculating PI
*/

package ch4_20_calcpi;

/* 
    ANSWER: 93728 is the first term you get that equals 3.14159.
*/

public class Ch4_20_CalcPi {
    public static void main(String[] args) {
        //Answer variable
        float ans = 0;
        //Divisor counter
        int div = 1;
        
        //Loop for 200000 terms
        for(int i = 0; i < 200000; i++){

            //If it is an even number
            if(i%2 == 0){
                //Add the value
                ans += 4.0/(float)div;
            }
            else{
                //Subtract the value
                ans -= 4.0/(float)div;
            }

            //Increment the divisor by 2
            div += 2;

            //Output term # and answer
            System.out.printf("%d: %.5f   ",i+1, ans);

            //If the answer = 3.14159 output true else false
            System.out.println(ans <= 3.141594 && ans > 3.141585 
                    ? "True***" : "False");

        }
    }
    
}
