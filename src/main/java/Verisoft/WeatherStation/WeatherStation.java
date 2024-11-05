package Verisoft.WeatherStation;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject class representing the weather station, which notifies displays of temperature updates.
 */
public class WeatherStation {

    private List<WeatherDisplay> displays;
    private float temperature;

    /**
     * Constructor for WeatherStation, initializes the list of displays.
     */
    public WeatherStation() {
        displays = new ArrayList<>();
    }

    /**
     * Registers a display as an observer to receive temperature updates.
     *
     * @param display the display to register
     */
    public void addDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    /**
     * Removes a display from the list of observers.
     *
     * @param display the display to remove
     */
    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    /**
     * Sets a new temperature and notifies all displays of the change.
     *
     * @param newTemperature the new temperature to update
     */
    public void setTemperature(float newTemperature) {
        this.temperature = newTemperature;
        notifyDisplays();
    }

    /**
     * Notifies all registered displays of the latest temperature.
     */
    private void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature);
        }
    }
}

