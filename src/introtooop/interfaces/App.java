package introtooop.interfaces;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        InfTest a = new InfTest();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int b = input.nextInt();
        System.out.print("Enter another integer: ");
        int c = input.nextInt();
        System.out.println("Added: " + a.add(b, c));
        System.out.println("Subtracted: " + a.subtract(b, c));
        System.out.println("Multiplied: " + a.multiply(b, c));
        System.out.println("Divided: " + a.divide((double) b, (double) c));
        System.out.println("Digit sum of the first number: " + a.digitSum(b));
        System.out.println("Digit sum of the second number: " + a.digitSum(c));
        System.out.print("The first number is ");
        if (a.isPositive(b)) {
            System.out.print("positive.\n");
        } else {
            System.out.print("negative.\n");
        }
        System.out.print("The second number is ");
        if (a.isPositive(c)) {
            System.out.print("positive.");
        } else {
            System.out.print("negative.");
        }
        input.close();
    }
}
