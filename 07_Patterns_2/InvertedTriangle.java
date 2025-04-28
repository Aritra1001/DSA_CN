// ****
// ***
// **
// *

import java.util.*;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            //in ith row
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
