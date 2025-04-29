// ___*
// __***
// _*****
// *******

import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // ith row
            // spaces
            int space = 1;
            while(space <= n - i){
                System.out.print(" ");
                space++;
            }
            int stars = 1;
            while(stars <= 2 * i - 1){
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
