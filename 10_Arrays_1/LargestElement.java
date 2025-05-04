


import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element of the array = " + findLargest(arr));
        sc.close();
    }

    public static int findLargest(int arr[]){
        int largestEle = Integer.MIN_VALUE;
        for(int i:arr){
            if(i > largestEle){
                largestEle = i;
            }
        }
        return largestEle;
    }
}
