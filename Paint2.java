import java.util.Scanner;
import java.lang.Math;

/**
 * Program calculates the amount of paint, in gallons from user's input, to cover a wall.
 * @author Lindsey Langston
 * @version 1.0
 * @since 10/20/2024
 * Professor: Hosam Badreldin
 * Course: Foundation in Software Development (IT 145)
 *  
 *  */

public class Paint2 {
	
	/**
	 * Inputs wall height & width from user.
	 * Calculates wall area and corresponding amount of paint needed to cover it.
	 * @param args Command line 
	 *  */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in); 
        double wallHeight = 0.0; //Initiliazing variables: wall height
        double wallWidth = 0.0; // wall width
        double wallArea = 0.0; // wall area
        double gallonsPaintNeeded = 0.0; // paint needed in gallons
        double cansNeeded; // cans of paint needed

        final double squareFeetPerGallons = 350.0; // measurement
        final double gallonsPerCan = 1.0; // measurement

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  “ + wallArea + “ square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        
        /** 
         * Chosen method is the Math.ceil method from Java's Math module.
         * Used to round the chosen double, up to the nearest integer.
         * */
        
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
    }
}
