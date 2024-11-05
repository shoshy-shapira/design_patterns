package Verisoft.ShippingService;

/**
 * ShippingContext class that contains a reference to a ShippingStrategy
 * and allows changing the shipping strategy dynamically.
 */
public class ShippingContext {
    private ShippingStrategy shippingStrategy;

    /**
     * Sets the shipping strategy.
     *
     * @param shippingStrategy the shipping strategy to set
     */
    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;

    }

    /**
     * Calculates the shipping cost based on the set strategy.
     *
     * @param weight the weight of the order
     * @param distance the distance for shipping
     * @return the calculated shipping cost
     */
    public double calculateShippingCost(double weight, double distance) {
        return shippingStrategy.calculateShippingCost(weight, distance);
    }
}
