
package Shape1;

/**
 *
 * @author SAKIB AHMED
 */
public class MainTest {
    
    public static void main(String[] args) {
        // Test Circle
        Circle circle = new Circle(5);
        circle.displayInfo();
        System.out.println();

        // Test Rectangle
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.displayInfo();
        System.out.println();

        // Test Trapezoid
        Trapezoid trapezoid = new Trapezoid(3, 5, 4);
        trapezoid.displayInfo();
        System.out.println();

        // Test Square
        Square square = new Square(7);
        square.displayInfo();
        System.out.println();

        // Test Sphere
        Sphere sphere = new Sphere(6);
        sphere.displayInfo();
    }
    
}
