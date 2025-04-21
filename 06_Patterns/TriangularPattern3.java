// 1
// 23
// 345
// 4567

import java.util.*;

public class TriangularPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // I am in ith row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }
            System.out.println();
        }

        // Another approach for this problem
        int a = 1;
        while (a <= n) {
            // I am in ith row
            int b = 1, p = a;
            while (b <= a) {
                System.out.print(p);
                p++;
                b++;
            }

            System.out.println();
            a++;
        }

        sc.close();
    }
}
