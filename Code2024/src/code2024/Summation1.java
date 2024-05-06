
package code2024;

import java.util.Scanner;


public class Summation1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
     char choice;
     do{
         {
        System.out.println("Enter two digit: ");
        
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = x + y ;
                
        System.out.println("Summation is :" +sum);
         }
         System.out.println("Do you  want to Continue again? Press Y or N ");
          choice = scan.next().charAt(0); 
         
     }while (choice =='y' | choice =='Y'); 
    }
    
}
