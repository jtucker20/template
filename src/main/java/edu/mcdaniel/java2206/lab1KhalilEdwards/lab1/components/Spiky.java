package edu.mcdaniel.java2206.lab1KhalilEdwards.lab1.components;

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
    private int numOfSpikes;
    public static final String BACKSLASH = "\\";
    public static final String FORWARDSLASH = "/";

    /**
     * This String variable will hold the name of the audience.
     */



    //=============================================================================================
    // Constructor(s)
    //=============================================================================================


    public Spiky(){
        this.numOfSpikes = 3;


        this.log = LogManager.getLogger(this);

        log.debug("The number of spikes will be {}", this.numOfSpikes);
    }

    public Spiky(int numOfSpikes){
        this.numOfSpikes = numOfSpikes;
        this.log = LogManager.getLogger(this);

        log.debug("The number of spikes will be {}" , this.numOfSpikes);
    }

    //=============================================================================================
    // Major Methods
    //=============================================================================================


    public String oneLineForward(int numSpaces, int numSpikes){
        String result = "";
        for (int i =0; i < numSpaces; i++){
            result = result + " ";
        }
        for (int i = 0; i< numSpikes; i++){
            result = result + BACKSLASH;
        }
        for (int i = 0; i< numSpikes; i++){
            result = result + FORWARDSLASH;
        }

        return result;
    }

    public String oneLineBackwards(int numSpaces, int numSpikes){
        String result = "";
        for (int i =0; i<numSpaces; i++){
            result = result + " ";
        }
        for (int i = 0; i<numSpikes; i++){
            result = result + FORWARDSLASH;
        }
        for (int i = 0; i<numSpikes; i++){
            result = result + BACKSLASH;
        }
        return result;
    }








    //=============================================================================================
    // Minor Methods(s)
    //=============================================================================================

    /**
     * A method to get the message.
     * @return a string of the message.
     */
    public String[] topSpike(){
        String [] topLines = new String[this.numOfSpikes];
        for(int i =0; i<this.numOfSpikes;i++){
            int numSpace = this.numOfSpikes-i;
            topLines[i] = oneLineForward(numSpace-1,i+1);
        }
        return topLines;
    }

    public String[] bottomSpike(){
        String[] bottomLines = new String[this.numOfSpikes];
        for (int i = 0; i < this.numOfSpikes; i++) {
            int numSpace = this.numOfSpikes - i;
            bottomLines[i] = oneLineBackwards(numSpace, i);
        }
        return bottomLines;
    }

    public void showSpikes(){
        String [] topSpikes = this.topSpike();
        String[] bottomSpikes = this.bottomSpike();
        for (int i = 0; i<this.numOfSpikes; i++){
            System.out.println(topSpikes[i]);
        }
        for (int i = 0; i<this.numOfSpikes;i++){
            System.out.println(bottomSpikes[i]);
        }
    }


}






    //=============================================================================================
    // Getters and Setters
    //=============================================================================================




