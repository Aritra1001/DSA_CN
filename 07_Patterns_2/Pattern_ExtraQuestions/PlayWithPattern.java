// 1___1
// _2_2
// __1   n = 3
// _2_2
// 1___1

import java.util.*;

public class PlayWithPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        xPattern(n);
        sc.close();
    }

    public static void xPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // ith row
            // space
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }

            // nos. and inner spaces
            for (int j = i; j <= 2 * n - i; j++) {
                if (i == j || 2 * n - i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 2nd part
        for (int i = n - 1; i >= 1; i--) {
            // ith row
            // space
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }

            // nos. and inner spaces
            for (int j = i; j <= 2 * n - i; j++) {
                if (i == j || 2 * n - i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
