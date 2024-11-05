package Verisoft.MementoPatternExample;

import java.util.Stack;

/**
 * The History class serves as the Caretaker in the Memento pattern.
 * It keeps track of Mementos created by the TextEditor without modifying them.
 */
public class History {
    private final Stack<Memento> history = new Stack<>();

    /**
     * Adds a Memento to the history stack.
     *
     * @param memento The Memento to be saved in the history.
     */
    public void save(Memento memento) {
        history.push(memento);
    }

    /**
     * Retrieves and removes the most recent Memento from the history stack.
     *
     * @return The last saved Memento, or null if history is empty.
     */
    public Memento undo() {
        return history.isEmpty() ? null : history.pop();
    }
}