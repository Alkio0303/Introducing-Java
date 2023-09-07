package com.sirma.javacource.intro.hangman;

/**
 * This class handles the game's logic, like selecting words and checking guesses.
 */
public class HangmanModel {

    private final String word;
    private final StringBuilder guessedWord;
    private int attemptsLeft;

    public HangmanModel(String word) {
        this.word = word.toLowerCase();
        this.guessedWord = new StringBuilder("_".repeat(word.length()));
        this.attemptsLeft = 6;
    }

    /**
     * Checks if the guessed letter is contained in the word
     *
     * @param letter if the letter is contained in the word, found = true
     * @return
     */
    public boolean makeGuess(char letter) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedWord.setCharAt(i, letter);
                found = true;
            }
        }
        if (!found) {
            attemptsLeft--;
        }
        return found;
    }

    public String getGuessedWord() {
        return guessedWord.toString();
    }
    public int getAttemptsLeft() {
        return attemptsLeft;
    }
    public boolean isGameWon() {
        return guessedWord.toString().equals(word);
    }

    public boolean isGameLost() {
        return attemptsLeft <= 0;

    }
}
