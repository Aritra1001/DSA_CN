// Input: 9 3 6 12 4 32
// Output: 3 9 12 6 32 4

// Input: 9 3 6 12 4 32 5 11 19
// OUtput 3 9 12 6 32 4 11 5 19

import java.util.*;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n Enter the element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        swapAlternateElements(arr);
        sc.close();
    }

    public static void swapAlternateElements(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
