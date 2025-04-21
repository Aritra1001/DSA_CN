// 1111             111
// 2222 for n = 4   222 for n = 3 
// 3333             333
// 4444


import java.util.*;
public class SquarePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
