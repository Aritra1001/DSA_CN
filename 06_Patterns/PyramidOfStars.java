// ___*
// __***
// _*****
// *******


import java.util.*;
public class PyramidOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for the rows
        for(int i =1; i<=n; i++){
            // I am in ith row

            // print spaces n-i
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            // print stars 2i-1
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
