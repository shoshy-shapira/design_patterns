package Verisoft.ShippingService;

/**
 * ShippingStrategy interface representing the shipping strategy with a method to calculate shipping cost.
 */
public interface ShippingStrategy {
    /**
     * Calculates the shipping cost based on the order weight and distance.
     *
     * @param weight   the weight of the order
     * @param distance the distance for shipping
     * @return the calculated shipping cost
     */
    double calculateShippingCost(double weight, double distance);
}
