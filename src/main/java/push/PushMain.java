package push;

public class PushMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        PushObserver thermostatDisplay = new ThermostatDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);
        weatherStation.registerObserver(thermostatDisplay);

        System.out.println("\n--- Mudando Temp para 20 ---");
        weatherStation.setTemperature(20);

        System.out.println("\n--- Mudando Temp para 68 ---");
        weatherStation.setTemperature(68);

        System.out.println("\n--- Mudando Umidade para 40 ---");
        weatherStation.setHumidity(40);

        System.out.println("\n--- Removendo TV da Estação ---");
        weatherStation.removeObserver(tvDisplay);

        System.out.println("\n--- Mudando Temp para 25 ---");
        weatherStation.setTemperature(25);
    }
}