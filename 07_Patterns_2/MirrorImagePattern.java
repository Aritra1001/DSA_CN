// _ _ _ *
// _ _ * *
// _ * * *
// * * * *




import java.util.*;
public class MirrorImagePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // ith row
            // spaces
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(" ");
                spaces = spaces + 1;
            }
            // stars
            int stars = 1;
            while(stars <= i){
                System.out.print("*");
                stars = stars + 1;
            }
            System.out.println();
            i = i + 1;
        }
        sc.close();
    }
}
