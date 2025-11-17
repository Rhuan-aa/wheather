package pull;

class TVDisplay implements PullObserver {
    private final WeatherStation weatherStation;
    private int humidity;
    private int temperature;

    TVDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        int fahrenheit = weatherStation.getTemperature() * 9 / 5 + 32;
        setHumidity(weatherStation.getHumidity());
        setTemperature(fahrenheit);
        System.out.println("[TV] Temperatura atual: " + fahrenheit + "°F, Umidade do ar: " + humidity + "%");
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
