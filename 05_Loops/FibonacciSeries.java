import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the series");
        int count = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while(count - 2 > 0){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            count--;
        }
        sc.close();
    }
}
