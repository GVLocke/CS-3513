package referencetype;
import java.util.Scanner;

public class ParsingInts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String integerString = input.nextLine();
        int primitiveint = Integer.parseInt(integerString);
        System.out.print("Enter a double: ");
        String doubleString = input.nextLine();
        Integer errorint = Integer.valueOf(doubleString);
        System.out.print(primitiveint);
        System.out.println(errorint);
        input.close();
    }
}
