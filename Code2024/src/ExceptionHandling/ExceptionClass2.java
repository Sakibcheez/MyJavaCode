
package ExceptionHandling;


public class ExceptionClass2 {
    
// Declaring an exception in method header using 'throws' keyword
    public static int quotient(int number1, int number2)
    throws ArithmeticException {
    // throwing an exception using 'throw' keyword
    if(number2 == 0)
    throw new ArithmeticException("Divisor can't be zero!");
    return number1/number2;
}
    
    public static void main(String[] args) {

        int number1 = 10, number2 = 0;
// catching an exception using try-catch-finally block
    try {
    int result = quotient(number1, number2);
    System.out.println(number1+"/"+number2+" = "+result);
    }
    
    catch(ArithmeticException ex) {
    ex.printStackTrace();
    }
    finally {
    System.out.println("Whatever happens," + "finally block will be executed!");
    }
}
}
    

