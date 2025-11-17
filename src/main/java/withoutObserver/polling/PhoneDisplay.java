package withoutObserver.polling;

class PhoneDisplay {
    private int temperature;
    private int humidity;
    private final WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void pollAndDisplay() {
        int newTemperature = weatherStation.getTemperature();
        int newHumidity = weatherStation.getHumidity();

        if (newTemperature != this.temperature || newHumidity != this.humidity) {

            this.temperature = newTemperature;
            this.humidity = newHumidity;

            System.out.println("[PHONE] Temperatura atual: " + temperature + "°C, Umidade do ar: " + humidity + "%");
        }
    }
}
