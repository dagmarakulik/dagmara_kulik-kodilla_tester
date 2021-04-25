package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMI_TestSource#provideCorrectDataToCheckBMI")
    public void shouldReturnCorrectString(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}