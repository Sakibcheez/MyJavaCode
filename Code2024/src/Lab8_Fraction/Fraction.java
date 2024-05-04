
package Lab8_Fraction;

public class Fraction {
    
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new IllegalArgumentException("Denominator cannot be zero.");
    }

    // Getters and setters

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new IllegalArgumentException("Denominator cannot be zero.");
    }

    // Arithmetic operations

    public void add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getDenominator() +
                fraction.getNumerator() * this.denominator;
        int newDenominator = this.denominator * fraction.getDenominator();
        simplifyAndSet(newNumerator, newDenominator);
    }

    public void sub(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getDenominator() -
                (fraction.getNumerator() * this.denominator); 
        int newDenominator = this.denominator * fraction.getDenominator();
        simplifyAndSet(newNumerator, newDenominator);
    }

    public void multiplication(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getNumerator();
        int newDenominator = this.denominator * fraction.getDenominator();
        simplifyAndSet(newNumerator, newDenominator);
    }

    public void division(Fraction fraction) {
        if (fraction.getNumerator() != 0) {
            int newNumerator = this.numerator * fraction.getDenominator();
            int newDenominator = this.denominator * fraction.getNumerator();
            simplifyAndSet(newNumerator, newDenominator);
        } else {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
    }
/*
    private void simplifyAndSet(int newNumerator, int newDenominator) {
        int gcd = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
        this.numerator = newNumerator / gcd;
        this.denominator = newDenominator / gcd;
    }
*/  
    
   private void simplifyAndSet(int newNumerator, int newDenominator) {
    if (newDenominator < 0) {
        newNumerator = -newNumerator;
        newDenominator = -newDenominator;
    }
    int gcd = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
    this.numerator = newNumerator / gcd;
    this.denominator = newDenominator / gcd;
}


  private int gcd(int a, int b) {
    int gcd = 1; // Initialize gcd to 1

    for (int i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i; // Update gcd if i is a common divisor
        }
    }

    return gcd;
}
    
    /* 
     while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    */

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    // Display information about fractions
    public static void displayInfo(Fraction f1, Fraction f2) {
        // Performing arithmetic operations
        System.out.println("Initial fractions:");
        System.out.println("Fraction 1: " + f1.toString());
        System.out.println("Fraction 2: " + f2.toString());

        // Adding fractions
        f1.add(f2);
        System.out.println("\nAfter adding fraction 2 to fraction 1:");
        System.out.println("Fraction 1: " + f1.toString());

        // Subtracting fractions
        f1.sub(f2);
        System.out.println("\nAfter subtracting fraction 2 from fraction 1:");
        System.out.println("Fraction 1: " + f1.toString());

        // Multiplying fractions
        f1.multiplication(f2);
        System.out.println("\nAfter multiplying fraction 1 by fraction 2:");
        System.out.println("Fraction 1: " + f1.toString());

        // Dividing fractions
        try {
            f1.division(f2);
            System.out.println("\nAfter dividing fraction 1 by fraction 2:");
            System.out.println("Fraction 1: " + f1.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}