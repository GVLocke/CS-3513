package introtooop.genericclass.tripleitem;

public class App {
    public static void main(String[] args) {
        TripleItem<Integer> triInts = new TripleItem<Integer>(9999, 5555, 6666);
        TripleItem<Short> triShorts = new TripleItem<Short>((short)99, (short)55, (short)66);

        // Try methods frm TripleItem

        triInts.printAll();
        System.out.println("Min: " + triInts.minItem() + "\n");

        triShorts.printAll();
        System.out.println("Min: " + triShorts.minItem());

    }
}
