package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    ShippingCenter shippingCenter;

    @Test
    public void shouldReturnMessageIfWeightIsCorrect() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String a = "Package delivered to: New York";

        //when
        String actualResult = bean.sendPackage("New York", 23.8);

        //then
        Assertions.assertEquals(a, actualResult);
    }

    @Test
    public void shouldReturnMessageIfWeightIsIncorrect() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String a = "Package not delivered to: New York";

        //when
        String actualResult = bean.sendPackage("New York", 56.8);

        //then
        Assertions.assertEquals(a, actualResult);
    }
}
