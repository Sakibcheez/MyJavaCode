
package Lab12_Abstraction;


public abstract class Shape {
    
    public double dim1, dim2;
    
    /**
     *
     * @param dim1
     * @param dim2
     */
    protected Shape(double dim1, double dim2)
    {
    this.dim1 = dim1;
    this.dim2 = dim2;
    
    }
    
    abstract void area(); 
    
    
    
}
