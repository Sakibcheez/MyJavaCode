 
package swuingguineatbeans;

  import javax.swing.JOptionPane;
 import javax.swing.ImageIcon;


public class Test1 {
    
 
	public static void main(String[] args)
{
	
		
	
  // JOptionPane.showMessageDialog(null, "Wrong Password"); // first perameter is position 
    
 //JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE);
 // position, text, title, icon 
    
 //JOptionPane.showMessageDialog(null, "Wrong Password", "Warning",0);
 // position, text, title, icon (ide value) 
 
 ImageIcon icon = new ImageIcon("icon1.png");
 JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE, icon);
 
 // icon add to 5th parameter 
 
 
}
}
    

