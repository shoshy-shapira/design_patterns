package Verisoft.TemplateMethodExample;

/**
 * The Soccer class extends Game and provides a specific implementation
 * for the steps to play a soccer game.
 */
public class Soccer extends Game {
    @Override
    protected void initialize() {
        System.out.println("Setting up the soccer field.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Starting the soccer game. Kickoff!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Game over. Team with the most goals wins.");
    }
}
