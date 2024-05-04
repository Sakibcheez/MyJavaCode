
package Lab9_1Cylinder;

public class TestCylinder {
    
    public static void main(String[] args){
    
        Cylinder C1 = new Cylinder();
        Cylinder C2 = new Cylinder(10.0);
        Cylinder C3 = new Cylinder(10.0,5.0);
        Cylinder C4 = new Cylinder(10.0,5.0,"green"); 
    
        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());
        System.out.println(C4.toString());
        
        System.out.println(" ");
        
        Circle Circle1 = new Circle();
        
        System.out.println(Circle1.toString());
        
    }
    
     
    }
    
    
