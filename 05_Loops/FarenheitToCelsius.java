// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
// you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

// Hint : Use type casting

import java.util.*;
public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
	
		for(; S <= E; S=S+W ){
				int celVal = 0;
			celVal = (int) ((5 * (S - 32))/9);
			System.out.println(S + " " + celVal);
		}
    }
}
