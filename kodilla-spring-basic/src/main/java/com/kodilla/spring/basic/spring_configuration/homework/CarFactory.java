package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Configuration
public class CarFactory {

    @Bean
    public String getSeason() {
        int month = LocalDateTime.now().getMonthValue();
        if (month <= 2 || month == 12) {
            return "winter";
        } else if (month <= 5) {
            return  "spring";
        } else if (month <= 8) {
            return "summer";
        } else {
            return "autumn";
        }
    }

    @Bean
    public String getTime() {
        int hour = LocalDateTime.now().getHour();
        if (hour < 20 && hour > 6) {
            return"day";
        } else {
            return "night";
        }
    }

    @Bean
    public Car rideACar() {
        String season = getSeason();
        getTime();
        Car car;
        if (season.equals("winter")) {
            car = new SUV();
        } else if (season.equals("summer")) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        boolean turnOnLights = car.hasHeadlightsTurnedOn();
        String lights;
        if (turnOnLights) {
            lights = " turn on the lights.";
        } else {
            lights = " You don't need to turn on the lights.";
        }
        System.out.println("It's " + season + " and you should drive " + car.getCarType() + lights);
        return car;
    }
}
