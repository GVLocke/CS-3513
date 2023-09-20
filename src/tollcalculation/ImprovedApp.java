package tollcalculation;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ImprovedApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // set up the input scanner
        System.out.print("Enter a time (in 24 hour format): "); // ask user for time and store it in a string
        String timeString = input.nextLine();
        LocalTime time = null;
        try {
            time = LocalTime.parse(timeString); // create a LocalTime object based on the time string
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format"); // catch the DateTimeParseException Error
            System.exit(1);
        }
        // Using the LocalTime object, output the corresponding toll fee based on these rules:
        // Before 6:00 and after 18:00 the toll is $1.55. After 6:00 and before 9:59 the toll is $4.65. After 10:00 and before 17:59 the toll is $2.35.
        if (time.isBefore(LocalTime.of(6,0))) {
            System.out.println("Toll is $1.55");
        }
        if (time.isAfter(LocalTime.of(6,0)) & time.isBefore(LocalTime.of(9,59))) {
            System.out.println("Toll is $4.65");
        }
        if (time.isAfter(LocalTime.of(10,0)) & time.isBefore(LocalTime.of(17,59))) {
            System.out.println("Toll is $2.35");
        }
        if (time.isAfter(LocalTime.of(18,0))) {
            System.out.println("Toll is $1.55");
        }
        input.close();
    }
}