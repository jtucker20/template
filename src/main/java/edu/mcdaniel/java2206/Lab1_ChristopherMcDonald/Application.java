package edu.mcdaniel.java2206.Lab1_ChristopherMcDonald;

import edu.mcdaniel.java2206.Lab1_ChristopherMcDonald.components.Spiky;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is designed to start/wrap your class.
 */
@SpringBootApplication
public class Application {

    //=============================================================================================
    // Private Assets
    //=============================================================================================

    /**
     * The logging mechanism of the class.
     */
    private Logger log;


    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    /**
     * The constructor for the Spring Boot application
     */


    //=============================================================================================
    // Major Methods
    //=============================================================================================

    //No major methods to implement


    //=============================================================================================
    // PSVM
    //=============================================================================================

    /**
     * This method actually accomplishes the running of the code we are seeking to write
     * @param args the input from the command line.
     */
    public static void main(String[] args) {

        //===// Spring Application Hook //=======================================================//
        SpringApplication.run(Application.class, args);

        //===// User Defined Behavior //=========================================================//
        //TODO: INSTANTIATE YOUR APPLICATION'S PRIMARY CLASS
        Spiky spiky = new Spiky(10);

        String[] topSpikes = spiky.topSpikes();
        String[] bottomSpikes = spiky.bottomSpikes();

        spiky.showSpikes();
        spiky.set


        //TODO: CALL YOUR APPLICATION'S PRIMARY CLASS METHODS
        System.out.println("  \\/\n \\\\//\n\\\\\\///\n///\\\\\\\n //\\\\\n  /\\");

        System.out.println(" CCC  H  H  RRR   III  SSS\n" +
                           "C     H  H  R  R   I   S  \n" +
                           "C     HHHH  RRR    I   SSS\n" +
                           "C     H  H  R R    I     S\n" +
                           " CCC  H  H  R  R  III  SSS\n");


    }


    //=============================================================================================
    // Minor Methods(s)
    //=============================================================================================

    //No minor methods made for this class


    //=============================================================================================
    // Getters and Setters
    //=============================================================================================

    //No private assets we want to expose in this class

}
