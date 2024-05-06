
package Lab8_Fraction;

import java.util.Scanner;


public class FractionTest {
    public static void main(String[] args) {
        
  
    
 Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the numerator of the first fraction:");
        int numerator1 = scanner.nextInt();
        System.out.println("Enter the denominator of the first fraction:");
        int denominator1 = scanner.nextInt();
        
        System.out.println("Enter the numerator of the second fraction:");
        int numerator2 = scanner.nextInt();
        System.out.println("Enter the denominator of the second fraction:");
        int denominator2 = scanner.nextInt();
        
        Fraction fraction1 = new Fraction(numerator1, denominator1);
        Fraction fraction2 = new Fraction(numerator2, denominator2);
        
        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction quotient = fraction1.divide(fraction2);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
