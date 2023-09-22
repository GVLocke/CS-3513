package referencetype;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> valsList = new ArrayList<Integer>();
        valsList.add(31);
        valsList.add(43);
        valsList.add(394);
        valsList.add(4845990);
        for (int i = 0; i < valsList.size(); i++ ){
            System.out.println(valsList.get(i));
        }
    }
}