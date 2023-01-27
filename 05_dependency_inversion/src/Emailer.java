public class Emailer implements WeatherClient {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        if (weatherConditions.equals("sunny")) return "";
        return "It is " + weatherConditions;
    }
}
