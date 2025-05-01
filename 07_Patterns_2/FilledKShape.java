// 4 3 2 1
// 3 2 1 
// 2 1
// 1
// 2 1
// 3 2 1
// 4 3 2 1

import java.util.*;

public class FilledKShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        // 1st part
        while (i <= n) {
            // ith row
            int p = n - i + 1, j = 1;
            while (j <= n - i + 1) {
                System.out.print(p + " ");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
        // 2nd part
        i = n - 1;
        while (i >= 1) {
            int p = n - i + 1, j = 1;
            while (j <= n - i + 1) {
                System.out.print(p + " ");
                p--;
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
