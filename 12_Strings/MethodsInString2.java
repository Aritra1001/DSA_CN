public class MethodsInString2 {
    public static void main(String[] args) {

        String str = "coding is good";
        /** Methods in String */
        // length()
        // System.out.println(str.length());
        // charAt()
        // System.out.println(str.charAt(5));
        // toLowerCase(), toUpperCase()
        // System.out.println(str.toUpperCase());
        // trim()
        // System.out.println(str.trim());
        // substring()
        // System.out.println(str.substring(5));
        // System.out.println(str.substring(5,9));
        // replace()
        // System.out.println(str.replace('o','@'));

        // String str = "coding is good.";

        // indexOf()
        // int index = str.indexOf('a');
        // int index = str.indexOf('o', 5);
        // System.out.println(index);

        // // lastIndexOf()
        // int lastIndex = str.lastIndexOf('g');
        // System.out.println(lastIndex);

        // equals()
        String s1 = "Hello";
        String s2 = "Hello";

        // System.out.println(s1.equals(s2));

        // compareTo()
        String s3 = "hello";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s2));

    }

}
