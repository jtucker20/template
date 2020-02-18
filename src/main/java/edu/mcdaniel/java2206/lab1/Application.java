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

        //TODO: CALL YOUR APPLICATION'S PRIMARY CLASS METHODS

        System.out.println("  \\/  ");
        System.out.println(" \\\\// ");
        System.out.println("\\\\\\///");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\ ");
        System.out.println("  /\\  ");

        Spiky spiky = new Spiky();

        spiky.setNumberOfSpikes(10);

        spiky.showSpikes();

        spiky.setNumberOfSpikes(0);

        spiky.showSpikes();

        spiky.showSpikes(10);

        System.out.println("       A        B B B    B B B    Y       Y");
        System.out.println("      A A       B     B  B     B   Y     Y");
        System.out.println("     A   A      B    B   B    B     Y   Y");
        System.out.println("    AAAAAAA     B B B    B B B       YYY");
        System.out.println("   A       A    B    B   B    B       Y");
        System.out.println("  A         A   B     B  B     B      Y");
        System.out.println(" A           A  B B B    B B B        Y");

    }
}
