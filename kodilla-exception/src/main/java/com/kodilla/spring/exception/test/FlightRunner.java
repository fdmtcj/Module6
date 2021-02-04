package com.kodilla.spring.exception.test;

public class FlightRunner {

    public static void main(String[] args) {

        Flight kijów = new Flight("Warszawa", "Kijów");
        FlightSeeker flightSeeker = new FlightSeeker();

        try {
            flightSeeker.findFlight(kijów);

        } catch (RouteNotFoundException e) {
            System.out.println("Can't find that flight, try another.");
        }
    }
}

