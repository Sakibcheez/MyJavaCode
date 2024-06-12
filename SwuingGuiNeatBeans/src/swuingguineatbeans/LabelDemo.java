
package swuingguineatbeans;

import java.awt.*; 
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.Font;
import javax.swing.*; 
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;


public class LabelDemo extends JFrame {
    
    private Container c;
    private JLabel userLabel, passLabel, ImageLabel; 
    private Font f;
    private ImageIcon Icon,img;  
    
    
    
    LabelDemo(){
    
        initComponents();
    }
    
    public void initComponents(){
        
        c = this.getContentPane();
        c.setLayout(null); 
        c.setBackground(Color.white);
        
        Icon = new ImageIcon(getClass().getResource("images.png"));
        this.setIconImage(Icon.getImage());
        
        img = new ImageIcon(getClass().getResource("440288836_1246888036715640_5185305496980969451_n.jpg"));
        ImageLabel = new JLabel(img);
        ImageLabel.setBounds(50,200,img.getIconWidth(),img.getIconHeight());
        c.add(ImageLabel); 
        ImageLabel.setToolTipText("AAAAAAAAAA"); 
        
  
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
       
        
        frame.setBounds(300, 400, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        frame.setTitle("Kashundi Cafee");
        
    }
    
    
    
}
