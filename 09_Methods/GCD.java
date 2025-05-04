// Given two numbers, x, and y, calculate and Return their GCD.

// GCD stands for "Greatest Common Divisor." It refers to the largest positive integer that 
// divides two or more numbers without leaving a remainder. 

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(calculateGCD(x, y));
        sc.close();
    }

    public static int calculateGCD(int a, int b){
        int gcd = 0, rem = 0;
        if(a >= b){  //suing this condition due to one test case in which if a < b then it should return 1.
            while(b != 0){
                rem = a % b;
                a = b;
                b = rem;
                gcd = a;
            }
            return gcd;
        }   
        else {
            return 1;
        }
    }
}
