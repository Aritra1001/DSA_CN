// A
// AB
// ABC

import java.util.*;

class AlphabetGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            // ith row
            int j = 1;
            char p = 'A';
            while (j <= i) {
                System.out.print(p + " ");
                p = (char) (p + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}