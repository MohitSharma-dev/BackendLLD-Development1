package Observer;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrStatsDisplay currStatsDisplay = new CurrStatsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currStatsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();

        weatherData.removeObserver(currStatsDisplay);

        weatherData.setMeasurements(85, 75, 29.2f);
    }
}
