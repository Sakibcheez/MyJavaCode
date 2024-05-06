
package code2024;

import java.util.Scanner;

/**
 *
 * @author SAKIB AHMED
 */
public class String_Count {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Remove spaces
        String stringWithoutSpace = input.replaceAll("\\s+", "");

        // Display each letter separately
        System.out.println("Letters in the string:");
        for (int i = 0; i < stringWithoutSpace.length(); i++) {
            System.out.println(stringWithoutSpace.charAt(i));
        }

        // Count total letters
        int totalLetters = stringWithoutSpace.length();
        System.out.println("Total letters without spaces: " + totalLetters);
    }
}

    

