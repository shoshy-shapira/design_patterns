package Verisoft.TravelBooking;

/**
 * FlightBookingSystem handles the booking of flights for customers.
 * This class provides functionality to book a flight based on origin,
 * destination, and date of travel.
 */
public class FlightBookingSystem {
    /**
     * Books a flight from the specified origin to the specified destination
     * on the given date.
     *
     * @param origin      the city of departure
     * @param destination the city of arrival
     * @param date        the date of the flight
     */
    public void bookingFlight(String origin, String destination, String date) {
        System.out.println("Flight booked from " + origin + " to " + destination + " in " + date);
    }
}
