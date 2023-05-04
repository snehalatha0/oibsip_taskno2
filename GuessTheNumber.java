import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to the Guess the Number game!");
            System.out.println("I am thinking of a number between 1 and 100.");
            System.out.println("You have 10 attempts to guess the number.");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Guess #" + i + ": ");
                int guess = input.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    score += (10 - i) * 10;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Guess again.");
                } else {
                    System.out.println("Too high. Guess again.");
                }

                if (i == 10) {
                    System.out.println("Sorry, you have run out of attempts.");
                }
            }

            System.out.println("Your score is: " + score);
            System.out.print("Do you want to play again? (Y/N): ");
            String playAgainInput = input.next();
            playAgain = playAgainInput.equalsIgnoreCase("Y");

            if (playAgain) {
                secretNumber = rand.nextInt(100) + 1;
            }
        }

        System.out.println("Thanks for playing the Guess the Number game!");
        System.out.println("You made " + attempts + " attempts in total.");
    }
}