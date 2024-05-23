
package swuingguineatbeans;

import javax.swing.JFrame;


public class FrameDemo1 extends JFrame{
    
    FrameDemo1(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         setBounds(200, 50, 400, 300); // uporer 3 ta ekshathe kaj korbe 
        
        setTitle("Kashundi Cafee");
        
        //setResizable(false); // boro choto kora jabe nah 
    
    }
    
    public static void main(String[] args) {
        
        FrameDemo1 frame = new FrameDemo1();
         frame.setVisible(true);
        
        
        
        
    }
    
    
    
    
}
