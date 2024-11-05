package Verisoft.VisitorPatternExample;

/**
 * The Visitor interface defines methods for visiting different elements in a document.
 * Each method represents an operation that can be performed on a specific element type.
 */
public interface Visitor {
    /**
     * Visits a TextSection element.
     * @param textSection the TextSection element to be visited.
     */
    void visit(TextSection textSection);

    /**
     * Visits an ImageSection element.
     * @param imageSection the ImageSection element to be visited.
     */
    void visit(ImageSection imageSection);

    /**
     * Visits a TableSection element.
     * @param tableSection the TableSection element to be visited.
     */
    void visit(TableSection tableSection);
}
