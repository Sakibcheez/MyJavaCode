/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Lab13;

/**
 *
 * @author SAKIB AHMED
 */
public class Test {
    
     public static void main(String[] args) {
         
        Circle circle = new Circle(2.0);
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());

        ResizeableCircle resizableCircle = new ResizeableCircle(2.0);
        System.out.println("ResizableCircle perimeter: " + resizableCircle.getPerimeter());
        System.out.println("ResizableCircle area: " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("After resizing by 50%");
        System.out.println("ResizableCircle perimeter: " + resizableCircle.getPerimeter());
        System.out.println("ResizableCircle area: " + resizableCircle.getArea());
    }
    
}
