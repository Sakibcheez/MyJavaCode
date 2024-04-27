
package Shape1;


public class Circle {
    
     double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getDiameter() {
        return 2 * radius;
    }

    void displayInfo() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Diameter: " + getDiameter());
    }
    
}
