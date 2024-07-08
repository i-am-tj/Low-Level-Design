package Concurrency.Intro.v0;

public class Client {
    public static void main(String[] args) {
        // In this example we will try to understand how thread creation works and how can we start multiple threads
        // So we can create threads in Java in 2 ways - 1. Extending Thread class 2. Implementing Runnable interface
        // 1. Extends Thread
        System.out.println("Main 1 Thread start");
        ThreadExtended threadExtended = new ThreadExtended();
        threadExtended.start(); // asynchronous method
        System.out.println("Main 1 Thread exit");

        // 2. Implements Runnable
        // 2.1. When implementing runnable couple of points to note
        // 2.2. We can actually implement a thread directly using Thread class and not give anything to it. It will work. It basically gives you the main thread class information.
        // 2.3. As we give the class which implements runnable we are actually giving it a Runnable Task
        // 2.4. We can also give this a thread name, and it is optional as well
        System.out.println("Main 2 Thread start");
        Thread thread = new Thread(new ImplementsRunnable(), "Implements Runnable Thread");
        thread.start();
        System.out.println("Main 2 Thread exit");

        // Additionally we can also use lambda functions to instantiate the threads
        System.out.println("Main 3 Thread start");
        Thread lambdaThread = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Lambda Runnable         : " + i + " Thread Name: " + Thread.currentThread().getName());
            }
        });
        lambdaThread.start();
        System.out.println("Main 3 Thread exit");

        // In the next example we will see how we can call this in different ways
    }
}
