package Threading.AdderSubtractorIMPLICITLock_Synchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private CountVariable countObj;
    public Adder(CountVariable countObj){
        this.countObj=countObj;
    }
    @Override
    public void run() {
        for (int i=1;i<=10000;i++){
            synchronized (countObj) {//using implicit lock of countObj
                this.countObj.value += i;
            }
        }
    }
}
