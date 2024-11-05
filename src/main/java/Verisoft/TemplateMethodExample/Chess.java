package Verisoft.TemplateMethodExample;
/**
 * The Chess class extends Game and provides a specific implementation
 * for the steps to play a chess game.
 */
public class Chess extends Game {
    @Override
    protected void initialize() {
        System.out.println("Setting up the chess board.");

    }

    @Override
    protected void startPlay() {
        System.out.println("Starting the chess game. White makes the first move.");

    }

    @Override
    protected void endPlay() {
        System.out.println("Game over. Determining winner or draw.");

    }
}
