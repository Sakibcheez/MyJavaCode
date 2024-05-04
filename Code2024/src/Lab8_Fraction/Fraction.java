
package Lab8_Fraction;

public class Fraction {
    

  private int numerator;
  private int denominator;

  // Constructor
  public Fraction(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("Denominator cannot be zero.");
    }
    this.numerator = numerator;
    this.denominator = denominator;
    simplify(); // Simplify the fraction upon creation
  }

  // Getters
  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }


  // Arithmetic operations with simplification
  public void add(Fraction other) {
    int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
    int newDenominator = this.denominator * other.denominator;
    setFraction(newNumerator, newDenominator);
  }

  public void subtract(Fraction other) {
    int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
    int newDenominator = this.denominator * other.denominator;
    setFraction(newNumerator, newDenominator);
  }

  public void multiply(Fraction other) {
    int newNumerator = this.numerator * other.numerator;
    int newDenominator = this.denominator * other.denominator;
    setFraction(newNumerator, newDenominator);
  }

  public void divide(Fraction other) {
    if (other.numerator == 0) {
      throw new IllegalArgumentException("Cannot divide by zero.");
    }
    int newNumerator = this.numerator * other.denominator;
    int newDenominator = this.denominator * other.numerator;
    setFraction(newNumerator, newDenominator);
  }

  // Helper method to set fraction and simplify
  private void setFraction(int newNumerator, int newDenominator) {
    this.numerator = newNumerator;
    this.denominator = newDenominator;
    simplify();
  }

  // Greatest Common Divisor (GCD)
  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  // Simplify the fraction
  private void simplify() {
    int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
    if (gcd != 1) {
      numerator /= gcd;
      denominator /= gcd;
    }

    // Handle negative signs
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  // Override toString for better representation
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
        f1.subtract(f2);
        System.out.println("\nAfter subtracting fraction 2 from fraction 1:");
        System.out.println("Fraction 1: " + f1.toString());

        // Multiplying fractions
        f1.multiply(f2);
        System.out.println("\nAfter multiplying fraction 1 by fraction 2:");
        System.out.println("Fraction 1: " + f1.toString());

        // Dividing fractions
        try {
            f1.divide(f2);
            System.out.println("\nAfter dividing fraction 1 by fraction 2:");
            System.out.println("Fraction 1: " + f1.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}