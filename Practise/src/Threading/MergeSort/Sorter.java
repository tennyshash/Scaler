package Threading.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    ExecutorService executorService= Executors.newCachedThreadPool();
    public Sorter(List<Integer> arrayToSort , ExecutorService executorService){
        this.executorService=executorService;
        this.arrayToSort=arrayToSort;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1)   return arrayToSort;
        int mid=arrayToSort.size()/2;

        List<Integer> leftArray= new ArrayList<>();
        for( int i=0;i<mid;i++) leftArray.add(arrayToSort.get(i));//building left array
        List<Integer> rightArray= new ArrayList<>();
        for( int i=mid;i<arrayToSort.size();i++) rightArray.add(arrayToSort.get(i));// building right array

        //ExecutorService executorService= Executors.newCachedThreadPool();-->if we dont want to pass it then we can declare here.

        // creating 2 class obj for left and right aray
        Sorter leftSorter= new Sorter(leftArray,executorService);//recursion
        Sorter rightSorter= new Sorter(rightArray,executorService);
        //Everytime we are creating 2 threads for left and right sorter obj.
        Future<List<Integer>> leftSortedArrayFuture=executorService.submit(leftSorter);//future gives a space in advance to store thing.
        Future<List<Integer>> rightSortedArrayFuture=executorService.submit(rightSorter);

        List<Integer>sortedArray= new ArrayList<>();

        List<Integer> leftSortedArray=leftSortedArrayFuture.get();//if future is not yet done,code will wait here till future is completed
        List<Integer> rightSortedArray=rightSortedArrayFuture.get();

        int i=0,j=0;//merge sort
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<=rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while (i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while (j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
