
package Lab9GeometricObject;


//inheritance so use extends keyword 
public class Rectangle extends GeometricObject {
    
    private double width;
    private double height;
    
    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     *
     * @param width
     * @param height
     * @param color
     * @param filled
     */
    public Rectangle(double width, double height, String color, boolean filled)
    {
     super(color,filled);
     this.width = width;
     this.height = height;
    }
    
        public double getPerimeter()
      {
         return 2*(height + width);
       }
        
      public double getDiameter()
              
      {
          return 2*(height + width);
      }
      
    public double getArea()
    {
    return height*width ;
    }
    
    public void printRectangle()
    {
        System.out.println("Height is : " +this.height );
        System.out.println("Width is :" +this.width);
        System.out.println("Color is :" +super.getColor());
        System.out.println("Perimeter is :" +this.getPerimeter()); // this keyword use for current class 
        System.out.println("Diameter is :" +this.getDiameter());
        System.out.println("Area is :" +this.getArea());  
        
    }
    
       
}