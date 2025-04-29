// ___1
// __232
// _34543
// 4567654


import java.util.*;
public class TriangleOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int space = 1;
            while(space <= n - i){
                System.out.print(" ");
                space += 1;
            }
            // increasing numbers
            int inc_no = i, currCol = 1;
            while(currCol <= i){
                System.out.print(inc_no);
                inc_no += 1;
                currCol += 1;
            }
            // decreasing numbers
            int dec_no = 2 * (i - 1);
            while(dec_no >= i){
                System.out.print(dec_no);
                dec_no -= 1;
            }
            System.out.println();
            i += 1;
        }
        sc.close();
    }
}
