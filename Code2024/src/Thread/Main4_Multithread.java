
package Thread;

public class Main4_Multithread implements Runnable {
    
    public static void main(String[] args) {
 
        Thread thread1 = new Thread("Alex");
        Thread thread2 = new Thread("Azubai");
         
        thread1.start();
        thread2.start();
        
        System.out.println("Thread names are Following ");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
     
    }
    
    @Override
    public void run()
    {
    
    }
    
}
