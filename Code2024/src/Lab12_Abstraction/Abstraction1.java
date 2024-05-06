
package Lab12_Abstraction;


public class Abstraction1 {
    
public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();               //Here we donot call Animal Class we use just a method without naming its class 
  }
    
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  @Override
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

// Abstract class
abstract class Animal 
{
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

