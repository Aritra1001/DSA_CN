/*
 * You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' 
 * (K is greater than 0) in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated. 
 */


import java.util.*;
public class CheckArrayRotation {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int len = takeInput("enter the length of the array: ");
        int arr[] = new int[len];
        System.out.println("enter the rotated array: ");
        for(int i = 0; i < len; i++){
            arr[i] = takeInput("Enter the element at " + i + " th index: ");
        }
        int rotation = arrayRotateCheck(arr, len);
        System.out.print("Array is rotated by: " + rotation);
    }

    public static int arrayRotateCheck(int a[], int len){
        for(int i = 0; i < len - 1; i++){
            if(a[i] > a[i + 1]){
                return (i + 1);
            }
        }
        return 0;
    }
}
