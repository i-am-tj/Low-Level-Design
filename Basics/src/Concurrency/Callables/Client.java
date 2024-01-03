package Concurrency.Callables;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        ArrayList<Future<String>> greets = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            GreetingsCreator gc = new GreetingsCreator(i);
            Future<String> greet = es.submit(gc);
            greets.add(greet);
        }

        for(Future<String> greet : greets) {
            System.out.println("Greeting: " + greet.get());
        }
        es.shutdown();
    }
}
