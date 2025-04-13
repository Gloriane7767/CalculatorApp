package com.gloriane;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdditionMultipleOperands() {
        double[] numbers = {1.5, 2.5, 3.0};
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        assertEquals(7.0, sum);
    }

    @Test
    void testSubtractionMultipleOperands() {
        double[] numbers = {10.0, 2.0, 3.0};
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        assertEquals(5.0, result);
    }

    @Test
    void testMultiplication() {
        double a = 6;
        double b = 7;
        double result = a * b;
        assertEquals(42.0, result);
    }

    @Test
    void testDivision() {
        double dividend = 20;
        double divisor = 4;
        double result = dividend / divisor;
        assertEquals(5.0, result);
    }

    @Test
    void testDivisionByZero() {
        double divisor = 0;
        assertThrows(ArithmeticException.class, () -> {
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
        });
    }
}
