package Verisoft.CommandPatternExample;

/**
 * Invoker class that uses commands to control the television.
 */
public class RemoteControlA {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }

    ;
}
