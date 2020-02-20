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
        expected[2] = "///\\\\\\";
        expected[1] = " //\\\\";
        expected[0] = "  /\\";

        // Act
        String[] actual = this.spikyClass.bottomSpike();

        // Assert
        assertArrayEquals(expected, actual);
    }
}
//    @Test
//    void testSpaceFunctionality1sp2spk() {

//        // Arrange
//        String expected = "Hello World!";
//
//        // Act
//        String actual = exampleClass.getMessage();
//
//        // Assert
//        assertEquals(expected, actual);
