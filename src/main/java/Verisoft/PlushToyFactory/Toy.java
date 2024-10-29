package Verisoft.PlushToyFactory;

/**
 * Abstract class representing a generic plush toy.
 * Defines a prototype with the ability to clone itself.
 */
abstract public class Toy implements Cloneable {
    protected String color;
    protected String size;

    public Toy(String color, String size) {
        this.color = color;
        this.size = size;
    }

    /**
     * Abstract clone method to create a copy of the toy.
     * Implemented by subclasses to return a specific type of toy.
     */
    @Override
    abstract public Toy clone();

    // Getters
    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
