package Verisoft.WeatherStation;

/**
 * Display that shows the current temperature.
 */
public class CurrentConditionsDisplay implements WeatherDisplay{
    private float currentTemperature;

    @Override
    public void update(float temperature) {
        this.currentTemperature = temperature;
        display();
    }

    /**
     * Displays the current temperature.
     */
    public void display() {
        System.out.println("Current Conditions: " + currentTemperature + "°C");
    }

}
