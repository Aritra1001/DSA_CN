

import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the first array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\n Enter the element at " + i + " index: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the length of the second array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("\n Enter the element at " + i + " index: ");
            arr2[i] = sc.nextInt();
        }

        findIntersection(arr1, arr2);
        sc.close();
    }

    public static void findIntersection(int arr1[], int arr2[]){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
