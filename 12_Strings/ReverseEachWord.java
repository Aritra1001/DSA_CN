
import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String newStr = reverseEachWordFunc(str);
        System.out.println(newStr);
        sc.close();
    }

    public static String reverseString(String str){
        String revStr = "";
        for(int i = 0; i < str.length(); i++){
            revStr = str.charAt(i) + revStr;
        }
        return revStr;
    }

    public static String reverseEachWordFunc(String str){
        String finalStr= "";
        String arr[] = str.split(" ");
        for(int i = 0; i < arr.length; i++){
           finalStr = finalStr + reverseString(arr[i]) + " ";
        }
        return finalStr;
    }
}
