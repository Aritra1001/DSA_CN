// 1 2 3 4 5
//  2 3 4 5
//   3 4 5
//    4 5
//     5
//    4 5
//   3 4 5
//  2 3 4 5
// 1 2 3 4 5


import java.util.*;
public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        // 1st part till nth row
        while(i <= n){
            // ith row
            // spaces
            int space = 1;
            while(space <= i - 1){
                System.out.print(" ");
                space++;
            }
            // numbers
            int num = i;
            while(num <= n){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            i++;
        }

        // 2nd part
        i = n- 1;
        while(i >= 1){
            // space
            int space = 1;
            while(space <= i - 1){
                System.out.print(" ");
                space++;
            }
            // num
            int num = i;
            while(num <= n){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();;
            i--;
        }
        sc.close();
    }
}
