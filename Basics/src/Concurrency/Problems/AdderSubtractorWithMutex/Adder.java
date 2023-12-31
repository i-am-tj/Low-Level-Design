package Concurrency.Problems.AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Counter c1;
    Lock lock;
    Adder(Counter c, Lock lock) {
        c1 = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i = 1; i <= 10000; i++) {
            c1.val += i;
        }
        lock.unlock();
    }
}
