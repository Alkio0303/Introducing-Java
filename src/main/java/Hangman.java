import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * This utility class is a Hangman game in which you need to guess the word
 *
 */
public class Hangman {
    private static final Logger logger = LoggerFactory.getLogger(Hangman.class);
    private static final String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String wordToGuess = words[random.nextInt(words.length)];
        char[] guessedLetters = new char[wordToGuess.length()];
        int attempts = 6;
        boolean wordGuessed = false;


        Arrays.fill(guessedLetters, '-');

        while (attempts > 0 && !wordGuessed) {
            logger.info("Attempts left: " + attempts);
            System.out.println("Current progress: " + new String(guessedLetters));
            System.out.println("Enter a letter: ");
            char guess = scanner.nextLine().charAt(0);

            boolean foundLetter = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    foundLetter = true;
                }
            }

            if (!foundLetter) {
                attempts--;
                System.out.println("Incorrect guess!");
            }

            if (new String(guessedLetters).equals(wordToGuess)) {
                wordGuessed = true;
            }
        }

        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + wordToGuess);
        }
    }
}