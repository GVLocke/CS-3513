package loops;
import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int final_bid = 0;
        int last_bid = 0;
        System.out.print("Enter max bid: ");
        int max_bid = input.nextInt();
        while (true) {
            System.out.print("I'll bid $");
            int bid = input.nextInt();
            if (bid <= last_bid) {
                System.out.println("Your bid must be higher than the last bid of $" + last_bid);
                continue;
            }
            last_bid = bid;
            final_bid = bid;
            if (final_bid >= max_bid) {
                break;
            }
            System.out.print("Continue Bidding? (y/n) ");
            if (input.next().charAt(0) == 'n') {
                break;
            }
        }
        System.out.println("Final bid: " + final_bid);
        input.close();
    }
}
