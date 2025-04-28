// E
// DE
// CDE
// BCDE
// ABCDE


import java.util.*;
public class CharacterPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // in ithe row
            char p = (char)('A' + n - i); //ith character
            int j = 1;
            while(j <= i){
                System.out.print(p);
                p = (char)(p + 1);
                j = j+1;
            }
            System.out.println();
            i = i + 1;
        }
        sc.close();
    }
}
