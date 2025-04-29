// E
// ED
// EDC
// EDCB
// EDCBA


import java.util.*;
public class ReverseCharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // ith row
            // ith character
            char p = (char)('A' + n - 1);
            int j = 1;
            while(j <= i){
                System.out.print(p);
                j++;
                p = (char)(p - 1);
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
