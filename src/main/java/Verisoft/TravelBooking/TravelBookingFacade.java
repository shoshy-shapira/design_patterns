package Verisoft.TravelBooking;

/**
 * TravelBookingFacade provides a simplified interface for booking travel services,
 * including flights, hotels, and rental cars.
 * This class implements the Facade design pattern to hide the complexities
 * of the underlying subsystems.
 */
public class TravelBookingFacade {
    private final FlightBookingSystem flightBooking;
    private final HotelBookingSystem hotelBooking;
    private final RentalCarBookingSystem carBooking;

    /**
     * Creates a new instance of TravelBookingFacade and initializes
     * the booking systems for flights, hotels, and rental cars.
     */
    public TravelBookingFacade() {
        this.flightBooking = new FlightBookingSystem();
        this.hotelBooking = new HotelBookingSystem();
        this.carBooking = new RentalCarBookingSystem();
    }

    /**
     * Books a flight from the specified origin to the specified destination
     * on the given date.
     *
     * @param origin      the city of departure
     * @param destination the city of arrival
     * @param date        the date of the flight
     */
    public void bookFlight(String origin, String destination, String date) {
        flightBooking.bookingFlight(origin, destination, date);
    }

    /**
     * Books a hotel at the specified location for a given number of days.
     *
     * @param location the location of the hotel (city/country)
     * @param fewDays  the number of days for the hotel stay
     */
    public void bookHotel(String location, int fewDays) {
        hotelBooking.bookingHotel(location, fewDays);
    }

    /**
     * Books a rental car at the specified location with the given type,
     * for a specific number of days and seating capacity.
     *
     * @param location the location for car rental (city/country)
     * @param carType  the type of car being rented
     * @param fewDays  the number of days for the rental period
     * @param seats    the seating capacity of the car
     */
    public void bookRentalCar(String location, String carType, int fewDays, int seats) {
        carBooking.bookingRentalCar(location, carType, fewDays, seats);
    }
}
