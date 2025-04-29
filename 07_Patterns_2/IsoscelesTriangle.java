// ___1
// __121
// _12321
// 1234321


import java.util.*;
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // ith row
            // spaces
            int space = 1;
            while(space <= n-i){
                System.out.print(" ");
                space++;
            }
            // increasing numbers
            int num = 1;
            while(num <= i){
                System.out.print(num);
                num++;
            }
            // decreasing numbers
            int dec = i - 1;
            while(dec >= 1){
                System.out.print(dec);
                dec--;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }    
}
