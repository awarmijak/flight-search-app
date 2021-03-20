package backend;

import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokyo", 1800));
        this.flights.add(new Flight("Paris", "Berlin", 79));
        this.flights.add(new Flight("Warsaw", "Paris", 120));
        this.flights.add(new Flight("Madrid", "Berlin", 200));
        this.flights.add(new Flight("Berlin", "Warsaw", 77));
        this.flights.add(new Flight("Paris", "Madrid", 180));
        this.flights.add(new Flight("Porto", "Warsaw", 412));
        this.flights.add(new Flight("Madrid", "Porto", 102));
        this.flights.add(new Flight("Warsaw", "Madrid", 308));
    }

    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (Flight flight : this.flights) {
            if (!cities.contains(flight.departure)) {
                cities.add(flight.departure);
            }
            if (!cities.contains((flight.arrival))) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }

    public Flight getCheapestFlight() {
        Flight cheapestFlight = null;
        for (Flight flight : this.flights) {
            if (cheapestFlight == null || flight.price < cheapestFlight.price) {
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }

    public void checkIflightExist(String paris, String madrid) {
    }

    public void displayFightsFromCity(String paris) {
    }

    public void displayFlightsToCity(String warsaw) {
    }
}