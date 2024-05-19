
package code2024;


public class SeriesSummation {
    
    public static void main(String[] args) {
        int n = 5; // Number of terms
        double sum = calculateSeriesSum(n);
        System.out.println("Sum of the series up to " + n + " terms is: " + sum);
    }

    public static double calculateSeriesSum(int n) {
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            double numerator = 2 * i - 1;
            double denominator = 2 * i;
            double term = numerator / denominator;
            sum += term;
        }
        
        return sum;
    }
    
}
