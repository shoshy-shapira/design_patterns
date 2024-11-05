package Verisoft.IteratorPatternExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of books that can be iterated over.
 * Implements the Aggregate interface to provide iteration capability.
 */
public class BookCollection implements Aggregate {
    private List<Book> books;

    /**
     * Constructs a new empty BookCollection.
     */
    public BookCollection() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the collection.
     *
     * @param book The book to add
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Creates and returns an iterator for this book collection.
     *
     * @return A new BookIterator instance
     */
    @Override
    public Iterator createIterator() {
        return new BookIterator(this.books);
    }
}
