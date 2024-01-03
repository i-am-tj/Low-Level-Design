package Concurrency.Problems.ParallelMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService es;

    MergeSorter(ExecutorService es, List<Integer> listToSort) {
        this.es = es;
        this.listToSort = listToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println(listToSort + " is processed by " + Thread.currentThread().getName());
        int size = listToSort.size();

        if(size <= 1) return listToSort;

        List<Integer> l = new ArrayList<>(listToSort.subList(0, (size) / 2));
        List<Integer> r = new ArrayList<>(listToSort.subList((size) / 2, size));

        MergeSorter sortForL = new MergeSorter(es, l);
        MergeSorter sortForR = new MergeSorter(es, r);

//        List<Integer> sortedL = sortForL.call();
//        List<Integer> sortedR = sortForR.call();

        Future<List<Integer>> sortedPL = es.submit(sortForL);
        Future<List<Integer>> sortedPR = es.submit(sortForR);

        List<Integer> sortedL = sortedPL.get();
        List<Integer> sortedR = sortedPR.get();

        ArrayList<Integer> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < sortedL.size() && j < sortedR.size()) {
            if (sortedL.get(i) < sortedR.get(j)) { mergedList.add(sortedL.get(i)); i++; }
            else { mergedList.add(sortedR.get(j)); j++; }
        }

        while (i < sortedL.size()) { mergedList.add(sortedL.get(i)); i++; }
        while (j < sortedR.size()) { mergedList.add(sortedR.get(j)); j++; }

        return mergedList;
    }
}
