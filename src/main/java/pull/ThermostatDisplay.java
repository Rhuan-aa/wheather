package pull;

public class ThermostatDisplay implements PullObserver {
    private final WeatherStation weatherStation;
    private int temperature;

    ThermostatDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if (temperature != weatherStation.getTemperature()) {
            setTemperature(weatherStation.getTemperature());
            System.out.println("[THERMOSTAT] Temperatura atual: " + temperature + "°C");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
