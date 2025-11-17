package withoutObserver.all;

public class ThermostatDisplay {
    private int temperature;
    private int humidity;

    public void update(int temperature) {
        setTemperature(temperature);
        System.out.println("[THERMOSTAT] Temperatura atual: " + temperature + "°C");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
