package com.kvs.subtraction.controller;

import com.kvs.subtraction.service.SubtractionService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class SubtractionControllerTest {

    @Mock
    private SubtractionService subtractionService;

    @InjectMocks
    private SubtractionController subtractionController;

    public SubtractionControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSubtract() {
        // Arrange
        int a = 10;
        int b = 5;
        int expected = 5;
        when(subtractionService.subtract(a, b)).thenReturn(expected);

        // Act
        ResponseEntity<Integer> response = subtractionController.subtract(a, b);

        // Assert
        assertEquals(expected, response.getBody());
        assertEquals(200, response.getStatusCodeValue());
    }
}