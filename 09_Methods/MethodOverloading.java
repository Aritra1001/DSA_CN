//  We can create more than one method with the same name.
/*
 * Thumb rules for creating overloaded method
 * 1. There should not be same number of arguments for the method.
 * 2. If the number of arguments is same, then the data type of the arguments should be different
 */


public class MethodOverloading {

    public static void sum(int a, int b){
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void sum(double a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sum(2, 5);
        sum(4, 5 ,10);
        sum(12.46, 23);
    }    
}
