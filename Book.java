import java.util.ArrayList;

public class Book {
    String title, author, isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        ArrayList<Book> collection = new ArrayList<>();
        
        Book b1 = new Book("Java Basics", "James", "111");
        Book b2 = new Book("Data Structures", "Sara", "222");

        collection.add(b1);
        collection.add(b2);
        collection.remove(b1);

        for (Book b : collection) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}


