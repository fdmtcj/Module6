package com.kodilla.spring.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRetrievier {

    public Set<Flight> retrieve() {

        Set<Flight> flightsSet = new HashSet<Flight>();

        flightsSet.add(new Flight("Warszawa", "Gdańsk", "2891"));
        flightsSet.add(new Flight("Gdańsk", "Kraków", "3087"));
        flightsSet.add(new Flight("Kraków", "Wrocław", "4592"));
        flightsSet.add(new Flight("Kraków", "Warszawa", "1223"));
        flightsSet.add(new Flight("Warszawa", "Krakow", "5321"));
        flightsSet.add(new Flight("Wrocław", "Katowice", "4457"));

        return flightsSet;
    }
}
