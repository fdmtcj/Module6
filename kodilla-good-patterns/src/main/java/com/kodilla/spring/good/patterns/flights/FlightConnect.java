package com.kodilla.spring.good.patterns.flights;

public class FlightConnect {

    private Flight firstFlight;
    private Flight secondFlight;

    public FlightConnect(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    @Override
    public String toString() {
        return "ConnectingFlight:" +
                "first flight - " + firstFlight.toString() +
                "secondFlight - " + secondFlight.toString() +
                "";
    }
}
