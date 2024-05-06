
package code2024;

import java.util.Scanner;


public class InputPractice {
    
    public static void main(String[] args) {
        
        System.out.println("Type Your Name :");
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine(); 
        
        System.out.println("Your name is: " +x);
        
        String y = x.toUpperCase();
        String z = x.toLowerCase();
        
        System.out.println(y);
        System.out.println(z);
                
           
    }
    
}
