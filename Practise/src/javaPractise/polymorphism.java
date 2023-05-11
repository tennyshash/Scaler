package javaPractise;

class vehicle{
     protected String color;
     private int maxspeed;
     protected int tyre;
    public vehicle(){

    }
    public vehicle( String color){
        this.color=color;
    }
    public void setMaxspeed( int maxspeed){
        this.maxspeed=maxspeed;
    }
    public int getMaxspeed(){
        return this.maxspeed;
    }
    public static void print(){
        System.out.println("Vehicle print");
        //System.out.println(color +" " + maxspeed);
    }
}
class car extends vehicle{
    int gears;
    boolean isConvertible;
    public car(){
        //super("red");
        //super.setMaxspeed(220);
        this.gears=6;
    }
    public static void print(){
        //super.print();
        System.out.println("Car print");
//        System.out.println("color-"+this.color);
//        System.out.println("speed-"+this.getMaxspeed());
//        System.out.println("gears-"+this.gears);
//        System.out.println("convertible-"+this.isConvertible);
    }
    //void printToCheck();
}
        //dynamic binding
        //static binding
public class polymorphism {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        car c = new car();
        c.color="yellow";
        c.setMaxspeed(300);
        //c.print();
        car vv= new car();
        vv.print();
    }
}

