package guessthenumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_VALUES = 5;
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 20;
        final int ALLOWED_GUESSES = 7;
        GuessingGame game = new GuessingGame(NUMBER_OF_VALUES, MIN_VALUE, MAX_VALUE, ALLOWED_GUESSES);
        System.out.println("Welcome to the guessing game.");
        System.out.println("You have " + ALLOWED_GUESSES + " guesses to guess " + NUMBER_OF_VALUES + " numbers between " + MIN_VALUE + " and " + MAX_VALUE + ".");
        System.out.println("Good luck!");
        boolean inGame = true;
        while (inGame) {
            System.out.print("Enter a guess between " + MIN_VALUE + " and " + MAX_VALUE);
            int guess = input.nextInt();
            inGame = game.guess(guess);
        }
    }
}
