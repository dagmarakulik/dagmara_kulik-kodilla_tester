package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    public void shouldReturnCorrectResultOfAddition() {
        // when
        double sum = calculator.add(23.5, 34.6);

        //then
        assertEquals(58.1, sum);
    }

    @Test
    public void shouldReturnCorrectResultOfSubtraction() {
        // when
        double difference = calculator.subtract(30.5, 18.8);

        //then
        assertEquals(11.7, difference);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplication() {
        // when
        double product = calculator.subtract(5.5, 18.8);

        //then
        assertEquals(103.4, product);
    }

    @Test
    public void shouldReturnCorrectResultOfDivision() {
        // when
        double quotient = calculator.divide(30.5, 18.8);

        //then
        assertEquals(1.622, quotient, 0.001);
    }
}
