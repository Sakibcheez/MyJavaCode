
package code2024;

import java.util.Scanner;


public class StringFind {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Write something: ");
        String y = scan.nextLine();
        String z = y.toLowerCase(); 
        System.out.println("Which Latter want to find ?");
        String x = scan.nextLine();
        char m = x.toLowerCase().charAt(0); 
        
        boolean isMatched = z.indexOf(m) != -1;
       
        
          if (isMatched) {
            System.out.println("The letter '" +x.charAt(0) + "' is in the sentence.");
        } else {
            System.out.println("The letter '" +x.charAt(0) + "' is not in the sentence.");
        }
        
        
        
        
        
        
        
        
    }
    
}
