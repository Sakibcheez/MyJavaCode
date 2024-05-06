
package code2024;

import java.util.Scanner;


public class PracticeArray2 {
    
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
            
        System.out.println("A matrix : \n");
        System.out.println("Enter Row Number :");
        int row = scan.nextInt();
        System.out.println("Enter Column Number :");
        int col = scan.nextInt();
        
        int[][] array = new int[row][col];
        System.out.println("Enter Element :");
        for(int i=0; i< row ; i++ )
        {
            for(int j =0; j< col ; j++)
            {
                array[i][j] = scan.nextInt();
            }
           
        }
        
        System.out.println("A: The " +row + " x " + +col +" Elements are: ");
        for(int i =0; i< row; i++)
        {
         for(int j=0; j< col; j++)
         {
             System.out.print(array[i][j] + " ");
         }
            System.out.println(" ");
        }
        
        System.out.println("\n B matrix \n");
        System.out.println("Enter Row Number :");
        int row1 = scan.nextInt();
        System.out.println("Enter Column Number :");
        int col1 = scan.nextInt();
        
        int[][] array1 = new int[row1][col1];
        System.out.println("Enter Element :");
        for(int i=0; i< row1 ; i++ )
        {
            for(int j =0; j< col1 ; j++)
            {
                array1[i][j] = scan.nextInt();
            }
           
        }
        
        System.out.println("B: The " +row1 + " x " + +col1 +" Elements are: ");
        for(int i =0; i< row1; i++)
        {
         for(int j=0; j< col1; j++)
         {
             System.out.print(array1[i][j] + " ");
         }
            System.out.println(" ");
        }
        
        System.out.println("\n A+B matrix is \n2" );
        int[][] array2 = new int[row][col];
        for(int i =0; i<row ; i++)
        {
         for(int j = 0; j< col; j++)
         {
         array2[i][j] = array[i][j] + array1[i][j]; 
         System.out.print(array2[i][j] + " ");
         }
            System.out.println(" ");
            
         
        }
        
    
    }
}
