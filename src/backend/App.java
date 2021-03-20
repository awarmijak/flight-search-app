package backend;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        database.checkIflightExist("Paris", "Madrid");
        database.displayFightsFromCity("Paris");
        database.displayFlightsToCity("Warsaw");
        ArrayList<String> cities = database.getCities();
        System.out.println(cities);
        Flight cheapestFlight = database.getCheapestFlight();
        System.out.println("Cheapest flight: " + cheapestFlight.getDetails());

    }
}
