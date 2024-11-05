package Verisoft.ShippingService;

/**
 * StandardShipping class implementing the ShippingStrategy for standard shipping.
 */
public class StandardShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return 5.0 + (0.5 * weight) + (0.1 * distance); // Example cost calculation

    }
}
