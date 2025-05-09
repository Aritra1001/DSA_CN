// ___1
// __123
// _12345

import java.util.*;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            
            // inner loop to print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print star
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            // print new line for each row
            System.out.println();
        }
        sc.close();
    }
}
