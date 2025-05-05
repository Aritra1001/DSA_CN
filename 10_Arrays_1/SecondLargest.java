public class SecondLargest {
    public static void main(String[] args) {
        int A[] = {12, 43, 89, 21, 76, 52, 98};
        int max1 = A[0];
        int max2 = max1;
        for(int i = 1; i < A.length; i++){
            if(A[i] > max1){
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i] > max2){
                max2 = A[i];
            }
        }
        System.out.println("Second largest element: " + max2);
    }
}
