package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarFactoryTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");


    @Test
    public void shouldReturnTrueIfIsNightNow() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);

        //When
        boolean lights = car.hasHeadlightsTurnedOn();

        //Then
        Assertions.assertTrue(lights);
    }

    @Test
    public void shouldReturnProperCar() {

        //Given
        CarFactory car = context.getBean(CarFactory.class);

        //When
        Car carSelect = car.rideACar();

        //Then
        Assertions.assertEquals("Sedan", carSelect.getCarType());
    }
}
