
package Lab12_Abstraction;

public class Triangle extends Shape {
    
    Triangle(double dim1, double dim2)
    {
    super(dim1,dim2);
   
    }
    
    @Override 
    void area()
    {
    double result = (1/2.0)*dim1 * dim2;
        System.out.println("Triangle Area :" +result);
    } 
    
}
