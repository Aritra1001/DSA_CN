


import java.util.*;
public class ElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("\n Enter the element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(calculateSum(arr));
        sc.close();
    }  
    
    public static int calculateSum(int arr[]){
        int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     sum += arr[i];
        // }

        // using for each loop
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
}
