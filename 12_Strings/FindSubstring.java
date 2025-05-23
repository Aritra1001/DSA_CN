/*
 * For a given input string(str), write a function to print all the possible substrings.

Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
 */





import java.util.*;
public class FindSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        possibleSubstring(str);
        sc.close();
    }

    public static void possibleSubstring(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                System.out.println(str.substring(i, j + 1));
            }
        }
    }
}
