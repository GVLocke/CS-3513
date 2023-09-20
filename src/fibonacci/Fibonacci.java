package fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Print the Fibonacci sequence up t: ");
            if (input.hasNextInt()) {
                n = input.nextInt();
                break;
            } else {
                String invalidInput = input.next();
                System.out.println("Invalid input: " + invalidInput);
            }
        }
        if (n == 0) {
            System.out.println(0);
            System.exit(0);
        }
        int last_number = 1;
        int second_last_number = 0;
        System.out.println(second_last_number);
        System.out.println(last_number);
        while (last_number <= n) {
            int temp = last_number;
            last_number += second_last_number;
            second_last_number = temp;
            if (last_number <= n) {
                System.out.println(last_number);
            }
        }
        input.close();
    }
}