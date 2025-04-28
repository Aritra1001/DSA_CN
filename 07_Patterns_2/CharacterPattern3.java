// ABCD
// BCDE
// CDEF
// DEFG


import java.util.*;
public class CharacterPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // in ith row
            char p = (char)('A' + i - 1); //ith character
            int j = 1;
            while(j <= n){
                System.out.print(p);
                p = (char)(p + 1);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        sc.close();
    }
}
