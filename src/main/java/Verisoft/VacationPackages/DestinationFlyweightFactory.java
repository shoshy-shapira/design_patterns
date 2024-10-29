package Verisoft.VacationPackages;

import java.util.HashMap;
import java.util.Map;
/**
 * Flyweight factory responsible for managing and providing destination instances.
 */
public class DestinationFlyweightFactory {
    private final Map<String, Destination> destinations = new HashMap<>();
    /**
     * Returns a destination by name and code. If the destination does not exist, creates a new one.
     *
     * @param nameDestination the name of the destination
     * @param codeDestination the destination code
     * @return the requested destination
     */
    public Destination getDestination(String nameDestination, String codeDestination) {
        if (!destinations.containsKey(nameDestination)) {
            destinations.put(nameDestination, new ConcreteDestination(nameDestination, codeDestination));
        }
        return
                destinations.get(nameDestination);
    }
    /**
     * Returns the number of destinations available in the factory.
     *
     * @return the number of destinations
     */
    public int countDestinations() {
        return destinations.size();
    }

}
