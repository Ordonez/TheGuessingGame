import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I will select a number between 1 and 200 and you will have to guess it.");
        System.out.println("You will get 5 tries to guess the number correctly. Good Luck!");

        Scanner playerObj = new Scanner(System.in);
        String playAgain;

        do {
            letsPlay();
            System.out.println("Would you like to play again? (Y/N)");
            playAgain = playerObj.next().toUpperCase(); // Read input and convert to uppercase

        } while(playAgain.equals("Y"));
        System.out.println("Thanks for playing!");
    }

    static void letsPlay() {
        int generatedNumber;
        int userGuess;
        int guessCount;

        generatedNumber = (int)(200 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.println("What is your first guess? ");
        Scanner guessObj = new Scanner(System.in);
        while (true) {
            userGuess = guessObj.nextInt();
            guessCount++;

            if (userGuess == generatedNumber) {
                System.out.println("You guessed the correct number in " + guessCount
                        + " guesses! My number was " + generatedNumber);
                break;
            }
            if (guessCount == 5) {
                System.out.println("Sorry, you did not guess the correct number within 5 attempts.");
                System.out.println("The correct number was " + generatedNumber);
                break;
            }
            if (userGuess < generatedNumber) {
                System.out.println("Close, but that is too low, try again: ");
            } else if (userGuess > generatedNumber) {
                System.out.println("That number is close, but is too high. Try again: ");
            }
            System.out.println();
        }
    }
}