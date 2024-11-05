package Verisoft.VisitorPatternExample;

/**
 * Represents a table section in a document. This class implements the Element interface,
 * allowing it to accept a Visitor to perform an operation on it.
 */
public class TableSection implements Element {
    /**
     * Accepts a visitor and allows it to perform an operation on this TableSection.
     * @param visitor the Visitor to accept.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
