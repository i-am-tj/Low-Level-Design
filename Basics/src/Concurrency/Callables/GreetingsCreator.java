package Concurrency.Callables;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String> {
    Random r = new Random();
    int n;

    GreetingsCreator(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int num = Math.abs(r.nextInt() % 5);
        String greet = "";
        switch (num) {
            case 0:
                greet = "Hi " + n + " " + Thread.currentThread().getName();
                break;
            case 1:
                greet = "Hello " + n + " " + Thread.currentThread().getName();
                break;
            case 2:
                greet = "Namaste " + n + " " + Thread.currentThread().getName();
                break;
            case 3:
                greet = "Welcome " + n + " " + Thread.currentThread().getName();
                break;
            default:
                greet = "No greeting " + n + " " + Thread.currentThread().getName();
        }
        return greet;
    }
}
