package edu.mcdaniel.java2206.lab1JoelAfata.components.components;

import edu.mcdaniel.java2206.lab1JoelAfata.components.Spiky;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpikyTest {

    private Spiky exampleClass;

    @BeforeEach
    void setUp() {

        exampleClass = new Spiky();

    }

    @Test
    void testSpaceFunctionality1sp2spk() {

        // Arrange
        String expected = "Hello World!";

        // Act

        // Assert
        assertEquals(expected, null);
    }
}