
package swuingguineatbeans;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LabelDemo extends JFrame {
    
    private Container c;
    private JLabel userLabel; 
    
    
    LabelDemo(){
    
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null); 
        c.setBackground(Color.blue);
        
        userLabel = new JLabel();
        userLabel.setText("Enter your username :");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel); 
        
        
        
    }
    
    public static void main(String[] args) {
        
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        frame.setBounds(200, 50, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        frame.setTitle("Kashundi Cafee");
        
    }
    
    
    
}
