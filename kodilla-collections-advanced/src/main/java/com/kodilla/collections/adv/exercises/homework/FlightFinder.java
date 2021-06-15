package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> showFlightFrom(String departure) {

        List<Flight> departureList = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure))
                departureList.add(flight);
        }

        return departureList;
    }

    public List<Flight> showFlightTo(String arrival) {

        List<Flight> arrivalList = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                arrivalList.add(flight);
        }

        return arrivalList;
    }
}
