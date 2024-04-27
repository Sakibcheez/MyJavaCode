
package Shape1;

/**
 *
 * @author SAKIB AHMED
 */
public class Sphere {
    
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    void displayInfo() {
        System.out.println("Sphere:");
        System.out.println("Radius: " + radius);
        System.out.println("Volume: " + getVolume());
    }
    
}
