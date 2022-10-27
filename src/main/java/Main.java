/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int randomNumber = (int) (1 + (25 * Math.random())); //25
        boolean correctGuess = false;
        int guessCount = 0;
        Scanner enterGuess = new Scanner(System.in);
        while(correctGuess == false){
            System.out.println("Guess a number between 0 and 25. Please guess WHOLE NUMBERS ONLY");
            String guess = enterGuess.nextLine();
            int guessInt = Integer.parseInt(guess);
            if(guessInt > 26){
                System.out.println("You guessed a number outside of the range.");
                guessCount++;
            }else if(guessInt < randomNumber){
                System.out.println("guess higher next time.");
                guessCount++;
            }else if(guessInt > randomNumber && guessInt < 26){
                System.out.println("guess lower next time.");
                guessCount++;
            }else if(guessInt == randomNumber){
                System.out.println("You guessed right! " + "It took you " + guessCount + " guesses.");
                correctGuess = true;
            }

        }



    }
}
