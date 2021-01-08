package com.kodilla.good.patterns.flights;

public class Main {

    public static void main(String[] args) {

        FlightsSeeker flightsFinder = new FlightsSeeker();

        System.out.println("Flights to Gdańsk:");
        for (Flight flight: flightsFinder.flightsTo("Gdańsk")) {
            System.out.println(flight);
        }

        System.out.println("\nFlights from Wrocław:");
        for (Flight flight: flightsFinder.flightsFrom("")) {
            System.out.println(flight);
        }

        System.out.println("\n Connecting flights from Warszawa to Kraków:");
        for (FlightsSeeker flightConnect: flightsFinder.connectingFlights("Warszawa", "Kraków"))

            System.out.println(flightConnect);
    }
}
