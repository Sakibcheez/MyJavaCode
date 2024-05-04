
package Lab9_1Cylinder;


import java.text.DecimalFormat;


public class Cylinder extends Circle
{
    
    private double height;

    /**
     *
     */
    public Cylinder()
        {
    super(1, "red");
    height = 1.0 ;  
}

public Cylinder(double height)
        
{
 super(1,"red");
 this.height = height; 
}

public Cylinder(double height,double radius)
        
{
   super(1,"red");
   this.height = height;
   super.setRadius(radius);
 
}
public Cylinder(double height,double radius,String color)
{
    super(10,"Red");
    this.height = height;
     super.setRadius(radius);
     super.setColor(color);
}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

 
public double getvolume()
{
   
 return super.getArea() * this.height ;

}

   @Override
    public String toString()
{
    
    DecimalFormat df = new DecimalFormat("#.##");
    return "Volume is: " + df.format(this.getvolume());
}

   
}