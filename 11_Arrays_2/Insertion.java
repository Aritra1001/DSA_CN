
import java.util.*;

public class Insertion {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int cap = takeInput("enter the capacity of the array: ");
        int size = takeInput("enter the size: ");
        int arr[] = new int[cap];
        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter the element at " + i + " index: ");
        }

        int ele = takeInput("Enter the element to be inserted: ");
        int pos = takeInput("Enter the positions: ");

        size = insertElement(arr, pos, ele, size);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static int insertElement(int arr[], int pos, int ele, int size) {
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = ele;
        size++;
        return size;
    }
}