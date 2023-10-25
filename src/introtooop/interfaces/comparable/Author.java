package introtooop.interfaces.comparable;

public class Author implements Comparable<Author> {
    String firstname;
    String lastname;
    String bookname;

    Author(String first, String last, String book) {
        this.firstname = first;
        this.lastname = last;
        this.bookname = book;
    }

    @Override
    public int compareTo(Author au) {
        /*
        Sorting by last name.compareTo should return < 0 if this(keyword)
        is supposed to be less than au, > 0 if this is supposed to be 
        greater than object au and 0 if they are supposed to be equal
        */
        int last = this.lastname.compareTo(au.lastname);
        return last == 0 ? this.firstname.compareTo(au.firstname) : last;
    }
}
