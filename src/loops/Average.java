package loops;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.print("Enter the number of items in the list: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("Enter the items:");
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int x = input.nextInt();
            sum += x;
        }
        double average = (double) sum / length;
        System.out.println("Average: " + average);
        input.close();
    }
}
