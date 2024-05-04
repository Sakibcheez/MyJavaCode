
package Lab9GeometricObject;


public class TestGeometricObject {
    
    public static void main(String[] args) 
    {
        
        Circle C1 = new Circle(5.0); // object creat
        
        C1.printCircle(); 
        
        System.out.println(" "); // 1 line space 
        
        Rectangle R1 = new Rectangle(5.0,10.0);
        
        R1.printRectangle();
        
        System.out.println(" ");
        
        Circle C2 = new Circle(1, "red", true);   
        
        C2.printCircle();
        
        System.out.println(" ");
        
        Rectangle R2 = new Rectangle();
        
        R2.printRectangle();
             
                
    }
    
}
