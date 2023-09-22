package referencetype;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimalinput;
        String binaryOuput;

        System.out.print("Enter a decimal number: ");
        decimalinput = input.nextInt();
        binaryOuput = Integer.toBinaryString(decimalinput);
        System.out.println("The binary representation of " + decimalinput + " is " + binaryOuput);
        input.close();
    }
}
