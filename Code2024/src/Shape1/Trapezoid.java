/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape1;

/**
 *
 * @author SAKIB AHMED
 */
public class Trapezoid {
    
    double base1;
    double base2;
    double height;

    Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    double getArea() {
        return (base1 + base2) * height / 2;
    }

    void displayInfo() {
        System.out.println("Trapezoid:");
        System.out.println("Base 1: " + base1);
        System.out.println("Base 2: " + base2);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }
    
}
