
import java.util.*;

public class PrefixSum {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int len = takeInput("Enter the length of the array: ");
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = takeInput("Enter the element at " + i + " th index: ");
        }

        prefixSum(arr, len);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void prefixSum(int a[], int len) {

        // using two arrays

        // int p[] = new int[len];
        // int i = 0;
        // while (i < len) {
        //     int j = 0, sum = 0;
        //     while (j <= i) {
        //         sum += a[j];
        //         j++;
        //     }
        //     p[i] = sum;
        //     i++;
        // }
        // System.out.print("Prefix Sum array: ");
        // for(int k : p){
        //     System.out.print(k + " ");
        // }



        // using that particular array, storing the prefix sum in that array
        for(int i = 1; i < len; i++){
            a[i] += a[i - 1];
        }
    }
}
