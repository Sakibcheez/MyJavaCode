
package Lab_Box;


public class Box {
    
      private double width;
    private double height;
    private double depth;

  
    public Box()    // constructor 
    {
        width = 1.0;  
        height = 1.0;
        depth = 1.0;
    }

    public Box(double len)
    {
        width = len;
        height = len;
        depth = len;
    }

    public Box(double width, double height, double depth) 
    {
        this.width = width;          //using this referrence 
        this.height = height;
        this.depth = depth;
    }

    public Box(Box box) // Class Box type 
    {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    //methods 
    // Getters
    
    public double getWidth() 
    {
        return width;
    }

    public double getHeight() 
    {
        return height;
    }

    public double getDepth() 
    {
        return depth;
    }

    //Setters
    
    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setDepth(double depth) 
    {
        this.depth = depth;
    }

    public void setDim(double width, double height, double depth) //Dim = Dimesions
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Equality Check

    
    public boolean equalTo(Box o) 
    {
        return this.width == o.width && this.height == o.height && this.depth == o.depth;
    }

    // Volume Calculation
    
    public double volume() 
    {
        return width * height * depth;
    }

   
    @Override //handy tool 
    
    public String toString()
    {
        return "Box (Width=" + width + ", Height=" + height + ", Depth=" + depth + ")";
    }
    
    
}
