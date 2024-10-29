package Verisoft.PlushToyFactory;

/**
 * Concrete class representing a Bunny plush toy.
 * Implements the clone method to create a copy of itself.
 */
public class Bunny extends Toy {
    public Bunny(String color, String size) {
        super(color, size);
    }

    @Override
    public Toy clone() {
        System.out.println("cloning bunny");
        return new Bunny(this.color, this.size);
    }
}
