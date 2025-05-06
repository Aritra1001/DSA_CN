// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

// You need to find and return that number which is unique in the array/list.


import java.util.*;
public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n Enter the element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        int uniqueElement = findUnique(arr);
        System.out.println("Unique element in the array: " + uniqueElement);
        sc.close();
    }

    public static int findUnique(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            while(j < arr.length){
                if(i!=j && arr[i] == arr[j]){
                    break;
                }
                j++;
            }
            if(j == arr.length){
                return arr[i];
            }
        }
        return -1;
    }
}
