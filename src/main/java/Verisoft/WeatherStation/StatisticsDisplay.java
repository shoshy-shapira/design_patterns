package Verisoft.WeatherStation;

/**
 * Display that shows the average temperature based on received updates.
 */
public class StatisticsDisplay implements WeatherDisplay {
    private float totalTemperature;
    private int numReadings;

    @Override
    public void update(float temperature) {
        totalTemperature += temperature;
        numReadings++;
        display();
    }

    /**
     * Displays the average temperature.
     */
    public void display() {
        System.out.println("Average Temperature: " + (totalTemperature / numReadings) + "°C");
    }

}
