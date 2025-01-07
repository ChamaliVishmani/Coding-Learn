package com.chamalidev.javaunittestingJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    // for JUnit5 - test method doesn't need to be public and no return is needed
    @Test
    void twoPlusTwoShouldEqualFour(){
    // method name - describe what exactly is tested

        var calculator = new SimpleCalculator();
        // Java 10+ local variable type inference - java infers calculator is of type SimpleCalculator

        assertEquals(4, calculator.add(2,2));

        // ---- Other assertions ----
        //        assertNotEquals(, );
        //        assertTrue();
        //        assertFalse();
        //        assertNull();
        //        assertNotNull();
    }

    // multiple tests for single method should be made
    @Test
    void threePlusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3,7));
    }
}
