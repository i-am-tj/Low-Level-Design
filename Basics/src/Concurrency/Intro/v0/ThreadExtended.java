package Concurrency.Intro.v0;

public class ThreadExtended extends Thread {
    // To include thread name we can override the constructor with name

    // Implement the run() method and add the logic
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // threadId() and name are same for the whole lifecycle of the thread
            System.out.println("Extending Threads Class : " + i + " Thread Name: " + Thread.currentThread().getName() + " Thread Id: " + threadId());
        }
    }
}
