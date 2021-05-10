package com.kodilla.spring.basic.spring_scopes;

import com.kodilla.spring.basic.spring_scopes.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTime() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //when
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);

        //then
        Assertions.assertNotEquals(firstBean.getCurrentTime(), secondBean.getCurrentTime());
    }
}
