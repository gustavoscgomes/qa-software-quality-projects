package com.example.calculadora;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public double power(double base, int exponent) {
        double result = 1;

        if (exponent == 0) {
            return 1;
        }

        boolean isNegative = exponent < 0;
        if (isNegative) {
            exponent = -exponent;
        }

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return isNegative ? 1 / result : result;
    }

    public int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

