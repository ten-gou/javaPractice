public class Simulation {

    public static void main(String[] args) {
        //creates a new instance of the weatherMachine
        WeatherMachine weatherMachine = new WeatherMachine();

        String pastTemperatures = weatherMachine.getWeatherReport();
        System.out.println(pastTemperatures);
    }
    
}
