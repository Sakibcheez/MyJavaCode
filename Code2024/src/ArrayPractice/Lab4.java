

package ArrayPractice;

import java.util.Scanner;

/* Read 10 integers from the user and store them in an array. Take another integer
from the user and check whether it is in the array (print “Found” in that case) or
not (print “Not found”). */

public class Lab4 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do{
        // Read 10 integers from the user and store them in an array
        try {
            // Read 10 integers from the user and store them in an array
            int[] numbers = new int[10];
            System.out.println("Enter 10 integers, one at a time:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            // Take another integer from the user
            System.out.print("Enter an integer to search for: ");
            int searchNumber = scanner.nextInt();
            
            // Check whether the integer is in the array
            boolean found = false;
            for (int number : numbers) {
                if (number == searchNumber) {
                    found = true;
                    break;
                }
            }
            
            // Print the result
            if (found) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
        }
       catch(ArithmeticException ex) {
    }
       
         System.out.println("Do you  want to Continue again? Press Y or N ");
         choice = scanner.next().charAt(0);
           
    } while(choice == 'Y' | choice == 'y') ;
    
}
}
