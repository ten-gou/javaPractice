public class WeatherMachine {
    //creates a thermometer within the WeatherMachine
    static Thermometer thermometer = new Thermometer();

    //declares variable
    String city;

    //constructor that declares the city for all WeatherMachines
    WeatherMachine() {
        city = "San Ramon";
    }

    public String getWeatherReport() {
        Integer[] integers = getPastTemperatures();
        String statement = "Your Last 24 Hours in " + city + ":" + System.lineSeparator();
        for (int i = 0; i < 24; i++) {
            String forecast = i + ":00 - " + integers[i] + " degrees" + System.lineSeparator();
            statement = statement + forecast;
        };

        return statement;
    }

    private Integer[] getPastTemperatures() {

        Integer[] pastTemps = new Integer[24];

        for (int i = 0; i < pastTemps.length; i++) {
            int a = thermometer.getTemperature();

            pastTemps[i] = a;
        }

        return pastTemps;
    }
}
