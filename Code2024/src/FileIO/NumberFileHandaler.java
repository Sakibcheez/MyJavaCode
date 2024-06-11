
package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NumberFileHandaler {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Take input from the user and write to file
        try (PrintWriter writer = new PrintWriter(new FileWriter("numbers.txt"))) {
            System.out.println("Enter integers (enter a negative number to stop):");
            int num;
            while ((num = scanner.nextInt()) >= 0) {
                numbers.add(num);
                writer.println(num);
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read from file and calculate sum and average
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            int sum = 0;
            int count = 0;
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                sum += num;
                count++;
            }
            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No numbers entered.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
    
}
