package withoutObserver.all;

class PhoneDisplay {
    private int temperature;
    private int humidity;

    public void update(int temperature, int humidity) {
        setHumidity(humidity);
        setTemperature(temperature);
        System.out.println("[PHONE] Temperatura atual: " + temperature + "°C, Umidade do ar: " + humidity + "%");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
