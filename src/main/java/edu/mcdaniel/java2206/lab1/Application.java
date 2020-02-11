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
        Spiky exampleWithStandardGreeting = new Spiky();

        Spiky exampleWithCustomGreeting = new Spiky();

        //TODO: CALL YOUR APPLICATION'S PRIMARY CLASS METHODS
        /*//==========================================================================================================//
        * Step One of the Lab
        *///==========================================================================================================//

        System.out.println("  \\/  ");
        System.out.println(" \\\\// ");
        System.out.println("\\\\\\///");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\");
        System.out.println("  /\\  ");

        /*//==========================================================================================================//
        * Step Two of the Lab, Example name "Misp"
        *///==========================================================================================================//

        System.out.println("M     M    IIIII     SSSSS     PPPPPP");
        System.out.println("MM   MM      I      S     S    P     P");
        System.out.println("M M M M      I      S          P     P");
        System.out.println("M  M  M      I       SSSS      PPPPPP");
        System.out.println("M     M      I            S    P");
        System.out.println("M     M      I            S    P");
        System.out.println("M     M    IIIII     SSSSS     P");

        System.out.println(" CCCCC     OOOO     L       L     IIIII     NN     N");
        System.out.println("C     C   O    O    L       L       I       N N    N");
        System.out.println("C         O    O    L       L       I       N  N   N");
        System.out.println("C         O    O    L       L       I       N   N  N");
        System.out.println("C     C   O    O    L       L       I       N    N N");
        System.out.println(" CCCCC     OOOO     LLLLL  LLLLL  IIIII     N     NN");

        System.out.println(exampleWithStandardGreeting.getMessage());

        System.out.println(exampleWithCustomGreeting.getMessage());

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
