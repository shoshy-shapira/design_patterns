package Verisoft.MementoPatternExample;

/**
 * The TextEditor class represents the Originator in the Memento pattern.
 * It can create Mementos to save its state and restore it when needed.
 */
public class TextEditor {

    private String content;

    /**
     * Sets the current content of the editor.
     *
     * @param content The new content to be set.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the current content of the editor.
     *
     * @return The current content as a String.
     */
    public String getContent() {
        return content;
    }

    /**
     * Saves the current content into a new Memento.
     *
     * @return A Memento containing the current content.
     */
    public Memento save() {
        return new Memento(content);
    }

    /**
     * Restores the content from a given Memento.
     *
     * @param memento The Memento to restore the content from.
     */
    public void restore(Memento memento) {
        content = memento.getState();
    }

}
