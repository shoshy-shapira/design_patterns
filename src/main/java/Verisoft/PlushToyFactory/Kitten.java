package Verisoft.PlushToyFactory;

public class Kitten extends Toy {
    public Kitten(String color, String size) {
        super(color, size);
    }

    @Override
    public Toy clone() {
        System.out.println("cloning kitten");
        return new Kitten(this.color, this.size);
    }
}
