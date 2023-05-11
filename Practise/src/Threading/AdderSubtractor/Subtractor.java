package Threading.AdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private CountVariable countObj;
    private Lock lock;
    public Subtractor(CountVariable countObj,Lock lock){
        this.countObj= countObj;
        this.lock=lock;
    }
    @Override
    public void run() {
        for( int i=1;i<=10000;i++){
            lock.lock();
            this.countObj.value -=i;
            lock.unlock();
        }
    }
}