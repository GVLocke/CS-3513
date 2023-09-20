package functions;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String input = "1.4+1";
        input = input.replaceAll("\\s", "");
        // find the numbers
        String[] number_Strings = input.split("[^0-9.]+");
        // find the operator(s)
        String[] operators = input.split("[0-9.]+", -1);
        List<String> operatorList = new ArrayList<>(Arrays.asList(operators));
        operatorList.removeIf(String::isEmpty);
        operators = operatorList.toArray(new String[0]);
        double doubles[] = new double[number_Strings.length];
        int ints[] = new int[number_Strings.length];
        // iterate through the list of numbers and convert to ints or doubles
        for (int i = 0; i < number_Strings.length; i++) {
            if (number_Strings[i].contains(".")) { // if any of the numbers contain a decimal point, convert all numbers to doubles
                for (int j = 0; j < number_Strings.length; j++) {
                    // convert all numbers to doubles
                    doubles[j] = Double.parseDouble(number_Strings[j]);
                }
                break;
            }
        }
        // if the doubles array is still all zeroes, convert all numbers to ints
        if (Arrays.stream(doubles).allMatch(d -> d == 0)) {
            for (int i = 0; i < number_Strings.length; i++) {
                ints[i] = Integer.parseInt(number_Strings[i]);
            }
        }
        // if there are more than three numbers, give an error "Maximum of three numbers" and exit
         

        // if they're all the same operator, plug the numbers into the correct method
        if (operators[0] == "+" && Arrays.stream(operators).distinct().count() == 1) {
            
        }

    }
}