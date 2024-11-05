package Verisoft.ShippingService;

/**
 * SameDayShipping class implementing the ShippingStrategy for same-day shipping.
 */
public class SameDayShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return 20.0 + (1.0 * weight) + (0.5 * distance); // Example cost calculation

    }
}
