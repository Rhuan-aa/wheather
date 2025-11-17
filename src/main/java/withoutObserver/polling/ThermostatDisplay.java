package withoutObserver.polling;

class ThermostatDisplay {
    private int temperature;
    private final WeatherStation weatherStation;

    public ThermostatDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void pollAndDisplay() {
        int newTemperature = weatherStation.getTemperature();

        if (newTemperature != this.temperature) {
            this.temperature = newTemperature;
            System.out.println("[THERMOSTAT] Temperatura atual: " + temperature + "°C");
        }
    }
}
