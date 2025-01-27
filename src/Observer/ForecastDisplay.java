package Observer;

public class ForecastDisplay implements Display , Observer{
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure =  pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast Display :");
        if(temperature > 80)
        System.out.println("It is going to hot evening! Please get your ice-creams ready!");
    }
}
