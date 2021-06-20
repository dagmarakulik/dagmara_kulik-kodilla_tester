package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;

import java.time.LocalTime;
import java.util.Date;

public interface Car {

    @Bean
    boolean hasHeadlightsTurnedOn();
    @Bean
    String getCarType();

}
