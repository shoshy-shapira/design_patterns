package Verisoft.VisitorPatternExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a document composed of various elements such as text, images, and tables.
 * This class aggregates elements and allows a visitor to visit each element.
 */
public class Document {
    private List<Element> elements = new ArrayList<>();

    /**
     * Adds an element to the document.
     * @param element the element to add.
     */
    public void addElement(Element element) {
        elements.add(element);
    }

    /**
     * Allows a visitor to visit each element in the document.
     * @param visitor the Visitor to accept.
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
