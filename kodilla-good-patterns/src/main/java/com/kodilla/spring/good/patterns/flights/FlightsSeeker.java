package com.kodilla.spring.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsSeeker {

    private Set<Flight> flightsSet;

    public FlightsSeeker() {
        FlightsRetrievier flightsSetRetrievier = new FlightsRetrievier();
        this.flightsSet = flightsSetRetrievier.retrieve();
    }


    public Set<Flight> flightsTo(String arrivalCity) {
        Set<Flight> result = flightsSet.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<Flight> flightsFrom(String departureCity) {
        Set<Flight> result = flightsSet.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<FlightConnect> connectingFlights(String departureCity, String arrivalCity) {
        Set<FlightConnect> result = new HashSet<>();
        for (Flight firstFlight : flightsFrom(departureCity)) {
            for (Flight secondFlight : flightsTo(arrivalCity)) {
                if (firstFlight.getArrivalCity().equals(secondFlight.getDepartureCity())) {
                    result.add(new FlightConnect(firstFlight, secondFlight));
                }
            }
        }
        return result;
    }
}
