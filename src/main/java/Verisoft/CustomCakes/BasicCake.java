package Verisoft.CustomCakes;

// Concrete class implementing the Cake interface
public class BasicCake implements Cake {
    private String description;
    private double price;

    public BasicCake() {
        this.description = "basic cake";
        this.price = 10.00;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
