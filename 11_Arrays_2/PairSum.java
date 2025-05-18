/*
 * 
 * You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the 
 * array/list which sum to X.

Note:
Given array/list can contain duplicate elements. 
 */


import java.util.*;

public class PairSum {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
         int n = takeInput("Enter the length of the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = takeInput("Enter the element at " + i + " th index: ");
        }
        int x = takeInput("Enter the target value: ");

        int count = pairSum(arr, x);

        System.out.println("Number of pairs: " + count);
    }

    public static int pairSum(int arr[], int x){
        int ans = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    ans++;
                }
            }
        }
        return ans;
    }
}
