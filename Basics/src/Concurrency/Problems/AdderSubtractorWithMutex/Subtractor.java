package Concurrency.Problems.AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    Counter c2;
    Lock lock;
    Subtractor(Counter c, Lock lock) {
        c2 = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i = 10000; i >= 0; i--) {
            c2.val -= i;
        }
        lock.unlock();
    }
}
