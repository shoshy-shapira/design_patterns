package Verisoft.IteratorPatternExample;

/**
 * Interface defining the contract for book collections that can create iterators.
 */
public interface Aggregate {
    /**
     * Creates and returns an iterator for the book collection.
     *
     * @return An iterator instance
     */
    Iterator createIterator();
}
