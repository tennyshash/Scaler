package Threading.AdderSubtractorIMPLICITLock_Synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        CountVariable countObj=new CountVariable();
        countObj.value =0;
        // over here we are using implicit lock i.e use hidden lock feature of and object that is common , so here
        //Class count is common we use it obj as lock by synchronized(countOBJ){--}, hence we donot create our own lock

        Adder adder= new Adder(countObj);
        Subtractor subtractor= new Subtractor(countObj);

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(adder);
        executorService.execute(subtractor);

        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.MINUTES);

        System.out.println(countObj.value);
    }
}
