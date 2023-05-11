package javaPractise;

interface drawable{
    void draw();
    default void where(){
        System.out.println("default in interface");
    }
    static int area(int l , int b ){
        return l*b;
    }
}
interface drawable2{
    void draw();
    default void where(){
        System.out.println("default in interface");
    }
    static int area(int l , int b ){
        return l*b;
    }
}
class  rectangle implements drawable,  drawable2{
    public void where(){ // if we commnent it out this code will throw error
        System.out.println("Inside the javaPractise.rectangle class");
    }
    public void draw(){
        System.out.println("drawing javaPractise.rectangle");
    }
}

public class Testinterface {

    public static void main(String[] args) {
        drawable d = new rectangle();
        d.draw();
        d.where();
        System.out.println(drawable.area(5,4));
    }
}
