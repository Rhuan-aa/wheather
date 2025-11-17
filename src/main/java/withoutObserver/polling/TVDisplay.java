package withoutObserver.polling;

public class TVDisplay {
    private int temperature;
    private int humidity;
    private final WeatherStation weatherStation;

    public TVDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    // Método de Polling
    public void pollAndDisplay() {
        int newTemperature = weatherStation.getTemperature();
        int newHumidity = weatherStation.getHumidity();

        if (newTemperature != this.temperature || newHumidity != this.humidity) {

            this.temperature = newTemperature;
            this.humidity = newHumidity;

            System.out.println("[TV" +
                    "] Temperatura atual: " + temperature + "°C, Umidade do ar: " + humidity + "%");
        }
    }
}
