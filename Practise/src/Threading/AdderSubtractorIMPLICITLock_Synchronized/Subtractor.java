package Threading.AdderSubtractorIMPLICITLock_Synchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private CountVariable countObj;
    public Subtractor(CountVariable countObj){
        this.countObj= countObj;
    }
    @Override
    public void run() {
        for( int i=1;i<=10000;i++){
            synchronized (countObj) {
                this.countObj.value -= i;
            }
        }
    }
}