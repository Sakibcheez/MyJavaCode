
package lab6_Account;


public class TestAcoount {
    
    public static void main(String[] args) {
        
    
    
    Account A1 = new Account();
    System.out.println(A1.toString());
    
    
     Account A2 = new Account(2312546, 500);
     A2.credit(500.00);
     A2.debit(200); 
     System.out.println(A2.toString());
     
     
    }
     
    
    
            
    
}
