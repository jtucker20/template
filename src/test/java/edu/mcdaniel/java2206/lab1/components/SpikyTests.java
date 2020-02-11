package edu.mcdaniel.java2206.lab1.components;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpikyTests {

    private Spiky exampleClass;

    @BeforeEach
    void setUp() {

        exampleClass = new Spiky();

    }

    @Test
    void getMessage() {

        // Arrange
        String expected = "Hello World!";

        // Act
        String actual = exampleClass.getMessage();

        // Assert
        assertEquals(expected, actual);
    }
}