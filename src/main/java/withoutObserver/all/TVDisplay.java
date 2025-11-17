package withoutObserver.all;

public class TVDisplay {
    private int humidity;
    private int temperature;

    public void update(int temperature, int humidity) {
        int fahrenheit = temperature * 9 / 5 + 32;
        setHumidity(humidity);
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
