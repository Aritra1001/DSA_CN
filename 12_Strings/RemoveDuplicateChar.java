/*
 * For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 */

import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
        sc.close();
    }

    public static String removeConsecutiveDuplicates(String str){
        // Approach 1: using substring method which will 
        // int i = 1, j = 1;
        // char lastChar = str.charAt(0);
        // while(i < str.length()){
        //     if(str.charAt(i) == lastChar){
        //         i++;
        //     }
        //     else{
        //         str = str.substring(0, j) + str.charAt(i) + str.substring(j);
        //         lastChar = str.charAt(j);
        //         i++;
        //         j++;
        //     }
        // }
        // str = str.substring(0, j);
        // return str;

        // using string builder
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
