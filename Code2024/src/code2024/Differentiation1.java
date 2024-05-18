
package code2024;

 class Polynomial {
    // Coefficients of the polynomial. coefficients[i] represents the coefficient of x^i.
    private final double[] coefficients;

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    // Method to compute the derivative of the polynomial
    public Polynomial differentiate() {
        if (coefficients.length == 1) {
            // The derivative of a constant is 0.
            return new Polynomial(new double[]{0});
        }

        double[] derivativeCoefficients = new double[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }

        return new Polynomial(derivativeCoefficients);
    }

    // Method to print the polynomial in human-readable form
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (sb.length() > 0 && coefficients[i] > 0) {
                    sb.append(" + ");
                } else if (coefficients[i] < 0) {
                    sb.append(" - ");
                }
                sb.append(Math.abs(coefficients[i]));
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }
}

public class Differentiation1 {
    public static void main(String[] args) {
       
    {
        // Example polynomial: 3x^3 + 2x^2 + x + 5
        double[] coefficients = {5, 1, 2, 3};
        Polynomial polynomial = new Polynomial(coefficients);
        
        System.out.println("Original polynomial: " + polynomial);

        Polynomial derivative = polynomial.differentiate();
        System.out.println("Derivative: " + derivative);
    }
    
}
}
