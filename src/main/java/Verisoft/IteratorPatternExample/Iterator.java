package Verisoft.IteratorPatternExample;

/**
 * Interface defining the basic operations for iterating over a collection of books.
 */
public interface Iterator {
    /**
     * Checks if there are more books to iterate over.
     *
     * @return true if there are more books, false otherwise
     */
    boolean hasNext();

    /**
     * Returns the next book in the iteration.
     *
     * @return the next Book object
     */
    Book next();
}
