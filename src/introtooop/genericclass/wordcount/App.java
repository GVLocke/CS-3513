package introtooop.genericclass.wordcount;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence (don't include punctuation): ");
        String sentence = input.nextLine();
        sentence.toLowerCase();
        String[] words = sentence.split(" ");
        WordCount<String> wordCounter = new WordCount<>(words);
        System.out.print("Type a word to count: ");
        String search_term = input.nextLine();
        System.out.println("\"" + search_term + "\" appears " + wordCounter.getWordCount(search_term) + " time(s).");
        input.close();
    }
}
