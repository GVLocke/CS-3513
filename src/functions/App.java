package functions;
import java.util.Scanner;

class Calculator {
    int add(int a, int b){return a + b;}
    int add(int a, int b, int c){return a + b + c;}
    double add(double a, double b){return a + b;}
    double add(double a, double b, double c){return a + b + c;}
    int subtract(int a, int b){return a - b;}
    int subtract(int a, int b, int c){return a - b - c;}
    double subtract(double a, double b){return a - b;}
    double subtract(double a, double b, double c){return a - b - c;}
    int multiply(int a, int b){return a * b;}
    int multiply(int a, int b, int c){return a * b * c;}
    double multiply(double a, double b){return a * b;}
    double multiply(double a, double b, double c){return a * b * c;}
    double divide(double a, double b){return a / b;}
    double divide(double a, double b, double c){return a / b / c;}
    int divide(int a, int b){
        // if a or b are integers, turn them into doubles
        if (a % b != 0) {
            double aDouble = (double) a;
            double bDouble = (double) b;
            return (int) (aDouble / bDouble);
        }
        return a / b;
    }
    int divide(int a, int b, int c){
        // if a or b or c are integers, turn them into doubles
        if (a % b != 0 || a % c != 0 || b % c != 0) {
            double aDouble = (double) a;
            double bDouble = (double) b;
            double cDouble = (double) c;
            return (int) (aDouble / bDouble / cDouble);
        }
        return a / b / c;
    }
    void parseInput(String input) {
        // remove spaces
        input = input.replaceAll("\\s", "");
        // find the numbers
        String[] numbers = input.split("[^0-9.]+");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a calculator program. Choose a function to perform.");
        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            int response = input.nextInt();
            if (response == 1) { // add
                System.out.print("Enter an integer addend: ");
                int addend1 = input.nextInt();
                System.out.print("Enter another integer addend: ");
                int addend2 = input.nextInt();
                // int sum = add(addend1, addend2);
                // System.out.println("Sum: " + sum);
            }
            if (response == 2) { // subtract
                System.out.print("Enter an integer minuend: ");
                int minuend = input.nextInt();
                System.out.print("Enter an integer subtrahend: ");
                int subtrahend = input.nextInt();
                // int difference = subtract(minuend, subtrahend);
                // System.out.println("Difference: " + difference);
            }
            if (response == 3) { // multiply
                System.out.print("Enter a factor: ");
                int factor1 = input.nextInt();
                System.out.print("Enter another integer factor: ");
                int factor2 = input.nextInt();
                // int product = multiply(factor1, factor2);
                // System.out.println("Product: " + product);
            }
            if (response == 4) { // division
                System.out.print("Enter a dividend: ");
                double dividend = input.nextDouble();
                System.out.print("Enter a divisor: ");
                double divisor = input.nextDouble();
                // double quotient = divide(dividend, divisor);
                // System.out.println("Quotient: " + quotient);
            }
            if (response == 0) {
                input.close();
                System.exit(0);
            }
            else {
                System.out.println("Please enter a number between 0 and 4");
            }
        }
    }
}
