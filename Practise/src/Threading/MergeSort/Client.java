package Threading.MergeSort;

import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort=List.of(1,2,3,12,13,34,3,456,76);
        ExecutorService executorService= Executors.newCachedThreadPool();

        Sorter sortingArray= new Sorter(arrayToSort,executorService);//
        //technically only 1 Executor is required so we can pass it from here only as we are creating in main

//        Future<List<Integer>> sortedArrayFuture= executorService.submit(sortingArray);
//        List<Integer> sortedArray=sortedArrayFuture.get();
                    //OR
        List<Integer> sortedArray=executorService.submit(sortingArray).get();

        for (Integer i: sortedArray) {
            System.out.print(i + " ");
        }
        //Program will not close as executor is still running, to avoid that shutdown the executor.c
    }
}

