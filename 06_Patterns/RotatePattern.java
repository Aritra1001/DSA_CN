// 1 2 3
// 2 3 1
// 3 1 2



import java.util.*;
public class RotatePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            // for first half of triangle
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }
            // 2nd half of triangle
            for(int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
