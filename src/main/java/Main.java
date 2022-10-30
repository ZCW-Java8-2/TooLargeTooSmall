import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {



    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);

        int num1 = (int) (Math.random() * 100);
        int guess = 3;
        int i, tryMe;
        System.out.println("Guess a number! Any number!");
        for( i = 0; i < guess; i++) {
            tryMe = Number.nextInt();
            if (num1 == tryMe) {
                System.out.println("You got it dude!");
            } else if (num1 > tryMe) {
                System.out.println("Too small!");
            } else if (num1 < tryMe) {
                System.out.println("Too big!");
            }

            }if (i == guess)
        {System.out.println("Better luck next time!");
            System.out.println("The number was " + num1);
        }



    }

}
