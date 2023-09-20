package tollcalculation;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Get the time from the user as a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time (in 24 hour format): ");
        String timeString = input.nextLine();
        // Try to convert the input string into hour and minute integers
        int hourInt = 0;
        try {
            hourInt = Integer.parseInt(timeString.substring(0, timeString.length() - 3));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            System.exit(1);
        }
        // Check if the hour is valid
        if (hourInt > 24) {
            System.out.println("Invalid Hour");
            input.close();
            System.exit(1);
        }
        // Calculate toll based on time of day
        // Before 6:00 and after 18:00 the toll is $1.55. After 6:00 and before 9:59 the toll is $4.65. After 10:00 and before 17:59 the toll is $2.35.
        if (hourInt < 6) {
            System.out.println("Toll is $1.55");
        }
        if (hourInt >= 6 & hourInt < 10) {
            System.out.println("Toll is $4.65");
        }
        if (hourInt >= 10 & hourInt < 18) {
            System.out.println("Toll is $2.35");
        }
        if (hourInt >= 18) {
            System.out.println("Toll is $1.55");
        }
        input.close();
    }
}