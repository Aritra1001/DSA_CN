// 1
// 23
// 456
// 78910 



import java.util.*;
public class TriangularPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for(int i = 1; i <= n; i++){
            // now I am in ith row
            for(int j = 1; j <= i; j++){
                System.out.print(p);
                p++;
            }
            System.out.println();;
        }
        sc.close();
    }
}
