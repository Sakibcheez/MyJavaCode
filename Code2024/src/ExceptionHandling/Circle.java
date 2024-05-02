
package ExceptionHandling;


public class Circle {
    
    private double radius;
    private static int numberOfObjects = 0;
    
    public Circle(double radius)
    {
    setRadius(radius);
    numberOfObjects++;
    }

    public double getRadius() 
    {
    return radius;
    }
    
// Declaring an exception in method header using 'throws' keyword
    public void setRadius(double radius)
    throws IllegalArgumentException {
// throwing an exception using 'throw' keyword
    if(radius >= 0)
    this.radius = radius;
    else
    throw new IllegalArgumentException("Radius can't be negative");
    }
          
    public static int getNumberOfObjects() 
    {
    return numberOfObjects;
    }
    
    public double findArea() 
    {
    return radius*radius*3.1416;
    }
}
    

