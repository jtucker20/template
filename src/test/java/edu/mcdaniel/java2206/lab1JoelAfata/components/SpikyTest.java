package edu.mcdaniel.java2206.lab1JoelAfata.components;

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

        //Arrange
        String[] expected = new String[3];
        expected[0] = "///\\\\\\";
        expected[1] = " //\\\\";
        expected[2] = "  /\\";

        // Act
        String[] actual = this.spikyClass.bottomSpike();

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
 void testSpaceFunctionality1spikes4() {

        // Arrange
        String expected = " \\\\\\\\////";

        // Act
        String actual = spikyClass.oneLineForward(1,4);

        // Assert
        assertEquals(expected, actual);
        }
    @Test
    void testSpaceFunctionality4spikes8() {

        // Arrange
        String expected = "    ////////\\\\\\\\\\\\\\\\";

        // Act
        String actual = spikyClass.oneLineBackwards(4,8);

        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void testSpaceFunctionality10spike10() {

        // Arrange
        String expected = "          \\\\\\\\\\\\\\\\\\\\//////////";

        // Act
        String actual = spikyClass.oneLineForward(10,10);

        // Assert
        assertEquals(expected, actual);
    }
}
