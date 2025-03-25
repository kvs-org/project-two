package com.kvs.subtraction.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionServiceTest {

    private final SubtractionService subtractionService = new SubtractionService();

    @Test
    void testSubtract() {
        int result = subtractionService.subtract(10, 5);
        assertEquals(5, result, "10 - 5 should equal 5");

        result = subtractionService.subtract(0, 5);
        assertEquals(-5, result, "0 - 5 should equal -5");

        result = subtractionService.subtract(5, 10);
        assertEquals(-5, result, "5 - 10 should equal -5");
    }
}