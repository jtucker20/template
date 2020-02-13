package edu.mcdaniel.java2206.Lab1_ChristopherMcDonald.components;

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
    private int numberOfSpikes;
    //===================
    // Public Assets
    //===================
    /**
     * These String variables stores our backslash and forwardslash characters for printing
     */
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
        this(3);
    }

    public Spiky(int numberOfSpikes) {
        this.numberOfSpikes = numberOfSpikes;
        this.log = LogManager.getLogger(this);

        log.debug("The number of spikes will be {}", this.numberOfSpikes);
    }

    //=============================================================================================
    // Major Methods
    //=============================================================================================

    public String oneLineBackward(int numSpaces, int numSpikes) {
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

    public String oneLineForward(int numSpaces, int numSpikes) {
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

    public String[] topSpikes() {
        int num = this.numberOfSpikes;
        String[] topLines = new String[num];
        for (int i = 1; i < num; i++) {
            topLines[i] = this.oneLineBackward(num - i, i);
        }
        return topLines;
    }

    public String[] bottomSpikes() {
        int num = this.numberOfSpikes;
        String[] bottomLines = new String[num];
        for (int i = num; i > 0; i--) {
            bottomLines[i - 1] = this.oneLineForward(num - i, i);
        }
        return bottomLines;
    }

    public void showSpikes() {
        String[] topSpikes = this.topSpikes();
        String[] bottomSpikes = this.bottomSpikes();
        for (int i = 0; i < this.numberOfSpikes; i++) {
            System.out.println(topSpikes[i]);
        }
        for (int i = this.numberOfSpikes; i > 0; i--) {
            System.out.println(bottomSpikes[i - 1]);
        }
    }
    public void showNSpikes(int num){
        String[] topSpikes = this.topSpikes();
        String[] bottomSpikes = this.bottomSpikes();
        for (int i = 0; i < num; i++) {
            System.out.println(topSpikes[i]);
        }
        for (int i = num; i > 0; i--) {
            System.out.println(bottomSpikes[i - 1]);
        }
    }


    //=============================================================================================
    // Minor Methods(s)
    //=============================================================================================


    //=============================================================================================
    // Getters and Setters
    //=============================================================================================
    public void setNumberOfSpikes(int number){
        numberOfSpikes = number;
    }

}