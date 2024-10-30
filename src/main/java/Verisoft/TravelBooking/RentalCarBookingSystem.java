package Verisoft.TravelBooking;

public class RentalCarBookingSystem {
    /**
     * Books a rental car at the specified location with the given type,
     * for a specific number of days and seating capacity.
     *
     * @param location the location for the car rental (city/country)
     * @param carType  the type of car being rented (e.g., SUV, Sedan)
     * @param fewDays  the number of days for the rental period
     * @param seats    the seating capacity of the car
     */
    public void bookingRentalCar(String location, String carType, int fewDays, int seats) {
        System.out.println("Rental car of type " + carType + ", booked in " + location + ", to " + fewDays + " days, " + seats + " seats.");

    }
}
