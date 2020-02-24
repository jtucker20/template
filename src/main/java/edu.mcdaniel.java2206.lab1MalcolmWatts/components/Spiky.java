package edu.mcdaniel.java2206.lab1MalcolmWatts.components;

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
     * This String variable will hold the number of spikes.
     */
    private int numberOfSpikes;



    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    public Spiky(){
        this(numberOfSpikes; 3);
    }

    public Spiky(int numberOfSpikes){
        this();
        this.numberOfSpikes = 3;


        this.log = LogManager.getLogger(this);
        log.debug("The number of spikes will be {}", this.numberOfSpikes);

    }
    //=============================================================================================
    // Major Methods
    //=============================================================================================

    String FORWARDSLASH = "\\";
    String BACKSLASH = "/";

    //=============================================================================================
    // Minor Methods(s)
    //=============================================================================================

    public String oneLineForward(int numSpaces, int numSpikes){
        String result = "";
        for(int i = 0; i < numSpaces; ++i){
            result = result + " ";
        }
        for(int i = 0; i < numSpikes; ++i){
            result = result + BACKSLASH;
        }
        for(int i = 0; i < numSpikes; ++i){
            result = result + FORWARDSLASH;
        }
        return result;

    }
    public String oneLineBackwards(int numSpaces, int numSpikes){
        String result = "";
        for(int i = 0; i < numSpaces; ++i){
            result = result + " ";
        }
        for(int i = 0; i < numSpikes; ++i){
            result = result + FORWARDSLASH;
        }
        for(int i = 0; i < numSpikes; ++i){
            result = result + BACKSLASH;
        }
        return result;

    }

    public String[] topSpike(){
        String[] topLines = new String[this.numberOfSpikes + 1];
        for(int i = 0; i <= this.numberOfSpikes; ++i){
            int numSpace = this.numberOfSpikes - i;
            topLines[i] = oneLineForward(numSpace, i);
        }
        return topLines;
    }

    public String[] bottomSpike(){
        String[] bottomLines = new String[this.numberOfSpikes];
        for(int i = 0; i < this.numberOfSpikes; ++i){
            int numSpace = this.numberOfSpikes - i;
            bottomLines[i] = oneLineForward(numSpace, i);
        }
        return bottomLines;
    }

    public void showSpikes(){
        String[] topSpikes = this.topSpike();
        String[] bottomSpikes = this.bottomSpike();
        for(int i = 0; i <= this.numberOfSpikes; ++i){
            System.out.println(topSpikes[i]);
        }
        for(int i = 0; i < this.numberOfSpikes; ++i){
            System.out.println(bottomSpikes[i]);
        }
    }

    public void showSpikes(int numberOfSpikes){
        for(int i = 0; i <= numberOfSpikes; ++i){
            System.out.println(this.oneLineForward(numSpaces; numberOfSpikes - i, numSpikes; i+1));
        }
        for(int i = 0; i <= numberOfSpikes; ++i){
            System.out.println(this.oneLineBackwards(i ,numSpikes; numberOfSpikes - i));
        }
    }

    //=============================================================================================
    // Getters and Setters
    //=============================================================================================

    public int getNumberOfSpikes() {
        return numberOfSpikes;
    }

    public void setNumberOfSpikes(int numberOfSpikes) {
        this.numberOfSpikes = numberOfSpikes;
    }
}
