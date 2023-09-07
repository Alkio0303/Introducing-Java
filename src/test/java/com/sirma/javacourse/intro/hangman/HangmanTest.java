package com.sirma.javacourse.intro.hangman;

import com.sirma.javacource.intro.hangman.HangmanModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class HangmanTest {
    private HangmanModel hangmanModel;

    @BeforeEach
    void setUp() {
        hangmanModel = new HangmanModel("hangman");
    }

    @Test
    void test_MakeGuessCorrect() {
        assertTrue(hangmanModel.makeGuess('h'));
        assertEquals("h______", hangmanModel.getGuessedWord());
    }

    @Test
    void test_MakeGuessIncorrect() {
        assertFalse(hangmanModel.makeGuess('z'));
        assertEquals("_______", hangmanModel.getGuessedWord());
    }

    @Test
    void test_GameWon() {
        hangmanModel.makeGuess('h');
        hangmanModel.makeGuess('a');
        hangmanModel.makeGuess('n');
        hangmanModel.makeGuess('g');
        hangmanModel.makeGuess('m');
        assertTrue(hangmanModel.isGameWon());
    }

    @Test
    void test_GameLost() {
        hangmanModel.makeGuess('z');
        hangmanModel.makeGuess('y');
        hangmanModel.makeGuess('x');
        hangmanModel.makeGuess('w');
        hangmanModel.makeGuess('v');
        hangmanModel.makeGuess('u');
        assertTrue(hangmanModel.isGameLost());
    }

    @Test
    void test_GameNotWon() {
        assertFalse(hangmanModel.isGameWon());
    }

    @Test
    void test_GameNotLost() {
        assertFalse(hangmanModel.isGameLost());
    }
}
