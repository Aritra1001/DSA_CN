// Your task is to write a function named print_composite that prints if there are any composite numbers up to a given number, n.

import java.util.*;
public class CompositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printComposite(n);
        sc.close();
    }

    public static void printComposite(int n){
        for(int i = 2; i <= n; i++){
            if(isComposite(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isComposite(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return true;
            }
        }
        return false;
    }
}
