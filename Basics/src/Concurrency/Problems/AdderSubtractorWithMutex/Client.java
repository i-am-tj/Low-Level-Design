package Concurrency.Problems.AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        c.val = 0;

        Lock lock = new ReentrantLock();

        Adder a = new Adder(c, lock);
        Subtractor s = new Subtractor(c, lock);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.val);
    }
}
