// Write a program to print the first x terms of the mathematical series 3N + 2 which are not multiples of 4.

// The series is defined as:

// T(N) = 3N + 2, where N is a positive integer starting from 
// 1. Your task is to print the first x terms of this series, but you should exclude any term that is a multiple of 4.

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 0;
        int count = 0;
        for (int n = 1; n <= (x + count); n++) {
            res = 3 * n + 2;
            if (res % 4 == 0) {
                count++;
                continue;
            }
            System.out.print(res + " ");

        }
        sc.close();
    }
}
