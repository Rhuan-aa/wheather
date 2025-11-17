package withoutObserver.polling;

// Esta classe é totalmente passiva.
// Ela não conhece nenhum display.
public class WeatherStation {
    private int temperature;
    private int humidity;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        // Não notifica ninguém!
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        // Não notifica ninguém!
    }

    // Getters públicos para quem quiser perguntar (fazer poll)
    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
