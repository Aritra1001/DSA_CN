// write a program to find the sum of even and odd digits of a number


import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum_even = 0, sum_odd = 0;
        while(n != 0){
            int ld = n % 10;
            if(ld % 2 == 0){
                sum_even += ld;
            }
            else{
                sum_odd += ld;
            }
            n = n / 10;
        }
        System.out.println(sum_even + " " + sum_odd);
        sc.close();
    }
}
