
package swuingguineatbeans;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDemoIcon extends JFrame {
    
    private ImageIcon icon;
    private Container c; 
    
    FrameDemoIcon(){
     initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setBackground(Color.blue);
        
        icon = new ImageIcon(getClass().getResource("images.png"));
        this.setIconImage(icon.getImage());
    }
     public static void main(String[] args) {
        
        // JFrrame frame = new JFrame(); 
        FrameDemoIcon frame = new FrameDemoIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        frame.setBounds(200, 50, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        frame.setTitle("Kashundi Cafee");
        
        frame.setResizable(false); // boro choto kora jabe nah 
    }
    
    
    
    
    
    
}
