// 123
// 1 2
// 123

import java.util.*;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 1st and last row print all the numbers
                if (i == 1 || i == n) {
                    System.out.print(j);
                } else {
                    // middle row prints 1 and 2 in the 1st and last column and in the middle spaces
                    if (j == 1) {
                        System.out.print(1);
                    } else if (j == n) {
                        System.out.print(2);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            ;
        }
        sc.close();
    }
}
