package strings;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a kind of relative: ");
        String relative = input.nextLine();
        System.out.print("Enter a kind of food: ");
        String food = input.nextLine();
        System.out.print("Enter an Adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter a time period: ");
        String time = input.nextLine();
        System.out.println("My " + relative + " says that eating " + food + " will make me more " + adjective + " so now I it it every " + time + ".");
        input.close();
    }
} 