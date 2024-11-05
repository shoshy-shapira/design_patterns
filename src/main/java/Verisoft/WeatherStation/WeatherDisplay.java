package Verisoft.WeatherStation;

/**
 * Observer interface for displays that receive temperature updates from the WeatherStation.
 */
public interface WeatherDisplay {
    /**
     * Updates the display with the latest temperature.
     *
     * @param temperature the latest temperature provided by the WeatherStation
     */
    void update(float temperature);
}
