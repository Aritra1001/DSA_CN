// A
// A B
// A B C


import java.util.*;
public class AlphabetGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            char p = 'A';
            int j = 1;
            while(j <= i){
                System.out.print(p + " ");
                p = (char)(p + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}