
package swuingguineatbeans;

import javax.swing.JOptionPane;


public class ShowConfirmDialog {
    
    public static void main(String[] args) {
        
     int choice =  JOptionPane.showConfirmDialog(null,"Do you want to quite","Cafe",JOptionPane.YES_NO_CANCEL_OPTION); 
    
    if(choice == JOptionPane.YES_OPTION)
    {
    System.exit(0);
    }
    
    else 
    {
        System.out.println("You have clicked no option");
        JOptionPane.showMessageDialog(null,"You clicked no option", "Test",JOptionPane.ERROR_MESSAGE );
    }
    
    }
    
    
}
