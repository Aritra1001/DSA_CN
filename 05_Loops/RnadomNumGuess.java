import java.util.*;
public class RnadomNumGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        System.out.println(randomNum);
        int userGuess = 0;
        while(userGuess != randomNum){
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            if(userGuess < randomNum){
                System.out.println("Too low! Try again");
            }
            else if(userGuess > randomNum){
                System.out.println("Too high! Try again");
            }
            else{
                System.out.println("Correct! You guessed the number");
            }
        }
        sc.close();
    }
}
