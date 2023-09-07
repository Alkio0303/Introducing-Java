package com.sirma.javacource.intro.hangman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is responsible for displaying the game's current state to the user.
 */
public class HangmanView {
    /**
     * Displaying the state of the game
     * @param guessedWord, is printed with the chars which the player guessed.
     * @param attemptsLeft, is printed so the player knows how many more attempts he has.
     */
    private static final Logger logger = LoggerFactory.getLogger(HangmanView.class);
    public void displayGameState(String guessedWord, int attemptsLeft) {
        logger.info("Word: " + guessedWord);
        logger.info("Attempts left: " + attemptsLeft);
    }

    /**
     * Displays the result of the game
      * @param isGameWon if it is true, the game was won by the player
     */
    public void displayResult(boolean isGameWon) {
        if (isGameWon) {
            logger.info("Congratulations! You win");
        } else {
            logger.info("Sorry, you lost.");
        }
    }
    public void promptForThePlayer() {
        logger.info("Enter a letter: ");
    }
}
