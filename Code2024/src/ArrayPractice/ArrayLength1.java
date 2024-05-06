
package ArrayPractice;


public class ArrayLength1 {
    
    public static void main(String[] args) {
        
    
    // Creating an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Finding the length of the array
        int length = numbers.length;

        // Printing the length of the array
        System.out.println("Length of the array: " +length);
        
    //2D array    
      int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
           

        // Finding the number of rows (length of the first dimension)
        int numRows = matrix.length;

        // Finding the number of columns (length of the second dimension)
        // Note: Assuming all rows have the same number of columns
        int numColumns = matrix[0].length;

        // Printing the dimensions of the 2D array
        System.out.println("Number of rows: " + numRows);
        System.out.println("Number of columns: " + numColumns);   
        
    // Creating a ragged array
        int[][] raggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Finding the number of rows (length of the first dimension)
        int numRows1 = raggedArray.length;

        // Finding the length of each row (number of columns)
        int[] rowLengths = new int[numRows1];
        for (int i = 0; i < numRows1; i++) {
            rowLengths[i] = raggedArray[i].length;
        }

        // Printing the number of rows and the lengths of each row
        System.out.println("Number of rows: " + numRows1);
        for (int i = 0; i < numRows1; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + rowLengths[i]);
        }
        
        System.out.println(" ");
    //Testing by another code 
    
    int[][] distance1 = {{1,2,3},{4,5},{6,7,8,9}};
    
    int size = distance1.length;
    
        System.out.println("Size of this array distance is :" +size);
    
    for(int i =0; i<distance1.length; i++)
    {
        System.out.println("Row Number : "+(i+1)); 
     for(int j = 0; j<distance1[i].length ; j++){
         System.out.print(distance1[i][j] + " ");
     }        
        System.out.println(" ");
        
        System.out.println("Length of row :"+distance1[i].length);
        System.out.println("");
    }
        
    }
}
