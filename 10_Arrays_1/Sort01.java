// You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
//  Write a function to sort this array/list. Think of a solution which scans the array/list only once 
//  and don't require use of an extra array/list.

// Note:
// You need to change in the given array/list itself. Hence, no need to return or print anything. 

import java.util.*;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n Enter the element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array = ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void sortZeroesAndOnes(int arr[]) {
        int placeZeroHere = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[placeZeroHere];
                arr[placeZeroHere] = temp;
                placeZeroHere++;
            }
        }
    }
}
