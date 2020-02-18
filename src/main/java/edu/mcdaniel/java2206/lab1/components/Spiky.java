package edu.mcdaniel.java2206.lab1.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Spiky {



    private final Logger log;


    private int numberOfSpikes;
    public static final String BACKSLASH = "\\";
    public static final String FORWARDSLASH = "/";



    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    /**
     * This No Argument constructor is designed to initialize the greeting to the standard
     * "Hello World."
     */
    public Spiky() {
        this.numberOfSpikes = 3;
        this.log = LogManager.getLogger(this);

        log.debug("The number of spikes will be{}", this.numberOfSpikes);
    }


    public Spiky(int numberOfSpikes) {
        this.numberOfSpikes = numberOfSpikes;
        this.log = LogManager.getLogger(this);

        log.debug("The number of spikes will be {}, ", this.numberOfSpikes);
    }


    //=============================================================================================
    // Major Methods
    //=============================================================================================


    public String oneLineForward(int numSpaces, int numSpikes) {
        String result = "";
        for (int i = 0; i < numSpaces; i++) {
            result = result + " ";

        }
        for (int i = 0; i < numSpikes; i++) {
            result = result + BACKSLASH;
        }
        for (int i = 0; i < numSpikes; i++) {
            result = result + FORWARDSLASH;
        }
        return result;

    }

    public String oneLineBackwards(int numSpaces, int numSpikes) {
        String result = " ";
        for (int i = 0; i < numSpaces; i++) {
            result = result + " ";
        }
        for (int i = 0; i < numSpikes; i++) {
            result = result + FORWARDSLASH;
        }
        for (int i = 0; i < numSpikes; i++) {
            result = result + BACKSLASH;

        }
        return result;


    }
}

     //=============================================================================================
    // Getters and Setters
    //=============================================================================================


