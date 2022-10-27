/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    static int nonAttempts = 0;
    public static void main(String[] args) {
        //establish user input
        Scanner in = new Scanner(System.in);
        //random number between 1-10 (+1 changes it from 0-9)
        int GuessItAnswer = (int) (Math.random() * 10) + 1;
        //establish number of guesses, starts at 1 because to continue they have to guess
        int guesses = 1;
        //establish array of all numbers guessed
        int[] numbersGuessed = new int[10];
        int guess = 0;

        //Start game, establish guess with what user inputted
        System.out.println("Welcome to 'You Guessed It.' Please pick a number, 1 through 10.");
        String guessString = in.nextLine();
        guess = tryInteger(guessString);


        //while answer is wrong
        while (guess != GuessItAnswer) {
            //verify the guess is in range
            if (guess < 1 || guess > 10) {
                System.out.println("I guess we don't know how numbers work. Number, 1-10:");
                guessString = in.nextLine();
                guess = tryInteger(guessString);
		nonAttempts++;
            } else {
                //tell the user which way to guess next
                if (guess < GuessItAnswer) {
                    System.out.println("(buzzer noise) No, that guess is too low. Try again.");
                } else if (guess > GuessItAnswer) {
                    System.out.println("(buzzer noise) No, that guess is too high. Try again.");
                }
                //catch all if something unexpected happens.
                else {
                    System.out.println("We are experiencing technical difficulties. Hang in there Kitty.");
                }
                //search array numbersGuessed for previously
                for (int i = 1; i <= guesses; i++) {
                    if (guess == numbersGuessed[i]) {
                        System.out.println("You guessed that already.");
                        //guess doesn't count if already guessed
                        guesses--;
                    }
                }
                //add guess into array
                numbersGuessed[guesses] = guess;

                //increase number of guesses
                guesses++;

                //get a new guess from user
                guessString = in.nextLine();
                guess = tryInteger(guessString);
            }
        }
        //English syntax
	String vocab1 = "number";
	String vocab2 = "guess";
        if (guesses > 1) {
            vocab1 = "numbers";
        }
	if (nonAttempts > 1) {
	    vocab2 = "guesses";
	}
        //game over
        System.out.println("(klaxon) You did it. You attempted " + guesses + " unique " + vocab1 + " inside the set paramaters. Now go away." + nonAttempts);
        if (nonAttempts>0) {
            System.out.println("You provided " + nonAttempts + " " + vocab2 + " that didn't fit within the set parameters. I recommend a math class.");
        }
	if (guesses == 1) {
	    System.out.println("Everyone gets lucky.");
	}
    }
    //this method allows users to enter NaN, forces them to pick a number
    public static int tryInteger(String guessString){
        Scanner in = new Scanner(System.in);
        try {
            return Integer.parseInt(guessString);
        } catch (Exception e) {
            System.out.println("I guess we don't know how numbers work. Number, 1-10:");
            guessString = in.nextLine();
            int guessTemp = tryInteger(guessString);
            nonAttempts++;
            return guessTemp;
            //return Integer.parseInt(in.nextLine());
        }
    }
}
