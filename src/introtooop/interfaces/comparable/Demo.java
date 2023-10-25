package introtooop.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Author> al = new ArrayList<Author>();
        al.add(new Author("J.K.", "Rowling", "Harry Potter and the Philosopher's Stone"));
        al.add(new Author("J.R.R.", "Tolkien", "The Lord of the Rings"));
        al.add(new Author("George R.R.", "Martin", "A Game of Thrones"));
        al.add(new Author("Stephen", "King", "The Shining"));
        al.add(new Author("Margaret", "Atwood", "The Handmaid's Tale"));
        al.add(new Author("Jane", "Austen", "Pride and Prejudice"));
        al.add(new Author("Ernest", "Hemingway", "The Old Man and the Sea"));
        al.add(new Author("F. Scott", "Fitzgerald", "The Great Gatsby"));
        al.add(new Author("Leo", "Tolstoy", "War and Peace"));
        al.add(new Author("Mark", "Twain", "The Adventures of Huckleberry Finn"));
        Collections.sort(al);
        for(Author str:al) {
            System.out.println(str.firstname+" "+ str.lastname+"\n    "+"Book: "+str.bookname);
        }
    }
}
