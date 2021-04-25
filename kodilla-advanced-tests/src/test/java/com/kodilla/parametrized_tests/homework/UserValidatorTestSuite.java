package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Kowalski", "kowalski", "kow", "Ka.", "ka-", "kow_", "kowalski1"})
    public void shouldReturnTrue(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(userValidator.isBlank(text));
    }
    @ParameterizedTest
    @CsvSource(value = {"ko", "kow;", "/kow", "k1", "@#$KOw"})
    public void shouldReturnFalse(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"anna.kowalska@wp.pl", "ka7@wp.pl", "MI923@wp.com.pl", "_A_w1.w1@o2.pl"})
    public void shouldReturnTrue1(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"ko/@wp.pl", "kowalskI9@wppl", "kowalski", "@#$@wp.pl", "kowalski.pl"})
    public void shouldReturnFalse1(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {" "})
    public void shouldReturnFalseIfStringIsEmpty(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}
