package edu.mcdaniel.java2206.template.replacewithprojectname.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class is a simple structure to allow you to do your work during the semester.
 * That is, if you want to do an assignment, copy this code, make a new class with the
 * name of your class, paste this code in there and change the class and constructor
 * names to your class, add a reference to your new class and it's major functions in
 * the Application class and then do your coding here.
 */
public class Spiky {

    //=============================================================================================
    // Private Assets
    //=============================================================================================

    /**
     * This provides access to logging.
     */
    private final Logger log;

    /**
     * This String variable will hold the greeting.
     */
    private int numberOfSpikes;
    public static final String BACKSLASH = "\\";
    public static final String FORWARDSLASH = "/";

    // private String greeting;

    /**
     * This String variable will hold the name of the audience.
     */
    // private String audience;


    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    /**
     * This No Argument constructor is designed to initialize the greeting to the standard
     * "Hello World."
     */
    public Spiky() {
        //this(numberOfSpikes 3);
        this.numberOfSpikes = 3;

        this.log = LogManager.getLogger(this);

        log.debug("The output message is {} {}!", this.numberOfSpikes);
    }


    //=============================================================================================
    // Major Methods
    //=============================================================================================

    public Spiky(int numberOfSpikes) {
        this();
        this.numberOfSpikes = numberOfSpikes;

        log.debug("The numner of spikes will be {}", this.numberOfSpikes);
    }


    //=============================================================================================
    // Minor Methods(s)
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

    public String oneLineBACKWARD(int numSpaces, int numSpikes) {
        String result = "";
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

    public int getNumberOfSpikes() {
        return numberOfSpikes;
    }

    public void setNumberOfSpikes(int numberOfSpikes) {
        this.numberOfSpikes = numberOfSpikes;
    }

    public String[] topSpikes() {
        String[] topLines = new String[this.numberOfSpikes];
        for (int i = 0; i < this.numberOfSpikes; i++) {
            int numSpace = this.numberOfSpikes - i;
            topLines[i] = oneLineForward(numSpace, i);
        }
        return topLines;
    }
    public String[] bottomSpike() {
            String[] bottomLines = new String[this.numberOfSpikes];
            for(int i = 0; i < this.numberOfSpikes; i++) {
                int numSpike= this.numberOfSpikes - i;
                bottomLines[i] = oneLineBACKWARD(i, numSpike);
            }
            return bottomLines;
        }

        //public String getMessage(){
        // return getGreeting() + " " + getAudience() + "!";


        //=============================================================================================
        // Getters and Setters
        //=============================================================================================

}