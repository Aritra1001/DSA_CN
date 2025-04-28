// AAA
// BBB
// CCC

import java.util.*;
public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            // in ith row
            for(int j = 1; j <= n; j++){
                System.out.print((char)('A' + i - 1));
            }
            System.out.println();
        }
        sc.close();
    }
}
