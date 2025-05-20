// Here we are taking the assumption that there are no leading and trailing spaces and there is a single space between two words.

import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countWords(str);
        sc.close();
    }

    public static void countWords(String str){
        // by counting the spaces 
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        count++;
        System.out.println("Number of words = " + count);
    }
}
