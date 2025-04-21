// 4321                 321
// 4321 for n = 4       321 for n = 3
// 4321                 321
// 4321                 321

import java.util.*;
public class SquarePattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // Another approach for this pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(n - j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
