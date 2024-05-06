
package ArrayPractice;

import java.util.Scanner;


public class Array1 {
    
    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
            // Rectangular Array
            System.out.println("Rectangular Array Example:");
            System.out.println("Enter the number of rows for the rectangular array:");
            int rowsRectangular = scanner.nextInt();
            System.out.println("Enter the number of columns for the rectangular array:");
            int columnsRectangular = scanner.nextInt();
            
            int[][] rectangularArray = new int[rowsRectangular][columnsRectangular];
            System.out.println("Rectangular Array Size: " + rowsRectangular + "x" + columnsRectangular);
            
            // Ragged Array
            System.out.println("\nRagged Array Example:");
            System.out.println("Enter the number of rows for the ragged array:");
            int rowsRagged = scanner.nextInt();
            int[][] raggedArray = new int[rowsRagged][];
            System.out.println("Enter the number of columns for each row:");
            for (int i = 0; i < rowsRagged; i++) {
                System.out.println("Enter the number of columns for row " + (i + 1) + ":");
                int columnsRagged = scanner.nextInt();
                raggedArray[i] = new int[columnsRagged];
            }   System.out.println("Ragged Array Size:");
            for (int i = 0; i < rowsRagged; i++) {
                System.out.println("Row " + (i + 1) + ": " + raggedArray[i].length);
            }  
            
            // 2D Array
            System.out.println("\n2D Array Example:");
            System.out.println("Enter the number of rows for the 2D array:");
            int rows2D = scanner.nextInt();
            System.out.println("Enter the number of columns for the 2D array:");
            int columns2D = scanner.nextInt();
            int[][] array2D = new int[rows2D][columns2D];
            System.out.println("2D Array Size: " + rows2D + "x" + columns2D);
            // Close the scanner
             scanner.close();
        }
    }
}
    
