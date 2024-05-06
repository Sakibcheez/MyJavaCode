
package ArrayPractice;

import java.util.Scanner;


public class ArrayInput {
    
    public static void main(String[] args) {
        // 1D Array
        try (Scanner scanner = new Scanner(System.in)) {
            // 1D Array
            System.out.println("1D Array Example:");
            System.out.println("Enter the length of the 1D array:");
            int length1D = scanner.nextInt();
            int[] array1D = new int[length1D];
            System.out.println("Enter the elements of the 1D array:");
            for (int i = 0; i < length1D; i++) {
                array1D[i] = scanner.nextInt();
                     
            }  
            // 2D Array
            System.out.println("\n2D Array Example:");
            System.out.println("Enter the number of rows for the 2D array:");
            int rows2D = scanner.nextInt();
            System.out.println("Enter the number of columns for the 2D array:");
            int columns2D = scanner.nextInt();
            
            int[][] array2D = new int[rows2D][columns2D];
            System.out.println("Enter the elements of the 2D array:");
            // fill up 1st row then 2nd then ...... 
            for (int i = 0; i < rows2D; i++) {
                for (int j = 0; j < columns2D; j++) {
                    array2D[i][j] = scanner.nextInt();
                }
                
                }   
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
                System.out.println("Enter the elements for row " + (i + 1) + ":");
                for (int j = 0; j < columnsRagged; j++) {
                    raggedArray[i][j] = scanner.nextInt();
                }
            }  
            //printing returl 
            
// Displaying 1D Array
            System.out.println("\n1D Array:");
            for (int i = 0; i < length1D; i++) {
                System.out.print(array1D[i] + " ");
            }   
// Displaying 2D Array
            System.out.println("\n\n2D Array:");
            for (int i = 0; i < rows2D; i++) {
                for (int j = 0; j < columns2D; j++) {
                    System.out.print(array2D[i][j] + "  ");
                }
                System.out.println();
            }   
// Displaying Ragged Array
            System.out.println("\nRagged Array:");
            for (int i = 0; i < rowsRagged; i++) {
                for (int j = 0; j < raggedArray[i].length; j++) {
                    System.out.print(raggedArray[i][j] + " ");
                }
                System.out.println();
            }
            // Close the scanner
        }
    }
}
    

