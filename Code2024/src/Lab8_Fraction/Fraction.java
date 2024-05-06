
package Lab8_Fraction;

public class Fraction {
    
   int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero.");
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public Fraction add(Fraction other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return simplify(newNumerator, newDenominator);
        }

        public Fraction subtract(Fraction other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return simplify(newNumerator, newDenominator);
        }

        public Fraction multiply(Fraction other) {
            int newNumerator = this.numerator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return simplify(newNumerator, newDenominator);
        }

        public Fraction divide(Fraction other) {
            if (other.numerator == 0) {
                throw new IllegalArgumentException("Cannot divide by zero.");
            }
            int newNumerator = this.numerator * other.denominator;
            int newDenominator = this.denominator * other.numerator;
            return simplify(newNumerator, newDenominator);
        }

        private Fraction simplify(int numerator, int denominator) {
            int gcd = gcd(numerator, denominator);
            return new Fraction(numerator / gcd, denominator / gcd);
        }

        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
   }
