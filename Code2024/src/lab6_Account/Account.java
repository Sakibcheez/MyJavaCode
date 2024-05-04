
package lab6_Account;


public class Account {
    
    private int accountNumber;
    private double balance;
    
    public Account(){
    this.accountNumber = 0;
    this.balance = 0.00;
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public Account(int accountnumber)
    {
        
     this.accountNumber = accountnumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void credit(double amount)
    {
    this.balance = this.balance + amount ;
    }
    
    public void debit(double amount)
    {
    if(this.balance >= amount)
        this.balance = this.balance - amount;
    else 
            System.out.println("amount Withdrawn exceeds the current balace !");
        
    }
    
    public String toString()
    {
     return "A/C no: " +this.accountNumber + ", Balance: " +this.balance ;  
    }
    
}
