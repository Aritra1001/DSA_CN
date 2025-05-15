
import java.util.*;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the array: ");
        int cap = sc.nextInt();
        int arr[] = new int[cap];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at " + i + " ith index: ");
            arr[i] = sc.nextInt();
        }
        int l = 0, r = arr.length - 1;

        reverseArray(arr, l, r);

        System.out.println("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int arr[], int l, int r) {
        int temp = 0;
        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

    }
}
