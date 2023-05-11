package Generics;

public class threading extends Thread{
    static  int value=0;
    class threadDEMO{
        public void runing(){
            value++;
            System.out.println(value);
            System.out.println("Inside : " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Thread");
        Thread t1= new threading();

        System.out.println("starting Thread");
        t1.start();//without  this  the run method  will not be executed by threas t1 it will be executed by main thread or another thread

        Thread t2= new threading();
        t2.start();

    }
}
