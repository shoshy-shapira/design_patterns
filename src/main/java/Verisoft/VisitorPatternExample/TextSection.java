package Verisoft.VisitorPatternExample;

/**
 * Represents a text section in a document. This class implements the Element interface,
 * allowing it to accept a Visitor to perform an operation on it.
 */
public class TextSection implements Element {
    private String text;

    /**
     * Constructor for creating a TextSection with given text.
     * @param text the text content of the section.
     */
    public TextSection(String text) {
        this.text = text;
    }

    /**
     * Returns the text content of this TextSection.
     * @return the text content.
     */
    public String getText() {
        return text;
    }

    /**
     * Accepts a visitor and allows it to perform an operation on this TextSection.
     * @param visitor the Visitor to accept.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
