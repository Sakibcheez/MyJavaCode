
package Thread;

import java.util.Random;


public class Exercise {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB(threadA);

        threadA.start();
        threadB.start();

        try {
            // Wait for user input
            System.in.read();
            // Interrupt ThreadA
            threadA.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadA extends Thread {

    private Random random = new Random();

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // Randomly choose between "hello" and "good morning"
                if (random.nextBoolean()) {
                    System.out.println("You say hello");
                } else {
                    System.out.println("You say good morning");
                }
                // Sleep for a short time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ThreadB extends Thread {
    private ThreadA threadA;

    public ThreadB(ThreadA threadA) {
        this.threadA = threadA;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // Wait for ThreadA to say something
                synchronized (threadA) {
                    threadA.wait();
                }
                // Check if ThreadA said "hello" or "good morning"
                if (threadA.getState().toString().equals("RUNNABLE")) {
                    System.out.println("I say good bye");
                } else {
                    System.out.println("I say good night");
                }
                // Notify ThreadA to continue
                synchronized (threadA) {
                    threadA.notify();
                }
                // Sleep for a short time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}