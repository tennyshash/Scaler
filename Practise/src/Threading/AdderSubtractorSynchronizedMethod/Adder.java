package Threading.AdderSubtractorSynchronizedMethod;

public class Adder implements Runnable{
    private CountVariable countObj;

    public Adder(CountVariable countObj){
        this.countObj=countObj;
    }
    @Override
    public void run() {
        for (int i=1;i<=10000;i++){
            countObj.add(i);
        }
    }
}
