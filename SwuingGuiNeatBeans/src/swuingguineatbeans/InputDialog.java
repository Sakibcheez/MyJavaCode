
package swuingguineatbeans;

import javax.swing.JOptionPane;

public class InputDialog {
    
    public static void main(String[] args) {
        
       String name =  JOptionPane.showInputDialog("Enter Your First Name : "); // ("Enter you name", "Sakib"); 
        String name1 =  JOptionPane.showInputDialog(null,"Enter Your Last Name : ", "Title",JOptionPane.ERROR_MESSAGE ); 
       
       
       
       JOptionPane.showMessageDialog(null, name+ " "+ name1 + " hello ", "Test",JOptionPane.ERROR_MESSAGE );
       
       
       
        
    }
}
