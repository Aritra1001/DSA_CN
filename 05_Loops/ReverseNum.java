/*
 * Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
 */


import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int revNum = 0;
        while(n!=0){
            int ld = n % 10;
            revNum = (revNum*10)+ld;
            n=n/10;
        }
        System.out.println(revNum);
        sc.close();
    }
}
