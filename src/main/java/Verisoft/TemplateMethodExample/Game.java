package Verisoft.TemplateMethodExample;

/**
 * The Game abstract class defines the template method `play()`
 * which sets the structure for playing a game. Subclasses will implement
 * the specific steps required for different types of games.
 */
public abstract class Game {
    /**
     * Template method that defines the steps to play a game.
     * This method is final to prevent overriding and altering the algorithm's structure.
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    /**
     * Abstract method to initialize the game. Must be implemented by subclasses.
     */
    protected abstract void initialize();

    /**
     * Abstract method to define the starting of the game. Must be implemented by subclasses.
     */
    protected abstract void startPlay();

    /**
     * Abstract method to define the end of the game. Must be implemented by subclasses.
     */
    protected abstract void endPlay();
}