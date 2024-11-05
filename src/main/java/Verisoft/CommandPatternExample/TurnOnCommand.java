package Verisoft.CommandPatternExample;

/**
 * Concrete command to turn on the television.
 */
public class TurnOnCommand implements Command {
    private Television television = new Television();

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}

