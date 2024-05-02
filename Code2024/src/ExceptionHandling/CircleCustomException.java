
package ExceptionHandling;

/**
 *
 * @author SAKIB AHMED
 */
public final class CircleCustomException {

    static String getNumberOfObjects() 
    {
        throw new UnsupportedOperationException(" Not supported yet.");
    }
    
    private double radius;
    private static int numberOfObjects = 0;
    public CircleCustomException(double radius) throws InvalidRadiusException {
    setRadius(radius);
    numberOfObjects++;
}
    
public double getRadius()   
{
return radius;    
}

// Declaring a custom exception in method header
    public void setRadius(double radius)
    throws InvalidRadiusException {
// throwing a custom exception
    if(radius >= 0)
    this.radius = radius;
    else
    throw new InvalidRadiusException(radius);
}
    
  

}