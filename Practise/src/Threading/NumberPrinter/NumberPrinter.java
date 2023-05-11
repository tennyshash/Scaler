package Threading.NumberPrinter;

public class NumberPrinter implements Runnable{
    private int numberToPrint;
    NumberPrinter(int numberToPrint){
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }
        //if(numberToPrint==20) System.out.println("break");
        this.numberToPrint=numberToPrint;
    }
    @Override
    public void run() {
        System.out.println(numberToPrint+"->Printed by "+Thread.currentThread().getName());
    }
}
