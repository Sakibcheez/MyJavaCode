
package lab6_Account;

import java.util.Scanner;


public class TestAcoount {
    
    public static void main(String[] args) {
        
        int x;
        
        Scanner Scan = new Scanner(System.in);
    do{
        {
    System.out.println("Previous : ");
    Account A1 = new Account();
    System.out.println(A1.toString());
    
     System.out.println("Current Info:");
     Account A2 = new Account(2312546, 500);
     A2.credit(500.00);
     A2.debit(200); 
     System.out.println(A2.toString());
     
     
        System.out.println("Enter Amount to add: ");
        double add = Scan.nextDouble();
        A2.credit(add);
        System.out.println("Enter amount to widraw: ");
        double withdraw = Scan.nextDouble();
        A2.debit(withdraw);
        
        System.out.println(A2.toString());
    }
        System.out.println("Press 1 to Continue....");
        x = Scan.nextInt();
    }while(x==1);
     
     
     
    }
             
    
}
