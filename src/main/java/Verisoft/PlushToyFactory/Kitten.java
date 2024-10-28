package Verisoft.PlushToyFactory;

public class Ketty extends Toy {
    @Override
    public Toy clone() {
        System.out.println("clone doll");
        return new Ketty();
    }
}
