package swapping;
import java.util.Scanner;

public class SwapNoTemp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Type an integer to be stored in x: ");
        int x = input.nextInt();
        System.out.print("Type one more to be stored in y: ");
        int y = input.nextInt();
        x = x + y - (y = x - y);
        System.out.println("Integer x is now " + x);
        System.out.println("Integer y is now " + y);
        input.close();
    }
}
