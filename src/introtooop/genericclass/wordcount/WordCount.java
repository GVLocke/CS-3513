package introtooop.genericclass.wordcount;

public class WordCount<T extends Comparable<T>> {
    private T[] item_collection;

    WordCount(T[] item_collection) {
        this.item_collection = item_collection;
    }

    public int getWordCount(T search_term) {
        int sum = 0;
        for (T word: item_collection) {
            if (word.compareTo(search_term) == 0) {
                sum += 1;
            }
        }
        return sum;
    }
}
