
package swuingguineatbeans;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class TextFieldDemo extends JFrame {
    
    private Container c;
    private JTextField tf1, tf2;
    
    TextFieldDemo(){
    initComponents();
    }
    
    public void initComponents(){
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        tf1 = new JTextField();
        tf1.setBounds(50,50,200,50);
        c.add(tf1);
        
        tf2 = new JTextField("hello sakib");
        tf2.setBounds(50, 120, 200, 50);
        c.add(tf2);
        
        
    
    
    }
    
    public static void main(String[] args) {
        
        
        TextFieldDemo frame  = new TextFieldDemo();
        
        frame.setVisible(true); 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         frame.setBounds(200, 50, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        frame.setTitle("JText Fieled Demo");
        
        
    }
    
    
    
}
