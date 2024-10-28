package Verisoft.PlushToyFactory;

public class Bear extends Toy {
    @Override
    public Toy clone() {
        System.out.println("clone bear");
        return new Bear();
    }
}
