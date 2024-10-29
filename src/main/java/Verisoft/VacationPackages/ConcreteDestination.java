package Verisoft.VacationPackages;
/**
 * Represents a specific destination that can book flights and accommodations.
 */
public class ConcreteDestination implements Destination {
    private String nameDestination;
    private String codeDestination;
    private String currentClientName;
    /**
     * Constructs a specific destination.
     *
     * @param nameDestination the name of the destination
     * @param codeDestination the destination code
     */
    public ConcreteDestination(String nameDestination, String codeDestination) {
        this.nameDestination = nameDestination;
        this.codeDestination = codeDestination;
    }

    @Override
    public void bookFlight(String nameClient, String date) {
        this.currentClientName = nameClient;
        System.out.println("Booked flight to "+nameDestination+ " for "+ currentClientName+ " on date "+ date);

    }

    @Override
    public void bookAccommodation(String nameClient, String nameHotel) {
        System.out.println("Booked " + nameHotel + " in " + nameDestination + " for " + nameClient);    }
}
