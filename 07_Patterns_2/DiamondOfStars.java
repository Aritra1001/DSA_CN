// __*
// _***
// *****
// _***
// __*

import java.util.*;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1st part or above part
        int i = 1;
        while (i <= n / 2 + 1) {
            // ith row
            int space = 1;
            while (space <= n / 2 + 1 - i) {
                System.out.print(" ");
                space++;
            }
            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
        // below part
        i = n / 2;
        while (i >= 1) {
            // ith row
            int space = 1;
            while (space <= n / 2 + 1 - i) {
                System.out.print(" ");
                space++;
            }
            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("*");
                stars++;
            }
            i--;
            System.out.println();
        }
        sc.close();
    }
}
