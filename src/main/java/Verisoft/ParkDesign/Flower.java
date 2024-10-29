package Verisoft.ParkDesign;
/**
 * Concrete class representing an individual flower.
 * Cannot contain child elements.
 */
public class Flower implements ParkElement{
private String name;

    public Flower(String name) {
        this.name = name;
    }

//    @Override
//    public void add(ParkElement element) {
//        throw new UnsupportedOperationException("Cannot add elements to a flower.");
//    }
//
//    @Override
//    public void remove(ParkElement element) {
//        throw new UnsupportedOperationException("Cannot remove elements from a flower.");
//    }

    @Override
    public void display() {
        System.out.println("Flower: " + name);
    }
}
