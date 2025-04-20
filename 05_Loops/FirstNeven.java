import java.util.*;
public class FirstNeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many even numbers you want to see from 1 to 50");
        int count = sc.nextInt();
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                if(count > 0){
                    System.out.println(i);
                    count--;
                }
            }
        }
        sc.close();
    }
}
