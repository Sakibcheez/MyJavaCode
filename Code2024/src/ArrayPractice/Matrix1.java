
package ArrayPractice;

import java.util.Scanner;

// Take input of a 3x3 matrix and display the sum of its main diagonal element. For
// the following matrix,

public class Matrix1 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Take input for the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the sum of the main diagonal elements
        int sumMainDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            sumMainDiagonal += matrix[i][i];
        }

        // Display the sum of the main diagonal elements
        System.out.println("Sum of the main diagonal elements: " + sumMainDiagonal);

        scanner.close();
    }
    
    
}
