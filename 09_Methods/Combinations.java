

import java.util.*;
public class Combinations{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of n and r respectively");
        long n = sc.nextLong();
        long r = sc.nextLong();

        // if the user enters a negative number, I dont want to calculate the factorial of that
        if(n < 0 || r < 0){
            System.out.println("Invalid number");
            return;
        }

        long factN = factorial(n), factR = factorial(r), factNR = factorial((n - r));
        long nCr = factN / (factR * factNR);

        System.out.println(nCr);
        sc.close();
    }

    public static long factorial(long num){
        long factorial = 1l;
        for(long i = num; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
}