import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class NumberGuessingGameWithStack {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        
        Random random = new Random();
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        
        int attempts = 0;
        int guess = 0;
        boolean isCorrect = false;
        
        Scanner scanner = new Scanner(System.in);
        
        Stack<Integer> previousGuesses = new Stack<>();
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + minNumber + " and " + maxNumber + ".");
        
        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            previousGuesses.push(guess);
            
            if (guess == targetNumber) {
                isCorrect = true;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        System.out.println("Congratulations  ! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
        
        System.out.println("Your previous guesses:");
        while (!previousGuesses.isEmpty()) {
            System.out.println(previousGuesses.pop());
        }
        
        scanner.close();
    }
}
