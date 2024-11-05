package Verisoft.VisitorPatternExample;

/**
 * Represents an image section in a document. This class implements the Element interface,
 * allowing it to accept a Visitor to perform an operation on it.
 */
public class ImageSection implements Element {
    /**
     * Accepts a visitor and allows it to perform an operation on this ImageSection.
     * @param visitor the Visitor to accept.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
