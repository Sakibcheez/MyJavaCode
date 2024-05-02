
package ExceptionHandling;

/**
 *
 * @author SAKIB AHMED
 */
public class CircleCustomExceptionMain {
    
    public static void main(String[] args) {
// catching an exception using try-catch-finally block
try {
    CircleCustomException c1 = new CircleCustomException(5);
    CircleCustomException c2 = new CircleCustomException(-5);
    CircleCustomException c3 = new CircleCustomException(0);
}
    catch(InvalidRadiusException ex) {
    System.out.println(ex);
}

    finally {
    System.out.println("Number of object created: "+ CircleCustomException.getNumberOfObjects());
}
}
    
}
