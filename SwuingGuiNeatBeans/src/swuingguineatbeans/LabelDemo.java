
package swuingguineatbeans;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LabelDemo extends JFrame {
    
    private Container c;
    private JLabel userLabel, passLabel; 
    
    
    LabelDemo(){
    
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null); 
        c.setBackground(Color.white);
        
        userLabel = new JLabel();
        userLabel.setText("Enter Your Username :");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel); 
        
        passLabel = new JLabel("Enter Your Password : ");
        passLabel.setBounds(50, 80, 150, 50);
        c.add(passLabel); 
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        frame.setBounds(200, 50, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        frame.setTitle("Kashundi Cafee");
        
    }
    
    
    
}
