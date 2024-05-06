
package ArrayPractice;

import java.util.Scanner;

/**
 *
 * @author SAKIB AHMED
 */
public class Matrix2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize matrices A and B as 3x3 arrays
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        // Take input for matrix A
        System.out.println("Enter the elements of matrix A (3x3):");
        inputMatrix(scanner, A);

        // Take input for matrix B
        System.out.println("Enter the elements of matrix B (3x3):");
        inputMatrix(scanner, B);

        // Print matrices A and B
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        // Perform addition, subtraction, and multiplication
        int[][] sum = addMatrices(A, B);
        int[][] difference = subtractMatrices(A, B);
        int[][] product = multiplyMatrices(A, B);

        // Print the resulting matrices
        System.out.println("Sum of A + B:");
        printMatrix(sum);
        System.out.println("Difference of A - B:");
        printMatrix(difference);
        System.out.println("Product of A * B:");
        printMatrix(product);

        // Calculate and print the sum of the main diagonal elements for each result
        int sumMainDiagonalSum = sumDiagonalElements(sum);
        int differenceMainDiagonalSum = sumDiagonalElements(difference);
        int productMainDiagonalSum = sumDiagonalElements(product);

        System.out.println("Sum of diagonal elements of A + B: " + sumMainDiagonalSum);
        System.out.println("Sum of diagonal elements of A - B: " + differenceMainDiagonalSum);
        System.out.println("Sum of diagonal elements of A * B: " + productMainDiagonalSum);

        scanner.close();
    }

    // Function to take input for a matrix
    public static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }

    // Function to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] difference = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                difference[i][j] = A[i][j] - B[i][j];
            }
        }
        return difference;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }

    // Function to calculate the sum of the main diagonal elements of a matrix
    public static int sumDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
