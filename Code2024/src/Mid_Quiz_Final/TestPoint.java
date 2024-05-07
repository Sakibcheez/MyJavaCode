
package Mid_Quiz_Final;

/**
 *
 * @author SAKIB AHMED
 */
public class TestPoint {
    
        public static void main(String[] args) {
        Point a1 = new Point(0,0);
        Point b2 = new Point(0,5);
        Point c3 = new Point(2,3);
        
        a1.toString();
        b2.toString();
        c3.toString();
               
                
        
        Triangle a = new Triangle(a1,b2,c3);
     
        
        System.out.println(a.getPerimeter());
        System.out.println(a.getType());
        
        
        
    }
    
}
