package Observer;

public class CurrStatsDisplay implements Display , Observer{
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Statistics : ");
        System.out.println("Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
