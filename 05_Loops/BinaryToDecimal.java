// Given a binary number as an integer N, convert it into decimal and print.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, decVal = 0, base = 1;
        while (temp > 0) {
            int ld = temp % 10;
            decVal = decVal + ld * base;
            temp = temp / 10;
            base = base * 2;
        }
        System.out.print(decVal);
        sc.close();
    }
}
