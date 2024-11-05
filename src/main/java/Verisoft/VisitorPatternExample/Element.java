package Verisoft.VisitorPatternExample;

/**
 * The Element interface defines an accept method that allows a Visitor to perform
 * an operation on the element.
 */
public interface Element {
    /**
     * Accepts a visitor, allowing it to perform an operation on this element.
     * @param visitor the Visitor to accept.
     */
    void accept(Visitor visitor);
}
