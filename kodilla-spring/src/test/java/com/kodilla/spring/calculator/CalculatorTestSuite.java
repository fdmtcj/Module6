package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class CalculatorTestSuite {

    @Test
    void shouldAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result = calculator.add(2.3, 5.9);
        Double result1 = calculator.add(-2.1, 3.1);

        //Then
        assertEquals(8.2, result, 0.1);
        assertEquals(1, result1, 0.1);
    }

    @Test
    void shouldSub() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result= calculator.sub(9.5, 2.1);

        //Then
        assertEquals(7.4, result,0.1 );
    }

    @Test
    void shouldMul() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result= calculator.mul(5.4, 5.5);

        //Then
        assertEquals(29.7, result,0.1 );
    }

    @Test
    void shouldDiv() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result= calculator.div(12.3, 6.7);

        //Then
        assertEquals(1.8, result,0.1 );
    }
}
