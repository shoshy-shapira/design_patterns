package Verisoft.CommandPatternExample;

/**
 * Concrete command to change the television channel.
 */
public class ChangeChannelCommand implements Command {
    private Television television = new Television();
    private int channel;

    public ChangeChannelCommand(Television television, int channel) {
        this.television = television;
        this.channel = channel;
    }

    @Override
    public void execute() {
        television.changeChannel(channel);
    }
}
