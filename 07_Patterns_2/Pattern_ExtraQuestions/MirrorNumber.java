// ___1
// __12
// _123
// 1234

import java.util.*;
public class MirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mirrorNumberPattern(n);
        sc.close();
    }

    public static void mirrorNumberPattern(int n){
        int i = 1;
        while(i <= n){
            // spaces
            int space = 1;
            while(space <= n - i){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
