package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void shouldShowFlightFromIfThereIsFlightInTable() {
        //given
        FlightFinder find = new FlightFinder();

        //when
        List<Flight> flightList = find.showFlightFrom("Madrid");

        //then
        List<Flight> expectedFlight = new ArrayList<>();

        expectedFlight.add(new Flight("Madrid", "Warsaw"));
        expectedFlight.add(new Flight("Madrid", "Moscow"));
        expectedFlight.add(new Flight("Madrid", "Sydney"));
        assertEquals(expectedFlight, flightList);
    }

    @Test
    public void shouldShowFlightToIfThereIsFlightInTable() {
        //given
        FlightFinder find = new FlightFinder();

        //when
        List<Flight> flightList = find.showFlightTo("Sydney");

        //then
        List<Flight> expectedFlight = new ArrayList<>();

        expectedFlight.add(new Flight("New York", "Sydney"));
        expectedFlight.add(new Flight("Madrid", "Sydney"));
        assertEquals(expectedFlight, flightList);
    }

    @Test
    public void testDepartureIfEmptyRequest() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> flightList = find.showFlightFrom(" ");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        assertEquals(expectedFlight, flightList);
    }

    @Test
    public void shouldFindDestinationIfThereIsNotOnList() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> flightList = find.showFlightTo("Lodz");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        assertEquals(expectedFlight, flightList);
    }

    @Test
    public void shouldFindDepartureIfThereIsNotOnList() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> flightList = find.showFlightFrom("Lodz");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        assertEquals(expectedFlight, flightList);
    }
}
