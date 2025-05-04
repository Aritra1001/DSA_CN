
public class FindMinElement {
    public static void main(String[] args) {
        int arr[] = {10, 56, 99, 101, 34, 74, 90, 5};
        int minEle = arr[0];
        for(int i:arr){
            if(i < minEle){
                minEle = i;
            }
        }
        System.out.println("Minimum Element in the array = " + minEle);
    }
}
