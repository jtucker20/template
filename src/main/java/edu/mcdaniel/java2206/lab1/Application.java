package edu.mcdaniel.java2206.lab1;

import edu.mcdaniel.java2206.lab1.components.Spiky;
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
    public Application(){
        //This constructor is empty as no additional information need be provided.
        //This is an implemented No Argument Constructor.
    }


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
        Spiky spiky = new Spiky();


        //TODO: CALL YOUR APPLICATION'S PRIMARY CLASS METHODS

       // String[] topSpikes = spiky.topSpikes();
        //String[] bottomSpikes = spiky.bottomSpikes;

        System.out.println("  \\/  ");
        System.out.println(" \\\\//");
        System.out.println("\\\\\\///");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\ ");
        System.out.println("  /\\  ");






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
