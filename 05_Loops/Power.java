// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

// Note : For this question, you can assume that 0 raised to the power of 0 is 1

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = 1;
        while (n != 0) {
            res = res * x;
            n--;
        }
        System.out.println(res);
        sc.close();
    }
}
