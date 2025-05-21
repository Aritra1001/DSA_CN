
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean result = checkPalindrome(s);
        if(result)
        System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");
        sc.close();
    }

    public static boolean checkPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
