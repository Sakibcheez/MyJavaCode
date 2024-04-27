
package Shape1;

/**
 *
 * @author SAKIB AHMED
 */
public class Square {
    
      double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    void displayInfo() {
        System.out.println("Square:");
        System.out.println("Side: " + side);
        System.out.println("Area: " + getArea());
    }
    
}
