import java.util.Scanner;
import java.util.Random;

/**
 * Project 1: Number Guessing Game
 * Filename: DecodeLabs_Java_P1.java
 * 
 * Description:
 * A Java program that generates a random number and asks the user to guess it.
 * Includes features like limited attempts, multiple rounds, and score tracking.
 */

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalScore = 0;
        int roundsPlayed = 0;
        boolean playAgain = true;

        System.out.println("-------------------------------------------");
        System.out.println("Welcome to the DecodeLabs Number Guessing Game!");
        System.out.println("-------------------------------------------");

        while (playAgain) {
            roundsPlayed++;
            int targetNumber = random.nextInt(100) + 1; // 1 to 100
            int attemptsLeft = 7; // Limiting to 7 attempts per round
            boolean hasGuessedCorrectly = false;

            System.out.println("\nRound " + roundsPlayed + ":");
            System.out.println("I have picked a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                
                // Input validation
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    int points = attemptsLeft * 10; // Scoring based on remaining attempts
                    totalScore += points;
                    System.out.println("Points earned this round: " + points);
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Attempts remaining: " + attemptsLeft);
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("\nGame Over for this round! The correct number was: " + targetNumber);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
            }
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("Final Results:");
        System.out.println("Total Rounds Played: " + roundsPlayed);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Thank you for playing!");
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}
