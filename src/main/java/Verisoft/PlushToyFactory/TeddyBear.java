package Verisoft.PlushToyFactory;

public class TeddyBear extends Toy {
    public TeddyBear(String color, String size) {
        super(color, size);
    }

    @Override
    public Toy clone() {
        System.out.println("cloning teddyBear");
        return new TeddyBear(this.color, this.size);
    }
}
