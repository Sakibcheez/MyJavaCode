
package Mid_Quiz_Final;

/**
 *
 * @author SAKIB AHMED
 */
public class Triangle {
    
      private Point a;
    private Point b;
    private Point c;
    private String type;
    
    public Triangle(){
    
    }

    public Triangle(Point a, Point b, Point c, String type) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = type;
    }
    
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        a = new Point(x1,y1);
        b = new Point(x2, y2);
        c = new Point(x3,y3);
    
    }
    
    public Triangle(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getPerimeter()
    {
        
        return   a.distance(b)+ b.distance(c)+ c.distance(a);
    }
    
    /**
     *
     * @return
     */
    public String getType(){
        if(a.distance(a) == b.distance(b) && a.distance(a) == b.distance(c))
        return "Equilateral ";
        else if(a.distance( a) == b.distance(b) ||  a.distance(a) == c.distance(c) || b.distance(b) == c.distance(c))
            return "Isoceles";
        else 
            return "Scalene";
    }
    
    @Override
    public String toString()
    {
     return "Triangle[(x1 = )]";
    }
      
    
}
