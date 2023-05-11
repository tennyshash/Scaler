package javaPractise;

import java.util.*;

class customException extends Exception{
    @Override
    public String toString() {
        //return super.toString();
        return "B cant be Zer0 ";
    }

    @Override
    public String getMessage() {
        return "Message here";
    }
}
public class myException {
    static int divide( int a , int b) throws customException{
        if(b<=0) throw new customException();
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b=0,a=7;
//        int x= divide(a,b);
//        System.out.println(x);
        try {
            int c=divide(a,b);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("the end");
    }
}
