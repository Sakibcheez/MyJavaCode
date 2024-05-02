
package ExceptionHandling;


public class CircleMain {
    
    public static void main(String[] args) {
// catching an exception using try-catch-finally block
    try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(-5);
            Circle c3 = new Circle(0);
            Circle c4 = new Circle(10);
            Circle c5 = new Circle(12.0);
}
    catch(IllegalArgumentException ex) {
    System.out.println(ex);
}
    finally {
        
    System.out.println("Number of object created: " +Circle.getNumberOfObjects());
    }
    
  
}
    
}
    
