package Verisoft.CustomCakes;

// Abstract decorator class implementing the Cake interface
public abstract class CakeDecorator implements Cake {

    protected Cake cake; // Reference to a Cake object
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription();
    }

    @Override
    public double getPrice() {
        return cake.getPrice();
    }

}
