package guessthenumber;

import java.util.HashSet;
import java.util.Random;

public class GuessingGame {
    private HashSet<Integer> guessSet = new HashSet<Integer>();
    private int guessCount = 0;
    private final int allowedGuesses;

    public GuessingGame(int numberOfValues, int minValue, int maxValue, int allowedGuesses) {
        this.allowedGuesses = allowedGuesses;
        if (numberOfValues < 0 || minValue >= maxValue) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        Random random = new Random();
        while (guessSet.size() < numberOfValues) {
            guessSet.add(random.nextInt(maxValue - minValue + 1) + minValue);
        }
    }
    
    public boolean guess(int guess) {
        guessCount++;
        if (guessCount > allowedGuesses) {
            System.out.println("You've run out of guesses. Better luck next time!");
            return false;
        } else if (guessSet.contains(guess)) {
            System.out.println("Yup! " + guess + " is in the set!");
            guessSet.remove(guess);
            return true;
        } else {
            System.out.println("Nope. " + guess + "isn't in the set. You have " +
                    (allowedGuesses - guessCount) + " more guesses.");
            return true;
        }
    }
}
