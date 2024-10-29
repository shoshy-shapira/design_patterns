package Verisoft.VacationPackages;

import java.util.Date;
/**
 * Interface defining actions for booking a flight and accommodation in a destination.
 */
public interface Destination {
    void bookFlight (String nameClient, String date );
    void bookAccommodation (String nameClient, String nameHotel );
}
