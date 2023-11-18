package Creational.Singleton.v2;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //Approach - We will only focus on Multithreaded environment as now we know soln works in single threaded environment
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

        // Here though all the hashcode are same we start to see time difference increasing as the number of threads start increasing

        //Execution times - can be seen increasing as compared to v1 on higher number of threads
        // 0 -> 10000 - 860 ms
        // 0 -> 100000 - 8381 ms
        // 0 -> 1000000 - 83331 ms

        // Synchronized basically puts up a lock internally and starts taking each thread one by one putting, hence putting up a wait time
        // Thus the performance gets impacted and hence this solution though correctly working becomes useless for scalable architectures

        // Hence we are moving on to the fourth approach

    }
}
