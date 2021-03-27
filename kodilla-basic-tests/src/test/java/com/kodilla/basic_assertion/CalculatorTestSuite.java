package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractionResult = calculator.subtract(a, b);
        assertEquals(-3, subtractionResult);
    }
    @Test
    public void testPowLessThanZero() {
        Calculator calculator = new Calculator();
        int a = -2;
        int powResult = calculator.pow(a);
        assertEquals(4, powResult);
    }
    @Test
    public void testPowEqualToZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int powResult = calculator.pow(a);
        assertEquals(0, powResult);
    }
    @Test
    public void testPowGreaterThanZero() {
        Calculator calculator = new Calculator();
        int a = 5;
        int powResult = calculator.pow(a);
        assertEquals(25, powResult);
    }
}
