package Verisoft.PlushToyFactory;

public class Rabbit extends Toy {
    @Override
    public Toy clone() {
        System.out.println("clone rabbit");
        return new Rabbit();
    }
}
