
package Interface.Lab13;


public class ResizeableCircle extends Circle implements Resizable {

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void resize(int percent) {
        radius *= (percent / 100.0);
    }
    
}
