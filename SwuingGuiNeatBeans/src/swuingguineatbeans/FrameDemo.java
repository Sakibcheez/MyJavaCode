
package swuingguineatbeans;

import javax.swing.JFrame;


public class FrameDemo extends JFrame {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //frame.setSize(800,300);
        
        // frame.setLocationRelativeTo(null);
        
       // frame.setLocation(200,50);
        
        frame.setBounds(200, 50, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        frame.setTitle("Kashundi Cafee");
        
        frame.setResizable(false); // boro choto kora jabe nah 
    }
    
    
    
}
