import java.util.*;
public class IndividualDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        while(n != 0){
            System.out.println(n % 10);
            n = n/10;
        }
        sc.close();
    }
}
