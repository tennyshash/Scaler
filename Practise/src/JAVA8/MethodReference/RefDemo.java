package JAVA8.MethodReference;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning Method Reference");

        //implementation of workingInterface;
            workingStuff ws=()-> System.out.println("i am doing work in interface");
          //  ws.doTask();
        //Using method reference as we are using defined class stuff
            //refering static method class::method name
                workingStuff ws2=stuff::doStuff;
                //over we are overriding method of interface with help of class stuff and referencing its method
                //keep int mind that both method i.e. of interface and method we are refering in stuff show have same signature
                //oi.e same typ of argument return typ can be diff..
               // ws2.doTask();
        //thread implementation with static methods
            Runnable runn=stuff::threadTask;
            Thread t= new Thread(runn);
            t.start();
        //thread implementation with non-static
            stuff ob= new stuff();
            Runnable run1=ob::printNumber; //refering through class object
            Thread t1= new Thread(run1);
            t1.start();
    }
}
