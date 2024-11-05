package Verisoft.WeatherStation;

/**
 * Display that provides a basic forecast based on the temperature trend.
 */
public class ForecastDisplay implements WeatherDisplay {
    private float lastTemperature;

    @Override
    public void update(float temperature) {
        String forecast = (temperature > lastTemperature) ? "Improving weather" :
                (temperature < lastTemperature) ? "Cooler weather on the way" :
                        "More of the same";
        lastTemperature = temperature;
        display(forecast);
    }

    /**
     * Displays the forecast based on temperature trends.
     *
     * @param forecast the forecast message
     */
    public void display(String forecast) {
        System.out.println("Forecast: " + forecast);
    }

}
