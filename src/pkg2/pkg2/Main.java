/*
 * Exercise 2.2 from the Liang Java Textbook 8E
 * Comprehensive Version
 */

package pkg2.pkg2;

/**
 *
 * @author Clint Sharp
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14159265359;
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radiusInput = consoleInput.nextDouble();
        double lengthInput = consoleInput.nextDouble();
        double areaOutput = radiusInput * radiusInput * PI;
        double volumeOutput = areaOutput * lengthInput;
        System.out.println("The area of the volume is " + areaOutput);
        System.out.println("The volume is " + volumeOutput);
    }
    
}
