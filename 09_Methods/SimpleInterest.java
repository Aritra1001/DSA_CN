import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        System.out.println(calculateInterest(principal, rate, time));
        sc.close();
    }

    public static int calculateInterest(int principal, double rate, int time) {
        int simpleInt = (int) ((principal * rate * time) / 100);
        return simpleInt;
    }
}
