package edu.mcdaniel.java2206.lab1MalcolmWatts.components;

import edu.mcdaniel.java2206.lab1MalcolmWatts.components.Spiky;
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
    void testSpaceFunctionalityspk1spk2() {

        // Arrange
        String expected = "\\/";

        // Act
        String actual = exampleClass.oneLineForward( 1,  2);

        // Assert
        assertEquals(expected, actual);
    }
}