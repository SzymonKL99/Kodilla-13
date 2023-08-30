package com.kodilla.good.patterns.part2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightManager {
    private final List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFromCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getStartingCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsByCity(String intermediateCity, String destinationCity) {

        List<Flight> connectingFlights = new ArrayList<>();

        List<Flight> outboundFlights = findFlightsFromCity(intermediateCity);
        List<Flight> inboundFlights = findFlightsToCity(destinationCity);

        for (Flight outboundFlight : outboundFlights) {
            for (Flight inboundFlight : inboundFlights) {
                if (outboundFlight.getDestinationCity().equals(inboundFlight.getStartingCity())) {
                    connectingFlights.add(outboundFlight);
                    connectingFlights.add(inboundFlight);
                }
            }
        }

        return connectingFlights;
    }

    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();

        flightManager.addFlight(new Flight("Gdańsk", "Wrocław"));
        flightManager.addFlight(new Flight("Gdańsk", "Kraków"));
        flightManager.addFlight(new Flight("Kraków", "Wrocław"));

        System.out.println("Flights from Gdańsk: ");
        flightManager.findFlightsFromCity("Gdańsk").forEach(System.out::println);

        System.out.println("\nFlights to Wrocław:");
        flightManager.findFlightsToCity("Wrocław").forEach(System.out::println);

        System.out.println("\nConnecting flights from Gdańsk by Kraków to Wrocław:");
        flightManager.findFlightsByCity("Gdańsk", "Wrocław").forEach(System.out::println);
    }
}