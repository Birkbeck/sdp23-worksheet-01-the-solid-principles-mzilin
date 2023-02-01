public class Phone implements WeatherClient{
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        if (weatherConditions.equals("rainy")) return "";
        return "It is " + weatherConditions;
    }
}
