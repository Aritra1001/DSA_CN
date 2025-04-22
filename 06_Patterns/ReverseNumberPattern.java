// 1
// 21
// 321
// 4321


import java.util.*;
public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int p = i, j = 1;
            while(j <= i){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
