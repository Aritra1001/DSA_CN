// Given a number N, find its square root. You need to find and print only the integral part of square root of N.

// For eg. if number given is 18, answer is 4.

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square_root = (int) Math.sqrt(n);
        System.out.println(square_root);
        sc.close();
    }
}
