package Threading.HelloWorldPrinter;

public class MAIN {
    public static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        hwp.run();// runs in main thread
        Thread t= new Thread(hwp);
        t.start();
        System.out.println("End of Code "+Thread.currentThread().getName());
    }
}
