
import java.util.*;
public class UpdateElement {

    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }

    public static void replaceKey(int arr[], int key, int newKey){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                arr[i] = newKey;
                return;
            }
        }
        System.out.println("Key is not found in the Array!");
    }

    public static void main(String[] args) {
        int size = takeInput("Enter the size of the array: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = takeInput("Enter the element at " + i + " th index: ");
        }

        int key = takeInput("Enter the key to find in the array: ");

        int newKey = takeInput("Enter the new key: ");

        replaceKey(arr, key, newKey);

        System.out.print("Updated array: ");
        for(int i:arr){
            System.out.print( + i + " ");
        }
    }
}
