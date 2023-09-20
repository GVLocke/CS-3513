package palindrome;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This program checks if a string is a palindrome. It is not case sensitive and ignores spaces.");
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\\s", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedStr = sb.toString();
        if (str.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        input.close();
    }
}