package Threading.AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //we want to use sharedVariable among 2 calsses so using STATIC variable is not good idea it may lead to Synchronisation issue.
        //so we use a class count and declare a variable in it as will be using as shared variable
        CountVariable countObj=new CountVariable();
        countObj.value =0;

        Lock lock= new ReentrantLock();//creating lock

        Adder adder= new Adder(countObj,lock);
        Subtractor subtractor= new Subtractor(countObj,lock);

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(adder);
        executorService.execute(subtractor);

        //ie we donot shutdown executor then our program will keep running
        executorService.shutdown();//whatever task are with executor as soon as all are done shutdown yourself.(shutdown gives signal to shut it down)
        executorService.awaitTermination(100, TimeUnit.MINUTES);// waiting for the shutdown to happen only happens after shutdown.

        System.out.println(countObj.value);
    }
}
