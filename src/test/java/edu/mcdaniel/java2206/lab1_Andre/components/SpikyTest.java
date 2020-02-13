package edu.mcdaniel.java2206.lab1_Andre.components;

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
    void bottomSpike() {

        // Arrange
        String expected = "   ";

        // Act
        String actual = "";

        // Assert
        assertEquals(expected, actual);
    }
}