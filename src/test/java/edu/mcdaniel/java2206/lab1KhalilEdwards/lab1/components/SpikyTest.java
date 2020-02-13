package edu.mcdaniel.java2206.lab1KhalilEdwards.lab1.components;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpikyTest {

    private Spiky spikyClass;

    @BeforeEach
    void setUp() {

        spikyClass = new Spiky();

    }

    @Test
    void getMessage() {

        // Arrange
        String expected = "Hello World!";

        // Act
        String actual = spikyClass.getMessage();

        // Assert
        assertEquals(expected, actual);
    }
}