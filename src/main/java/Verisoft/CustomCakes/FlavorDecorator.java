package Verisoft.CustomCakes;

// Concrete decorator class for adding flavors
public class FlavorDecorator extends CakeDecorator{
    public String flavor;
    public double flavorPrice;

    public FlavorDecorator(Cake cake, String flavor, double flavorPrice) {
        super(cake);
        this.flavor = flavor;
        this.flavorPrice = flavorPrice;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Flavor: " + flavor;

    }

    @Override
    public double getPrice() {
        return cake.getPrice() + flavorPrice;
    }
}
