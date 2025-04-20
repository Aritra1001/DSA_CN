import java.util.*;

public class PrimeNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the input of the upper limit of the range
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
