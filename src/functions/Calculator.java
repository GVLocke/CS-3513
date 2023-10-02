package functions;
import java.util.Scanner;

class Calculation {
    int add (int a, int b) {
        return a + b;
    }
    
    int add (int a, int b, int c) {
        return a + b + c;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double divide(double a, double b, double c) {
        return a / b / c;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculation calc = new Calculation();
        System.out.print("This is a calculator program.\nPlease enter an expression with two or three integers and only one kind of operator\nSeparate each number and operator with a space: ");
        String expression = input.nextLine();
        String[] expressionArray = expression.split(" ");
        // for (int i = 0; i < expressionArray.length; i++) {
        //     System.out.println(expressionArray[i]);
        // }
        int a = Integer.parseInt(expressionArray[0]);
        int b = Integer.parseInt(expressionArray[2]);
        int c = 0;
        if (expressionArray.length == 5) {
            c = Integer.parseInt(expressionArray[4]);
        }
        String operator = expressionArray[1];
        String second_operator = expressionArray[3];
        String operators = "+-*/";
        if (!operator.equals(second_operator)) {
            System.out.println("Please enter an expression with only one kind of operator");
            System.exit(1);
        }
        if (operators.indexOf(operator) == -1) {
            System.out.println("Invalid operator");
            System.exit(1);
        }
        switch (operator) {
            case "+":
                if (expressionArray.length == 5) {
                    System.out.println(calc.add(a, b, c));
                } else {
                    System.out.println(calc.add(a, b));
                }
                break;
            case "-":
                if (expressionArray.length == 5) {
                    System.out.println(calc.subtract(a, b, c));
                } else {
                    System.out.println(calc.subtract(a, b));
                }
                break;
            case "*":
                if (expressionArray.length == 5) {
                    System.out.println(calc.multiply(a, b, c));
                } else {
                    System.out.println(calc.multiply(a, b));
                }
                break;
            case "/":
                if (expressionArray.length == 5) {
                    System.out.println(calc.divide(a, b, c));
                } else {
                    System.out.println(calc.divide(a, b));
                }
                break;
        }
        input.close();
    }
}
