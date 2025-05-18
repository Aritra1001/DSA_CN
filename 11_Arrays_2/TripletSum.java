/*
 * 
 * You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the 
 * array/list which sum to X.

Note :
Given array/list can contain duplicate elements.
 */

import java.util.*;

public class TripletSum {

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

       int count = findTriplets(arr, x);
       System.out.println("Number of triplets: " + count);
    }

    public static int findTriplets(int arr[], int x){
        int ans = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
