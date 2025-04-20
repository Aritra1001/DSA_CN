import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
