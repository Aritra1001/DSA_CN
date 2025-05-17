
// using two array approach

import java.util.*;
public class RotateArray1 {

    public static int takeInput(String str){
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
        for(int i = 0; i < len; i++){
            a[i] = takeInput("Enter the element at " + i + " th index: ");
        }
        int b[] = new int[len];

        rotateArr(a, b, dir, x, len);
    }

    public static void rotateArr(int a[], int b[], int dir, int x, int len){
        for(int i = 0; i < len; i++){
            switch(dir){
                case 0: b[(i - x + len) % len] = a[i];
                break;
                case 1: b[(i + x) % len] = a[i];
                break;
                default: System.out.println("Please enter correct input for the direction");
            }
        }
        
        System.out.print("Final rotated array: ");
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}
