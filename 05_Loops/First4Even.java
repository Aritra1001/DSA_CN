import java.util.*;;

public class First4Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, count = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 4)
                break;
        }
        sc.close();
    }
}
