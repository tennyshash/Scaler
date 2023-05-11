package Threading.NumberPrinter;

public class Client {
    public static void main(String[] args) {
        for( int i=0;i<=10;i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread t= new Thread(np);
            t.start();
            //t.start();// if start method is present more than 1 then exception
        }
    }
}
