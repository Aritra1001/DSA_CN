
/**
 * You are having a character array (arr) containing ASCII characters. You are required to reverse the character array (arr)
 *  and return it as a string.

You must do this by modifying the input array.

Output the reverse of the input array.

Example :
S = “hello”

Explanation : 

The reverse of the input array is “olleh”.
 * 
 */

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        System.out.println(ch);
        String revStr = stringReverse(ch);
        System.out.println("Reversed string = " + revStr);

        sc.close();
    }

    public static String stringReverse(char ch[]) {
        String revStr = "";

        // 1st approach
        // for (int i = 0; i < ch.length; i++) {
        // revStr = ch[i] + revStr;
        // }

        // 2nd approach
        // for(int i = ch.length - 1; i >= 0; i--){
        // revStr = revStr + ch[i];
        // }
        // return revStr;

        // 3rd approach using 2 pointers method
        int l = 0, r = ch.length - 1;
        char temp = ' ';
        while (l < r) {
            temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        String str = new String(ch);
        return str;
    }
}
