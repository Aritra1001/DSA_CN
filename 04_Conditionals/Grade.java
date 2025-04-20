import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student's score");
        int score = sc.nextInt();
        if(score >= 90){
            System.out.println("Grade: A");
        }
        else if(score >= 80 && score < 90){
            System.out.println("Grade: B");
        }
        else if(score >= 70 && score < 80){
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D");
        }
        sc.close();
    }
}
