package pull;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements PullSubject {
    private final List<PullObserver> observers = new ArrayList<>();
    private int temperature;
    private int humidity;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(PullObserver observer) {
        observers.add(observer);
    }


    @Override
    public void removeObserver(PullObserver observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (PullObserver observer : observers) {
            observer.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
