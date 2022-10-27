/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int max = 25;
        int min = 0;
        int randomNumber = (int) ((max+1) * Math.random()); //25
        boolean correctGuess = false;
        int guessCount = 0;
        int lastGuess = min - 1;
        System.out.println("random number is " + randomNumber);
        Scanner enterGuess = new Scanner(System.in);
        while(correctGuess == false){
            System.out.println("Guess a number between 1 and 25. Please guess WHOLE NUMBERS ONLY");
            String guess = enterGuess.nextLine();
            int guessInt = Integer.parseInt(guess);
            if(lastGuess == guessInt && guessCount > 0) {
                System.out.println("You guessed the same number twice in a row");
            }else if(guessInt > max || guessInt < min) {
                System.out.println("You guessed a number outside of the range.");
                lastGuess = guessInt;
                guessCount++;
            }else if(guessInt < randomNumber && guessInt > min - 1 ){
                System.out.println("Guess higher next time.");
                lastGuess = guessInt;
                guessCount++;
            }else if(guessInt > randomNumber && guessInt < max + 1 ){
                System.out.println("Guess lower next time.");
                lastGuess = guessInt;
                guessCount++;
            }else if(guessInt == randomNumber){
                guessCount++;
                System.out.println("You guessed right! " + "It took you " + guessCount + " guesses.");
                correctGuess = true;
            }

        }



    }
}
