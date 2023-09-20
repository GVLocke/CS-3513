package arrays;
import java.util.Scanner;

public class GreatestValue {
    public static void main(String[] args) throws Exception {
        System.out.println("This program finds the largest number in a list of numbers.");
        System.out.print("How many numbers should the list contain? ");
        Scanner input = new Scanner(System.in);
        final int i = input.nextInt();
        int values[] = new int[i];
        for (int k = 0; k < i; k++) {
            System.out.print("Enter value at index " + k + ": ");
            values[k] = input.nextInt();
        }
        System.out.println("The greatest value in the list is " + findArrayMax(values));
        input.close();
    }

    public static int findArrayMax(int[] values) {
        // Initialize int max as the first value of the array
        int max = values[0];
        int i = values.length;
        // iterate through the array, starting with the second value
        for (int k = 1; k < i; k++) {
            // if the current value is greater than max, set max to equal the current value.
            if (max < values[k]) {
                max = values[k];
            }
        }
        return max;
    }
}