
package LAb10_Polymorphism;


public class DynamicPolymorphism_Test {
    
    public static void main(String[] args) {
        
    Person p;
    
    p = new Person();
    System.out.println(p.toString());
    
    p = new Employee();
    System.out.println(p.toString());
    
    p = new Faculty();
    System.out.println(p.toString());
}
    
}
