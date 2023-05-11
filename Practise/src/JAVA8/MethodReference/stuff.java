package JAVA8.MethodReference;

import java.time.LocalDate;

public class stuff {
    public static void doStuff(){
        System.out.println("Doing Stuff in stuff class");
        System.out.println("Any number of line of code can come");
        LocalDate today=LocalDate.now();
        System.out.println(today.toString());
    }
    public static void threadTask(){
        for( int i=1;i<5;i++){
            System.out.println(i*2);
        }
    }
    public  void printNumber(){
        for( int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
