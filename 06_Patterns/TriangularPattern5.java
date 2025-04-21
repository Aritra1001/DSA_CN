// 5
// 54
// 543
// 5432
// 54321

import java.util.*;
public class TriangularPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // I am in ith row
            int p = n, j = 1;
            while(j <= i){
                System.out.print(p+ " ");
                p--;
                j++;
            }
            System.out.println();;
            i++;
        }
        sc.close();
    }
}
