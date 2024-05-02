
package ExceptionHandling;


public class Exception1 {
    
      
    public static void main(String[] args) {
        int number1 = 10, number2 = 0;
        
        try
        {
         int result = number1/number2 ;
            System.out.println("Result" +result);
        }
    
    catch(ArithmeticException ex) {
        ex.printStackTrace();
    }
}
    
    
}

    
