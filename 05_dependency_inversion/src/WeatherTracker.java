import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<WeatherClient> clients;

    public WeatherTracker() {
        clients = new ArrayList<>();
        clients.add(new Phone());
        clients.add(new Emailer());
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for (WeatherClient client : clients) {
            String alert = client.generateWeatherAlert(weatherDescription);
            if (alert.length() > 0) System.out.print(alert);
        }
    }
}
