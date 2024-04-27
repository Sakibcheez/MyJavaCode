
package Lab_Box;


public class Box_Test {
    
    public static void main(String[] args) {
           
        Box box1 = new Box(3, 4, 5); //creating object
        Box box2 = new Box(box1);
        Box box3 = new Box(5);

        System.out.println("box1: " + box1.toString());
        System.out.println("box2: " + box2.toString());
        System.out.println("box3: " + box3.toString());

        System.out.println("box1 width:  " + box1.getWidth());
        System.out.println("box1 height: " + box1.getHeight());
        System.out.println("box1 depth:  " + box1.getDepth());

        box1.setWidth(7);
        box1.setHeight(8);
        box1.setDepth(9);
        
        System.out.println("Changed box1: " + box1.toString());
        
        System.out.println("");

        System.out.println(":Equality check ");
        System.out.println("Is box1 equal to box2? " + box1.equalTo(box2));
        System.out.println("Is box1 equal to box3? " + box1.equalTo(box3));
        
        System.out.println(" ");
        
        System.out.println("Volume of the boxes: ");
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
    
        
    }
    

