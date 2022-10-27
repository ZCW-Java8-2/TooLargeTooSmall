import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        //creating Scanner object with System.in parameter
        Scanner scanner = new Scanner(System.in);
        //creating range of random number between 0 & 20
        int min = 0;
        int max = 20;
        int num = (int) (Math.random() * max) - min;
        int guess = 0;
        //random number generator test
//        System.out.println(num);
        //start the game
        System.out.println("I am thinking of a number between 0 - 20. Guess the number. You have 4 tries");
        guess = scanner.nextInt();
        if (guess == num) {
            System.out.println("Congratulations! The number is " + num);
        } else {
            //creating loop for number of tries
            for (int i = 3; i >= 0; i--) {
                //if guess is correct
                if (guess == num) {
                    System.out.println("Congratulations! The number is " + num);
                    break;
                }
                //if you have 0 tries left
                if (i == 0) {
                    System.out.println("Game over :( The number is " + num);
                    break;
                }
                //if guess is too low
                if (guess > num) {
                    System.out.println("Too large, try again. You have " + i + " tries left");
                    guess = scanner.nextInt();
                    //if guess is too high
                } else {
                    System.out.println("Too small, try again. You have " + i + " tries left");
                    guess = scanner.nextInt();
                }
            }
        }
    }
}
