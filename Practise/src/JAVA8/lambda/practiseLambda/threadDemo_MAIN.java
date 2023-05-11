package JAVA8.lambda.practiseLambda;

public class threadDemo_MAIN {
    public static void main(String[] args) {
        Runnable runObj=()->{
          for( int i=0;i<5;i++){
              System.out.println(i+" Printed by "+Thread.currentThread().getName());
          }
        };
        Thread t=  new Thread(runObj);// new thread
        t.setName("Shashwat");//setting my name
        t.start();
    }
}
