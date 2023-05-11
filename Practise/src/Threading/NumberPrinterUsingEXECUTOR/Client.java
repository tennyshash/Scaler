package Threading.NumberPrinterUsingEXECUTOR;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        for( int i=0;i<=100;i++){
            if(i==40) System.out.println("STOP");
            NumberPrinter np= new NumberPrinter(i);
            executor.execute(np);
        }
    }
}
