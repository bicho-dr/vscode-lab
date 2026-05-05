package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalc() {
        Calculator c = new Calculator();
        double result = c.calc(10, 5);
        assertEquals(0.3, result, 0.0001);
    }
}