package com.sirma.javacource.intro.hangman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * This class takes user input, communicates with the model and the view.
 */
public class HangmanController {
    private final HangmanModel model;
    private final HangmanView view;
    public HangmanController(HangmanModel model, HangmanView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Starts the game
     */
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (!model.isGameWon() && !model.isGameLost()) {
            view.displayGameState(model.getGuessedWord(), model.getAttemptsLeft());
            view.promptForThePlayer();
            char guess = scanner.next().charAt(0);
            model.makeGuess(guess);
        }
        view.displayResult(model.isGameWon());
    }
}
