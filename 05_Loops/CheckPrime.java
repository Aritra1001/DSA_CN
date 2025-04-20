import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not a Prime Number");
        }
        else System.out.println("Prime Number");
        sc.close();
    }
}
