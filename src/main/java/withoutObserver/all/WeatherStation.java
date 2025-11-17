package withoutObserver.all;

public class WeatherStation {
    private int temperature;
    private int humidity;
    private PhoneDisplay phoneDisplay;
    private TVDisplay tvDisplay;
    private ThermostatDisplay thermostatDisplay;

    public void addPhoneDisplay(PhoneDisplay display) {
        this.phoneDisplay = display;
    }
    public void addTVDisplay(TVDisplay display) {
        this.tvDisplay = display;
    }
    public void addThermostatDisplay(ThermostatDisplay display) {
        this.thermostatDisplay = display;
    }
    public void removePhoneDisplay() {
        this.phoneDisplay = null;
    }
    public void removeTVDisplay() {
        this.tvDisplay = null;
    }
    public void removeThermostatDisplay() {
        this.thermostatDisplay = null;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        // Chama a notificação manual
        notifyDisplays();
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
        // Chama a notificação manual
        notifyDisplays();
    }

    private void notifyDisplays() {
        if (phoneDisplay != null) {
            phoneDisplay.update(temperature, humidity);
        }
        if (tvDisplay != null) {
            tvDisplay.update(temperature, humidity);
        }
        if (thermostatDisplay != null) {
            thermostatDisplay.update(temperature);
        }
    }
}
