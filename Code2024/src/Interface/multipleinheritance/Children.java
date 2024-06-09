
package Interface.multipleinheritance;


public class Children implements Father, Mother {
    
    @Override
    public void love() {
        System.out.println("Love ");
    }
    
    @Override
    
    public void honesty(){
        
        System.out.println("Honesty");
    
    }
    
}
