package Verisoft.TravelBooking;

/**
 * HotelBookingSystem handles the booking of hotels for customers.
 * This class provides functionality to book a hotel based on location
 * and duration of stay.
 */
public class HotelBookingSystem {
    /**
     * Books a hotel at the specified location for a given number of days.
     *
     * @param location the location of the hotel (city/country)
     * @param fewDays  the number of days for the hotel stay
     */
    public void bookingHotel(String location, int fewDays) {
        System.out.println("Hotel booked in " + location + " to " + fewDays + " days.");

    }
}
