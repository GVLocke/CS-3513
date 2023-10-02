package strings;
import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string1 = input.nextLine();
        System.out.print("Enter an integer smaller than the length of the string: ");
        int n = input.nextInt();
        if (n > string1.length()) {
            System.out.println("Please enter an integer smaller than the length of the string");
            System.exit(1);
        }
        for (int i = 0; i < n; i++) {
            if ((i+(n-1) >= string1.length())) {
                System.out.println(string1.substring(i, string1.length()));
                continue;
            }
            System.out.println(string1.substring(i, i + (n-1)));
        }
        input.close();
    }
}
