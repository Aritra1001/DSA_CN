
import java.util.*;

public class SumTwoArrays {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int len1 = takeInput("Enter the length of the first array: ");
        int arr1[] = new int[len1];
        for(int i = 0; i < len1; i++){
            arr1[i] = takeInput("Enter the element at " + i + " th index: ");
        }

        int len2 = takeInput("Enter the length of the second array: ");
        int arr2[] = new int[len2];
        for(int i = 0; i < len2; i++){
            arr2[i] = takeInput("Enter the element at " + i + " th index: ");
        }

        int sum[] = new int[Math.max(len1, len2)+1];

        calculateSum(arr1, len1, arr2, len2, sum);

        System.out.print("Sum of two arrays: ");
        for(int i : sum){
            System.out.print(i + " ");
        }
    }

    public static void calculateSum(int a[], int len1, int b[], int len2, int sum[]){
        int i = len1 - 1, j = len2 - 1, k = sum.length - 1, total = 0, carry = 0;

        // loop until the places where both the arrays have numbers
        while(i >= 0 && j >= 0){
            total = a[i] + b[j] + carry;
            sum[k] = total % 10;
            carry = total / 10;
            i--;
            j--;
            k--;
        }

        // Now we will check which array has extra places, for that we need to write separate logics
        if(len1 > len2){
            while (i >= 0) {
                total = a[i] + carry;
                sum[k] = total % 10;
                carry = total / 10;
                i--;
                k--;
            }
        }
        else{
            while(j >= 0){
                total = b[j] + carry;
                sum[k] = total % 10;
                carry = total / 10;
                j--;
                k--;
            }
        }
        sum[0] = carry;
    }
}
