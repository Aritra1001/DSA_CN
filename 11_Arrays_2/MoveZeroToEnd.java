import java.util.*;

public class MoveZeroToEnd {

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

        moveZeroToEnd(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeroToEnd(int a[], int n) {
        int nz = 0, z = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            if (a[z] == 0) {
                z++;
            } else {
                temp = a[z];
                a[z] = a[nz];
                a[nz] = temp;
                z++;
                nz++;
            }
        }
    }
}
