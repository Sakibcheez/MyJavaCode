
package Lab12_Abstraction.labtask;

/**
 *
 * @author SAKIB AHMED
 */
public class TestShapes {
    
    public static void main(String[] args) {
        
        Shape circle = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(circle); // which version?
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        //System.out.println(circle.getRadius()); // This will give a compilation error because circle is of type Shape

        Circle c1 = (Circle)circle; // Downcast back to Circle
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("Radius: " + c1.getRadius());

        Shape rectangle = new Rectangle(1.0, 2.0, "blue", true); // Upcast
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        //System.out.println(rectangle.getLength()); // This will give a compilation error because rectangle is of type Shape

        Rectangle r1 = (Rectangle)rectangle; // downcast
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Filled: " + r1.isFilled());
        System.out.println("Length: " + r1.getLength());
    }
    
}
