package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private double temperature;
    private double humidity;
    private double pressure;

    private List<Observer> observers;

    WeatherData(){
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o){
        System.out.println("Registered Observer");
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Removed Observer");
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notify Observers");
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }

    void measurementsChanged(){
//        if you want to do anything else
        notifyObservers();
    }

    void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
