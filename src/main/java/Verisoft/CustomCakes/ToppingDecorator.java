package Verisoft.CustomCakes;

// Concrete decorator class for adding toppings
public class ToppingDecorator extends CakeDecorator {
    private String topping;
    private double toppingPrice;

    public ToppingDecorator(Cake cake, String topping, double toppingPrice) {
        super(cake);
        this.topping = topping;
        this.toppingPrice = toppingPrice;
    }


    @Override
    public String getDescription() {
        return cake.getDescription() + ", Topping: " + topping;
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + toppingPrice;
    }


}
