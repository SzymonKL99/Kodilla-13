package com.kodilla.good.patterns.part2;

import java.util.Objects;

public class Flight {
    private final String startingCity;
    private final String destinationCity;

    public Flight(String startingCity, String destinationCity) {
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
    }
    public String getStartingCity() {

        return startingCity;
    }
    public String getDestinationCity() {

        return destinationCity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Flight flight = (Flight) o;
        return Objects.equals(startingCity, flight.startingCity) &&
                Objects.equals(destinationCity, flight.destinationCity);
    }
    @Override
    public  int hashCode() {
        return Objects.hash(startingCity, destinationCity);

    }
    @Override
    public String toString() {

        return startingCity + " -> " + destinationCity;
    }
}
