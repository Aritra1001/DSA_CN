// ___1
// __123
// _12345

import java.util.*;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            // I am in ith row

            // Print spaces
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // print numbers till 2i - 1
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print(j);
                j++;
            }
            System.out.println();

            i++;
        }
        sc.close();
    }
}
