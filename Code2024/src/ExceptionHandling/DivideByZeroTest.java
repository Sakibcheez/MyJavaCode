
package ExceptionHandling;

     import java.awt.*;
     import java.awt.event.*;
     import javax.swing.*;


public class DivideByZeroTest extends JFrame implements ActionListener {
     
      private JTextField inputField1, inputField2, outputField;
      private int number1, number2, result;
   
      // set up GUI
       public DivideByZeroTest()
       {
          super( "Demonstrating Exceptions" );    
          // get content pane and set its layout
          Container container = getContentPane();
          container.setLayout( new GridLayout( 3, 2 ) );
   
         // set up label and inputField1
         container.add(
             new JLabel( "Enter numerator ", SwingConstants.RIGHT ) );
         inputField1 = new JTextField();
         container.add( inputField1 );
         

          // set up label and inputField2; register listener
          container.add( new JLabel( "Enter denominator and press Enter ", 
            SwingConstants.RIGHT ) );
          inputField2 = new JTextField();
         container.add( inputField2 );
        inputField2.addActionListener( this );
    
         // set up label and outputField
          container.add( new JLabel( "RESULT ", SwingConstants.RIGHT ) );
        outputField = new JTextField();
          container.add( outputField );
   
         setSize( 425, 100 );
          setVisible( true );
   
       } // end DivideByZeroTest constructor
    
       // process GUI events
      @Override
       public void actionPerformed( ActionEvent event )
       {
          outputField.setText( "" );   // clear outputField
    
          // read two numbers and calculate quotient
          try {                                                  
             number1 = Integer.parseInt( inputField1.getText() );
             number2 = Integer.parseInt( inputField2.getText() );
             
result = quotient( number1, number2 );                    
             outputField.setText( String.valueOf( result ) );          
          }                                                            
                                                                       
          // process improperly formatted input                        
          catch ( NumberFormatException numberFormatException ) {      
             JOptionPane.showMessageDialog( this,                      
                "You must enter two integers", "Invalid Number Format",
                JOptionPane.ERROR_MESSAGE );                           
          }                                                            
                                                                       
          // process attempts to divide by zero                        
         catch ( ArithmeticException arithmeticException ) {          
             JOptionPane.showMessageDialog( this,                      
                arithmeticException.toString(), "Arithmetic Exception",
                JOptionPane.ERROR_MESSAGE );                           
          }                                                            
    
       } // end method actionPerformed
    
       // demonstrates throwing an exception when a divide-by-zero occurs
       public int quotient( int numerator, int denominator )
          throws ArithmeticException
       {
          return numerator / denominator;
       }

public static void main( String args[] )
      {
         DivideByZeroTest application = new DivideByZeroTest();
         application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      }
   
   } 



