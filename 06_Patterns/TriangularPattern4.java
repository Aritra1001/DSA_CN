// 1
// 22
// 333
// 4444


import java.util.*;
public class TriangularPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            //  I am in ith roww
            int j = 1;
            while(j <= i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
