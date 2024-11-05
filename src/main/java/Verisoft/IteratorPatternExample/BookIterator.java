package Verisoft.IteratorPatternExample;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Concrete iterator implementation for iterating over a collection of books.
 */
public class BookIterator implements Iterator {
    private List<Book> books;
    private int position;

    /**
     * Constructs a new BookIterator for the specified list of books.
     *
     * @param books The list of books to iterate over
     */
    public BookIterator(List<Book> books) {
        this.books = books;
        this.position = 0;
    }

    /**
     * Checks if there are more books to iterate over.
     *
     * @return true if there are more books, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    /**
     * Returns the next book in the iteration.
     *
     * @return the next Book object
     * @throws NoSuchElementException if there are no more books
     */
    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return books.get(position++);
    }
}
