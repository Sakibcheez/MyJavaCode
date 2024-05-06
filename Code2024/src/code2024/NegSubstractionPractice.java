
package code2024;

import java.util.Scanner;


public class NegSubstractionPractice {
    
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        char choice;
        do{
            {
        int x , y;
        
        System.out.println("Enter a number x : ");
       
        
        x = scan.nextInt();
        
        System.out.println("Enter number y :");
        
        y = scan.nextInt();
        
        int substraction = x-y;
        
        
        System.out.println("x-y is :"+substraction);
            }
        
        System.out.println("Do you  want to Continue again? Press Y or N ");
        choice = scan.next().charAt(0);
        
        } while(choice == 'Y' | choice == 'y');
        
    }
    
}
    
