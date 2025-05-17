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
        int l = 0, r = len - 1;
        reverseArr(a, l, r);
        x = x % len;

        switch (dir) {
            case 0:
                l = 0;
                r = len - x - 1;
                reverseArr(a, l, r);
                l = len - x;
                r = len - 1;
                reverseArr(a, l, r);
                break;
            case 1:
                l = 0;
                r = x - 1;
                reverseArr(a, l, r);
                l = x;
                r = len - 1;
                reverseArr(a, l, r);
                break;
        }

        System.out.print("final rotated array: ");
        for(int i : a){
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
