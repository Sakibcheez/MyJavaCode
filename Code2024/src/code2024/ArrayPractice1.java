
package code2024;

import java.util.Scanner;


public class ArrayPractice1 {
    
    public static void main(String[] args) {
        
        System.out.println(".....................................................................");
        
        int x[] = new int[12];
        
        Scanner Scan = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter 12 digit: ");
        for(int i =0; i< 12; i++)
        {
        x[i] = Scan.nextInt();
        sum = x[i] + sum;
        }
        System.out.println("Total Sum is : "+sum);
        
        System.out.println(" ");
        for(int i =0 ; i<12; i++)
        {
            System.out.println("The number input is : "+x[i]);
        }
        System.out.println("...........................................................................");
    }
    
}
