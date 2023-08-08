package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    // you can generate a JUnit test by hitting Cmd + Shift + T

    // JUnit tests should be void by default
    // void because test class doesn't return anything
    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();  // you can use var instead of 'SimpleCalculator' at the front
        assertEquals(4, calculator.add(2, 2));

    }

    @Test
    void threePlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));
    }

    // running with coverage tells you how much of the classes execution lines you're hitting.
    // e.g., my SimpleCalculator class has 2 execution lines (lines that are run by the program). Shows 2/2
    // if we navigate to the class, in the gutter it will show you whether the test has hit the line or not


    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        var calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculator.determineLetterGrade(0);
                });
    }
}