// ___*
// __***
// _*****
// *******


import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStarPattern(n);
        sc.close();
    }

    public static void printStarPattern(int n){
        int i = 1;
        while(i <= n){
            int space = 1;
            while(space <= n - i){
                System.out.print(" ");
                space++;
            }

            int stars = 1;
            while(stars <= 2 * i - 1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
