package Verisoft.VacationPackages;
/**
 * Represents a client that books vacations using a Flyweight factory for destinations.
 */
public class Client {
    private final String name;
    private final DestinationFlyweightFactory factory;
    /**
     * Constructs a client.
     *
     * @param name the name of the client
     * @param factory the destination factory using Flyweight
     */
    public Client(String name, DestinationFlyweightFactory factory) {
        this.name = name;
        this.factory = factory;
    }
    /**
     * Books a vacation with flight and accommodation.
     *
     * @param destinationName the name of the destination
     * @param codeDestination the destination code
     * @param date the flight date
     * @param hotelName the name of the hotel
     */
    public void bookVaction(String destinationName,String codeDestination, String date, String hotelName){
        Destination destination=factory.getDestination(destinationName, codeDestination);
        destination.bookAccommodation(name,hotelName);
        destination.bookFlight(name,date);

    }
}
