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
    private double decimalNumber;
    private double delta;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        positiveNumber = 5;
        zeroNumber = 0;
        negativeNumber = -2;
        decimalNumber = 1.5;
        delta = 0.1;
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
    void subtractNegativeNumber() {
        assertEquals(0, calculator.subtract(negativeNumber, negativeNumber));
    }

    @Test
    void multiplyPositiveNumber() {
        assertEquals(25, calculator.multiply(positiveNumber, positiveNumber));
    }

    @Test
    void multiplyNegativeNumber() {
        assertEquals(4, calculator.multiply(negativeNumber, negativeNumber));
    }

    @Test
    void dividePositiveNumber() {
        assertEquals(1, calculator.divide(positiveNumber, positiveNumber));
    }

    @Test
    void divideNegativeNumber() {
        assertEquals(1, calculator.divide(negativeNumber, negativeNumber));
    }

    @Test
    void divideZeroNumber() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(positiveNumber, zeroNumber);
        });
    }

    @Test
    void divideDecimalResult() {
        assertEquals(3.3, calculator.divide(positiveNumber, decimalNumber), delta);
    }

    @Test
    void powerPositiveExponent() {
        assertEquals(3125, calculator.power(positiveNumber, positiveNumber));
    }

    @Test
    void powerNegativeExponent() {
        assertEquals(0.04, calculator.power(positiveNumber, negativeNumber));
    }

    @Test
    void factorialPositiveNumber() {
        assertEquals(120, calculator.factorial(positiveNumber));
    }

    @Test
    void factorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
           calculator.factorial(negativeNumber);
        });
    }

    @Test
    void factorialZeroNumber() {
        assertEquals(1, calculator.factorial(zeroNumber));
    }
}