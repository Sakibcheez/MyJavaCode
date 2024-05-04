
package Lab9GeometricObject;


public class Circle extends GeometricObject {
    
    private double radius;
    
    public Circle()
    {
    }
    
    public Circle (double radius)
    {
     this.radius = radius ;
    }
    
      public Circle (double radius, String color, boolean filled)
      {
       super(color,filled);
       this.radius = radius;
       
      }
   
      public double getPerimeter()
      {
          return 2*Math.PI*radius;
       }
      public double getDiameter()
              
      {
          return 2*radius;
      }
    public double getArea()
    {
    return radius*radius*Math.PI;
    }
    
    public void printCircle()
    {
        System.out.println("Radius is : " +radius);
        System.out.println("Color is :" +super.getColor());
        System.out.println("Perimeter is :" +getPerimeter());
        System.out.println("Diameter is :" +getDiameter());
        System.out.println("Area is :" +getArea());  
        
    }
}
    