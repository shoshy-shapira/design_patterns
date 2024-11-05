package Verisoft.MementoPatternExample;

/**
 * The Memento class is used to store the state of the TextEditor (Originator).
 * It provides methods to retrieve the saved state.
 */
public class Memento {
    private final String state;
    /**
     * Constructor for Memento, saving the provided state.
     *
     * @param state The state to be saved in the Memento.
     */
    public Memento(String state) {
        this.state = state;
    }
    /**
     * Gets the saved state.
     *
     * @return The saved state as a String.
     */
    public String getState() {
        return state;
    }

}
