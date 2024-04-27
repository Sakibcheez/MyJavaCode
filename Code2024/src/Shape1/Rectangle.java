
package Shape1;

/**
 *
 * @author SAKIB AHMED
 */
public class Rectangle {
    
     double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    void displayInfo() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
    
}
