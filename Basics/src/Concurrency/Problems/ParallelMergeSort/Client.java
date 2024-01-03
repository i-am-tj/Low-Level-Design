package Concurrency.Problems.ParallelMergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(5,7,2,9,1,4,3,6,10,8);
        ExecutorService es = Executors.newFixedThreadPool(8);

        MergeSorter ms = new MergeSorter(es, list);
        Future<List<Integer>> sorted = es.submit(ms);

        List<Integer> sortedList = sorted.get();
        System.out.println(sortedList);

        es.shutdown();
    }
}
