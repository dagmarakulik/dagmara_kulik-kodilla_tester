package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flight = new ArrayList<>();

        flight.add(new Flight("Warsaw","Madrid"));
        flight.add(new Flight("London","Tokyo"));
        flight.add(new Flight("New York","Sydney"));
        flight.add(new Flight("Mexico","Rome"));
        flight.add(new Flight("Paris", "Miami"));
        flight.add(new Flight("Madrid","Warsaw"));
        flight.add(new Flight("Madrid","Moscow"));
        flight.add(new Flight("Madrid", "Sydney"));

        return flight;
    }
}
