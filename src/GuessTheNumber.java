import javax.swing.*;
import java.util.Random;

public class GuessTheNumber {
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 5;
    private static int totalScore = 0;

    public static void main(String[] args) {
        for (int round = 1; round <= MAX_ROUNDS; round++) {
            playRound(round);
        }
        JOptionPane.showMessageDialog(null, "Game Over! Your total score is: " + totalScore);
    }

    private static void playRound(int round) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        JOptionPane.showMessageDialog(null, "Round " + round + ": Guess the number between 1 and 100!");

        while (attempts < MAX_ATTEMPTS && !hasGuessedCorrectly) {
            String userInput = JOptionPane.showInputDialog("Enter your guess (Attempt " + (attempts + 1) + " of " + MAX_ATTEMPTS + "):");
            if (userInput == null) {
                JOptionPane.showMessageDialog(null, "Game cancelled.");
                return;
            }

            try {
                int userGuess = Integer.parseInt(userInput);
                attempts++;

                if (userGuess < 1 || userGuess > 100) {
                    JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 100.");
                } else if (userGuess < numberToGuess) {
                    JOptionPane.showMessageDialog(null, "Higher! Try again.");
                } else if (userGuess > numberToGuess) {
                    JOptionPane.showMessageDialog(null, "Lower! Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    int points = calculatePoints(attempts);
                    totalScore += points;
                    JOptionPane.showMessageDialog(null, "Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts. You earned " + points + " points.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }

        if (!hasGuessedCorrectly) {
            JOptionPane.showMessageDialog(null, "Sorry! You've used all attempts. The number was " + numberToGuess + ".");
        }
    }

    private static int calculatePoints(int attempts) {
        return Math.max(0, MAX_ATTEMPTS - attempts + 1); // Points based on remaining attempts
    }
}
