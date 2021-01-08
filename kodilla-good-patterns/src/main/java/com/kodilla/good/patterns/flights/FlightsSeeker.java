package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsSeeker {

    private Set<Flight> flightsSet;

    public FlightsSeeker() {
        FlightsRetrievier flightsSetRetrievier = new FlightsRetrievier();
        this.flightsSet = flightsSetRetrievier.retrieve();
    }

    public FlightsSeeker(Flight firstFlight, Flight secondFlight) {

    }

    public Set<Flight> flightsTo(String arrivalCity) {
        Set<Flight> result  = flightsSet.stream()
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

    public Set<FlightsSeeker> connectingFlights(String departureCity, String arrivalCity) {
        Set<FlightsSeeker> result = new HashSet<>();
        for (Flight firstFlight: flightsFrom(departureCity)) {
            for (Flight secondFlight: flightsTo(arrivalCity)) {
                if (firstFlight.getArrivalCity().equals(secondFlight.getDepartureCity())) {
                    result.add(new FlightsSeeker(firstFlight, secondFlight));
                }
            }
        }
        return result;
    }
}
