// Create a function that determines whether a given number N belongs to the Fibonacci sequence. If N is found in the Fibonacci sequence,
//  the function should return true; otherwise, it should return false.

import java.util.*;
public class FibonacciMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkFibonacciMember(n));
        sc.close();
    }

    public static boolean checkFibonacciMember(int n){
        int num1 = 0, num2 = 1, num3;
        while(num1 < n){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;   
        }
        if(num1 == n){
            return true;
        }
        return false;
    }
}
