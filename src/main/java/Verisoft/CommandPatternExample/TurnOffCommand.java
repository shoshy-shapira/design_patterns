package Verisoft.CommandPatternExample;

public class TurnOffCommand implements Command{
    private Television television=new Television();

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
