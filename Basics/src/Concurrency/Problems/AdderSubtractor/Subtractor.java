package Concurrency.Problems.AdderSubtractor;

public class Subtractor implements Runnable {
    Counter c2;
    Subtractor(Counter c) {
        c2 = c;
    }

    @Override
    public void run() {
        for(int i = 10000; i >= 0; i--) {
            c2.val -= i;
        }
    }
}
