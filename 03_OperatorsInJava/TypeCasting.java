public class TypeCasting {
    public static void main(String[] args) {
        short currentYear = 2030;
        byte age = 39;
        /*
         * In the expression, although the variables are not of integer data type, JVM
         * will implicitly convert it to integer data type
         * Also known as implicit type casting.
         */
        int birthYear = currentYear - age;
        // birthYear cannot be stored in short.
        /*
         * the reason being that JVM processes the data in 32 bits only, so even though
         * the birthYear value is of short range, but
         * the expression will be processed in 32 bits, so if birthYear variable is
         * decalred as shor, java thinks that there might be
         * some loss of data. That's why it throws error.
         */

        short currentYear_2 = 2025;
        byte age_2 = 25;
        short birthYear_2 = (short) (currentYear_2 - age_2);
        System.out.println(birthYear);
        System.out.println(birthYear_2);
    }
}
