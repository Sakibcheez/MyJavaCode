
package Lab11_Composition;

public class Line {
    
      
    private Point start;
    private Point end;

    public Line(Point start, Point end) 
    {
        this.start = start;
        this.end = end;
    }
    
     public Line(int x1 , int y1 , int x2 ,int y2 ){
        //start = new Point(x1,y1);
        //end = new Point(x2,y2);
        //otherwise
        start = new Point();
        end = new Point();
        start.setX(x1);
        start.setY(y1);
        end.setX(x2);
        end.setY(y2);
     }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
   public double getLength()
   {
   int dx = start.getX() - end.getX();
         int dy = start.getY() - end.getY();
         
         return Math.sqrt((dx*dx)+ (dy*dy));
   }
   
    /**
     *
     * @return
     */
    @Override 
   public String toString()
   {
    return "Line [start(x: "+start.getX()+" , y: "+start.getY()+"), end(x: "+end.getX()+" , y: "+end.getY()+")]";
   }
    
}
