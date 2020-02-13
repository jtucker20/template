package edu.mcdaniel.java2206.lab1_Andre;

import edu.mcdaniel.java2206.lab1_Andre.components.Spiky;
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

        //This constructor is empty as no additional information need be provided.
        //This is an implemented No Argument Constructor.



    //=============================================================================================
    // Major Methods
    //=============================================================================================

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

        //TODO: CALL YOUR APPLICATION'S PRIMARY CLASS METHODS


        System.out.println("  \\/");
        System.out.println(" \\\\//");
        System.out.println("\\\\\\///");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\");
        System.out.println("  /\\");

        System.out.println(" "); //Space between outputs

        System.out.println("      A         N           N   D D        RRRRRRR    EEEEEEEEEE    ");
        System.out.println("   A     A      NN          N   D    D     R      R   E             ");
        System.out.println(" A         A    N N         N   D     D    R       R  E             ");
        System.out.println("A           A   N  N        N   D      D   R       R  E             ");
        System.out.println("A           A   N   N       N   D      D   R       R  E             ");
        System.out.println("A           A   N    N      N   D      D   R      R   E             ");
        System.out.println("AAAAAAAAAAAAA   N     N     N   D      D   RRRRRRR    EEEEEEEEEE    ");
        System.out.println("A           A   N      N    N   D      D   R      R   E             ");
        System.out.println("A           A   N       N   N   D      D   R       R  E             ");
        System.out.println("A           A   N        N  N   D      D   R       R  E             ");
        System.out.println("A           A   N         N N   D     D    R       R  E             ");
        System.out.println("A           A   N          NN   D    D     R       R  E             ");
        System.out.println("A           A   N           N   D D        R       R  EEEEEEEEEE    ");

        Spiky spiky = new Spiky();

        spiky.setNumberOfSpikes(10);

        spiky.showSpikes(10);

        spiky.setNumberOfSpikes(0);




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
