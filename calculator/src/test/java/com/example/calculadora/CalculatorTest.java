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
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        positiveNumber = 5;
        zeroNumber = 0;
        negativeNumber = -2;
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teste finalizado!");
    }

    @Test
    void sumPositive() {
        assertEquals(10, calculator.sum(positiveNumber, positiveNumber));
    }

    @Test
    void sumNegative() {
        assertEquals(-4, calculator.sum(negativeNumber, negativeNumber));
    }

    @Test
    void subtractPositive() {
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
}