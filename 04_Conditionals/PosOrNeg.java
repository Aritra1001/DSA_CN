import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Negative number");;
        }
        else {
            System.out.println("Positive number");
        }
        sc.close();
    }
}
