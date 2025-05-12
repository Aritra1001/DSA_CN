

import java.util.*;
public class DeleteElement {

    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }
    
    public static int removeElement(int arr[], int size, int pos){
        for(int i = pos; i < size; i++){
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return size;
    }

    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity of the array: "); //total size of the array
        int size = takeInput("Enter the size: "); //number of elements user has entered
        
        int arr[] = new int[cap];
        for(int i = 0; i < size; i++){
            arr[i] = takeInput("Enter the element at " + i + "index: ");
        }

        int pos = takeInput("Enter the position to remove the element: ");

        size = removeElement(arr, size, pos);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
