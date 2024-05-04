
package Lab9_1Cylinder;

import java.text.DecimalFormat;


public class Circle {
    
    private double radius ;
    String color ;
    public static int count = 0; // for how maany data count 

    public Circle() 
    {
        this.radius = 1.0;
        this.color = "red";
 
    }
    
    /**
     *
     * @param radius
     * @param color
     */
    public Circle(double radius , String color)
    {
        this.radius = radius;
        this.color = color;
            }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea()
    {
     return radius * radius* Math.PI;
    }
    
    @Override
    public String toString()
            
    {
        DecimalFormat df = new DecimalFormat("#.####");
        return "The Area is : " +df.format(this.getArea()) ; 
    }
    
    /**
     *
     * @param obj
     * @return
     */
    public boolean isEqual(Circle obj) 
    {
     if(this.radius == obj.radius) 
         return true;
     else 
         return false;
      //  OR  return this.radius == obj.radius;
    }
    
}
