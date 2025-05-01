// ____1
// ___1 1
// __1 2 1   n = 5
// _1 3 3 1
// 1 4 6 4 1


import java.util.*;
public class PascalsTriangle {
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
            int num = 1, j = 1;
            while(j <= i){
                System.out.print(num + " ");
                num = num * (i - j)/j;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
