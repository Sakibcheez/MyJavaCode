
package Lab11_Composition;


public class Test_Composition {
    
    public static void main(String[] args) {
        
   
     Point p = new Point(2,3);
     Point q = new Point(3,4);
     System.out.println(p.toString());
     System.out.println(q.toString());
        
        
     Line a = new Line(p,q);
     System.out.println("Lenght:"+a.getLength());
     System.out.println(a.toString());
        
     Line b = new Line(0, 0, 3, 4);
     System.out.println("Lenght:"+b.getLength());
     System.out.println(b.toString());
        
        
    }    
   }
    
