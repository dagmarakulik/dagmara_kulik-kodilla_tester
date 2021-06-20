package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.util.Date;

public class Sedan implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();

        return time.isAfter(LocalTime.of(20,0)) || time.isBefore(LocalTime.of(6,0));
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
