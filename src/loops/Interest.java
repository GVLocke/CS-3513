package loops;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial savings: $");
        double savings = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = input.nextDouble();
        System.out.println("Annual savings for 10 years:");
        for (int i = 0; i < 10; i++) {
            savings += savings * rate;
            System.out.println("$" + savings);
        }
        input.close();
    }
}
