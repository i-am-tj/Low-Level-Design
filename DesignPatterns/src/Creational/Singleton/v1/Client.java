package Creational.Singleton.v1;

public class Client {
    public static void main(String[] args) throws InterruptedException {
//        //Approach 1 - Single Threaded Environment
//        Database db1 = Database.getInstance();
//        Database db2 = Database.getInstance();
//
//        //Passes as after db1 no instance can be created every other instance will return the older instance
//        if(db1.hashCode() == db2.hashCode()) System.out.println("No new instance created");

        //Approach 2 - Multithreaded environment  #Comment Approach 1 before executing
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
        // Here we start to see more than one hashcode for the class

        // This typically explains that the current solution is not useful in multithreaded environment

        //Also noting down execution time for further use
        // 0 -> 10000 - 863 ms
        // 0 -> 100000 - 8523 ms
        // 0 -> 1000000 - 81311 ms

        //Hence we are moving on to the third approach
    }
}
