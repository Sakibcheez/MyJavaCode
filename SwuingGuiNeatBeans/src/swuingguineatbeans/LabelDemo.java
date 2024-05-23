
package swuingguineatbeans;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LabelDemo extends JFrame {
    
    private Container c;
    private JLabel userLabel, passLabel; 
    private Font f;
    private ImageIcon Icon; 
    
    
    LabelDemo(){
    
        initComponents();
    }
    
    public void initComponents(){
        
        Icon = new ImageIcon(getClass().getResource("images.png"));
        this.setIconImage(Icon.getImage());
        
        c = this.getContentPane();
        c.setLayout(null); 
        c.setBackground(Color.white);
        
        f = new Font("Arial", Font.BOLD, 14);
        
        userLabel = new JLabel();
        userLabel.setText("Enter Your Username :");
        userLabel.setBounds(50, 20, 300, 50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.red);
        userLabel.setOpaque(true); 
        userLabel.setBackground(Color.blue);
        userLabel.setToolTipText("Enter User name ");
        c.add(userLabel); 
        
        String s = userLabel.getToolTipText();
        System.out.println(" " +userLabel.getText());
        System.out.println(s);
        
        passLabel = new JLabel("Enter Your Password : ");
        passLabel.setBounds(50, 80, 300, 50);
        passLabel.setFont(f);
        passLabel.setToolTipText("Enter your password"); 
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
