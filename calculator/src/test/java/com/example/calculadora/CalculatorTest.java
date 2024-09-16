package com.example.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    private int positiveNumber;
    private int zeroNumber;
    private int negativeNumber;
    private double delta;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        positiveNumber = 5;
        zeroNumber = 0;
        negativeNumber = -2;
        delta = 0.01;
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teste finalizado!");
    }

    @Test
    void sumPositiveNumber() {
        assertEquals(10, calculator.sum(positiveNumber, positiveNumber));
    }

    @Test
    void sumNegativeNumber() {
        assertEquals(-4, calculator.sum(negativeNumber, negativeNumber));
    }

    @Test
    void subtractPositiveNumber() {
        assertEquals(0, calculator.subtract(positiveNumber, positiveNumber));
    }

    @Test
    void multiply() {
    }

    @Test
    void divideZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(positiveNumber, zeroNumber);
        });
    }

    @Test
    void powerNegativeNumber() {
        assertEquals(0.04, calculator.power(positiveNumber, negativeNumber));
    }
}