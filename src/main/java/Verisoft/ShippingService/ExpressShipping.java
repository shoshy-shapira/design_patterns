package Verisoft.ShippingService;

/**
 * ExpressShipping class implementing the ShippingStrategy for express shipping.
 */
public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return 10.0 + (0.75 * weight) + (0.2 * distance); // Example cost calculation

    }
}
