import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(permutation(n, r));
        sc.close();
    }
    public static int permutation(int n, int r){
        if(n < r || n < 0 || r < 0){
            return -1;
        }
        int factN = factorial(n);
        int factNR = factorial((n - r));
        // int permutation = factN / factNR;
        return factN / factNR;
    }
    public static int factorial(int num){
        int facto = 1;
        for(int i = num; i > 0; i--){
            facto *= i;
        }
        return facto;
    }
}
