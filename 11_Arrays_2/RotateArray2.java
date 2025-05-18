// This is the optimised approach of rotating the array. Here I am reversing the array multiple times to get to our desired result

import java.util.*;

public class RotateArray2 {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int dir = takeInput("Enter 0 to rotate left and 1 to rotate right: ");
        int x = takeInput("Enter the number of rotations: ");

        int len = takeInput("Enter the length of the array: ");
        int a[] = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = takeInput("Enter the element at " + i + " th index: ");
        }

        rotateArr(a, len, x, dir);
    }

    public static void rotateArr(int a[], int len, int x, int dir) {
        reverseArr(a, 0, len - 1);
        x = x % len;

        switch (dir) {
            case 0:
                reverseArr(a, 0, len - x - 1);
                reverseArr(a, len - x, len - 1);
                break;
            case 1:
                reverseArr(a, 0, x - 1);
                reverseArr(a, x, len - 1);
                break;
        }

        System.out.print("final rotated array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArr(int a[], int l, int r) {
        int temp = 0;
        while (l < r) {
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
