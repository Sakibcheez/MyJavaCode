/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
