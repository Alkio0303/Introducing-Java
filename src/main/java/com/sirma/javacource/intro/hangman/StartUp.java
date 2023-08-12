package com.sirma.javacource.intro.hangman;

public class StartUp {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "grape", "orange"};
        String wordToGuess = words[(int) (Math.random() * words.length)];
        HangmanModel model = new HangmanModel(wordToGuess);
        HangmanView view = new HangmanView();
        HangmanController controller = new HangmanController(model, view);
        controller.playGame();
    }
}
