import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        // int totalMarks = 800;
        // float scored = 540;
        Scanner sc = new Scanner(System.in);

        int totalMarks = sc.nextInt();
        float scored = sc.nextFloat();
        
        double percentage = (double)((scored/totalMarks)*100);
        System.out.println(percentage);
        sc.close();
    }
}
