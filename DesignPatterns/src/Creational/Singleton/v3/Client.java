package Creational.Singleton.v3;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //Approach - We will only focus on Multithreaded environment
        //Let us identify time taken
        long start = System.currentTimeMillis();
        Thread t = null;
        for(int i = 0; i < 10000; i++) {
            Multithreaded multithreaded = new Multithreaded();
            t = new Thread(multithreaded);
            t.start();
        }
        t.join();
        System.out.println();
        System.out.println("===========");
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        // Double checked locking is a good example of implementing Singleton classes

        //Execution times
        // 0 -> 10000 - 874 ms
        // 0 -> 100000 - 7855 ms
        // 0 -> 1000000 - 79385 ms

        // Though it looks fine but it can be actually broken in 3 ways - Reflection, Serialization, Cloneable

        //Hence we will see how all these issues might get tackled one by one as we approach the 5th version.

    }
}
