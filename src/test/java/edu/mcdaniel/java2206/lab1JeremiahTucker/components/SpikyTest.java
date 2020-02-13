package edu.mcdaniel.java2206.lab1JeremiahTucker.components;

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
    void testSpaceFunctionality() {

        // Arrange
        String expected = "   ";

        // Act
        String actual = spikyClass.oneLineForward(3,0);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testSpaceFunctionality2sp1spk() {

        // Arrange
        String expected = "  \\/";

        // Act
        String actual = spikyClass.oneLineForward(2,1);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testSpaceFunctionality1sp2spk() {

        // Arrange
        String expected = " \\\\//";

        // Act
        String actual = spikyClass.oneLineForward(1,2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testSpaceFunctionality0sp3spk() {

        // Arrange
        String expected = "\\\\\\///";

        // Act
        String actual = spikyClass.oneLineForward(0,3);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void oneLineBackwards() {
    }

    @Test
    void topSpike() {

        //Arrange
        String[] expected = new String[3];
        expected[0] = "  \\/";
        expected[1] = " \\\\//";
        expected[2] = "\\\\\\///";

        // Act
        String[] actual = this.spikyClass.topSpike();

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void bottomSpike() {
    }
}