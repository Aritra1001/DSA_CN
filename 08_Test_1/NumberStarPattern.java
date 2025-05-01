// 5432*
// 543*1
// 54*21
// 5*321
// *4321


import java.util.*;
public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j = n;
            while(j >= 1){
                if(j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
                j--;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
