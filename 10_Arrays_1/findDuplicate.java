// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
// Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, 
// there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.



import java.util.*;
public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n Enter the element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        int duplicateElement = findDuplicateElement(arr);
        System.out.println("Duplicate element of the array: " + duplicateElement);
        sc.close();
    }

    public static int findDuplicateElement(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            while(j < arr.length){
                if(i != j && arr[i] == arr[j]){
                    return arr[i];
                }
                j++;
            }
        }
        return -1;
    }
}
