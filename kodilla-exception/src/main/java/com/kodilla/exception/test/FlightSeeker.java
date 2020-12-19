package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warszawa", true);
        airports.put("Berlin", true);
        airports.put("Kijów", false);
        airports.put("Praga", true);
        airports.put("Bukareszt", false);
        airports.put("Budapeszt", true);

        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                if (entry.getValue()) {
                    System.out.println("Flight possible.");
                } else {
                    System.out.println("Flight impossible, find another airport.");
                }
                return;
            }
        }
        throw new RouteNotFoundException("Airport does not exist");
    }
}
