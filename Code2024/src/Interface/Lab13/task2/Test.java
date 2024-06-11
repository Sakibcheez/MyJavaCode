/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Lab13.task2;

/**
 *
 * @author SAKIB AHMED
 */
public class Test {
    
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println(point);
        point.moveUp();
        System.out.println("After moveUp: " + point);
        point.moveDown();
        System.out.println("After moveDown: " + point);
        point.moveLeft();
        System.out.println("After moveLeft: " + point);
        point.moveRight();
        System.out.println("After moveRight: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(circle);
        circle.moveUp();
        System.out.println("After moveUp: " + circle);
        circle.moveDown();
        System.out.println("After moveDown: " + circle);
        circle.moveLeft();
        System.out.println("After moveLeft: " + circle);
        circle.moveRight();
        System.out.println("After moveRight: " + circle);
    }
    
}
