
package code2024;

import java.util.Scanner;


public class ArrayPractice1 {
    
    public static void main(String[] args) {
        
        System.out.println(".....................................................................");
        
        int x[] = new int[5];
        
        Scanner Scan = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter 5 digit: ");
        for(int i =0; i< 5; i++)
        {
        x[i] = Scan.nextInt();
        sum = x[i] + sum;
        }
       
        System.out.println(" ");
        
        System.out.println("The Number inputs are :");
        for(int i =0 ; i<5; i++)
        {
            System.out.println(+x[i]);
        }
         System.out.println("Total Sum is : "+sum);
       
    }
    
}
