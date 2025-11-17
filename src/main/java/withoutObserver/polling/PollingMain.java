package withoutObserver.polling;

import java.util.ArrayList;
import java.util.List;

public class PollingMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Displays agora recebem a estação no construtor
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        TVDisplay tvDisplay = new TVDisplay(weatherStation); // (Supondo que TVDisplay foi criado como PhoneDisplay)
        ThermostatDisplay thermostatDisplay = new ThermostatDisplay(weatherStation);

        // Precisamos de uma lista de displays "ativos" para simular o polling
        List<Object> activeDisplays = new ArrayList<>();
        activeDisplays.add(phoneDisplay);
        activeDisplays.add(tvDisplay);
        activeDisplays.add(thermostatDisplay);

        System.out.println("--- Polling inicial ---");
        pollAll(activeDisplays); // Faz o poll de todos pela primeira vez

        System.out.println("\n--- Mudando Temp para 20 ---");
        weatherStation.setTemperature(20);
        pollAll(activeDisplays); // Nada acontece no console até fazermos o poll

        System.out.println("\n--- Mudando Umidade para 40 ---");
        weatherStation.setHumidity(40);
        pollAll(activeDisplays);

        System.out.println("\n--- Removendo TV da lista de polling ---");
        activeDisplays.remove(tvDisplay); // A TV para de fazer polling

        System.out.println("\n--- Mudando Umidade para 60 ---");
        weatherStation.setHumidity(60);
        pollAll(activeDisplays); // TV não será atualizada
    }

    // Método auxiliar para disparar o polling em todos
    private static void pollAll(List<Object> displays) {
        for (Object display : displays) {
            if (display instanceof PhoneDisplay) {
                ((PhoneDisplay) display).pollAndDisplay();
            } else if (display instanceof TVDisplay) {
                ((TVDisplay) display).pollAndDisplay(); // (Chamada do TVDisplay)
            } else if (display instanceof ThermostatDisplay) {
                ((ThermostatDisplay) display).pollAndDisplay();
            }
        }
    }
}
