/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_Fraction;

/**
 *
 * @author SAKIB AHMED
 */
public class maindisplay {
    
   

        // Performing arithmetic operations
        System.out.println("Initial fractions:");
        System.out.println("Fraction 1: " + fraction1.toString());
        System.out.println("Fraction 2: " + fraction2.toString());

        // Adding fractions
        fraction1.add(fraction2);
        System.out.println("\nAfter adding fraction 2 to fraction 1:");
        System.out.println("Fraction 1: " + fraction1.toString());

        // Subtracting fractions
        fraction1.sub(fraction2);
        System.out.println("\nAfter subtracting fraction 2 from fraction 1:");
        System.out.println("Fraction 1: " + fraction1.toString());

        // Multiplying fractions
        fraction1.multiplication(fraction2);
        System.out.println("\nAfter multiplying fraction 1 by fraction 2:");
        System.out.println("Fraction 1: " + fraction1.toString());

        // Dividing fractions
        fraction1.division(fraction2);
        System.out.println("\nAfter dividing fraction 1 by fraction 2:");
        System.out.println("Fraction 1: " + fraction1.toString());
        
        
    
}
