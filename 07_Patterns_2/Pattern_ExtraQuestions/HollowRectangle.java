// **    m = 2, n = 2        
// **

// ***
// * *   m = 4, n = 3
// * *
// ***




import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and breadth of the rectangle respectively");
        int m = sc.nextInt();
        int n = sc.nextInt();
        printHollowRectangle(m, n);
        sc.close();
    }

    public static void printHollowRectangle(int m, int n){
        int i = 1;
        while(i <= m){
            int j = 1;
            while(j <= n){
                if(i == 1 || i == m){
                    System.out.print("*");
                }
                else{
                    if(j == 1 || j == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
