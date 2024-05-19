
package Lab12_Abstraction;

public class Circle extends Shape {
    
    
    Circle(double r)
    {
        super(r,r);
    }
    
    @Override
    void area()
    {
     double result = Math.PI * dim1 * dim2;
        System.out.println("Circle Area :" +result);
    }
    
}
