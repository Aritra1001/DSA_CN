/*
 * You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and 
 * you need not worry about the array.

Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

 *  N = 9
 * 1 3 5 7 9 8 6 4 2
 */

import java.util.*;

public class NumberArrangement {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter the length of the array: ");
        int arr[] = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = takeInput("Enter the element at " + i + " th index");
        // }
    
        arrange(arr, n);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void arrange(int arr[], int n){
        int l = 0, r = n - 1, ele = 1;
        while(l < r){
            arr[l++] = ele++;
            arr[r--] = ele++;
        }
        if(n % 2 != 0){
            arr[l] = ele;
        }
    }
}
