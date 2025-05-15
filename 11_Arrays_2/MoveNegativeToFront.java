
import java.util.*;
public class MoveNegativeToFront {
    
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }
    
    public static void main(String[] args) {
        int n = takeInput("Enter the length of the array: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = takeInput("Enter the element at " + i + " th index: ");
        }

        moveNegativeIntegers(arr, n);

        for(int i: arr){
            System.out.print( i + " ");
        }
    }

    public static void swap(int arr[], int p, int n){
        int temp = 0;
        temp = arr[p];
        arr[p] = arr[n];
        arr[n] = temp;
    }

    public static void moveNegativeIntegers(int arr[], int len){
        int p = 0, n = 0;
        while(p < len){
            if(arr[p] < 0){
                swap(arr, p, n);
                n++;
            }
            p++;
        }
    }
}
