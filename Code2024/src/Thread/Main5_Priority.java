
package Thread;


public class Main5_Priority extends Thread {
    
    @Override

    public void  run(){
            System.out.println("Running Thread priority is:" +Thread.currentThread().getPriority() );
        }
    
    public static void main(String[] args) {
        
        Main5_Priority m1 = new Main5_Priority();
        Main5_Priority m2 = new Main5_Priority();
        
        m1.setPriority(MIN_PRIORITY);
        m2.setPriority(MAX_PRIORITY);
        
        m1.start();
        m2.start();
    }
    
}
