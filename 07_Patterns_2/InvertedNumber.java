// 4444
// 333
// 22
// 1

import java.util.*;
public class InvertedNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int p = n - i + 1;
            int j = 1;
            while(j <= n - i + 1){
                System.out.print(p);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        sc.close();
    }
}