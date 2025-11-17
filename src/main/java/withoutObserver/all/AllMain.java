package withoutObserver.all;

public class AllMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        ThermostatDisplay thermostatDisplay = new ThermostatDisplay();

        weatherStation.addPhoneDisplay(phoneDisplay);
        weatherStation.addTVDisplay(tvDisplay);
        weatherStation.addThermostatDisplay(thermostatDisplay);

        System.out.println("\n--- Mudando Temp para 20 ---");
        weatherStation.setTemperature(20);

        System.out.println("\n--- Mudando Temp para 68 ---");
        weatherStation.setTemperature(68);

        System.out.println("\n--- Mudando Umidade para 40 ---");
        weatherStation.setHumidity(40);

        System.out.println("\n--- Removendo TV da Estação ---");
        weatherStation.removeTVDisplay();

        System.out.println("\n--- Mudando Umidade para 40 ---");
        weatherStation.setHumidity(60);
    }
}
