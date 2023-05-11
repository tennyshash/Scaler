package javaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class temp {
    interface Temp{
         int getArea();
    }

    static class rect implements Temp {
        int l; int b;
        rect( int l , int b){
            this.l=l;
            this.b=b;
        }
        public int getArea(){
            return this.b*this.l;
        }
    }
    static class circle implements Temp {
        int r;
        circle( int r){
            this.r=r;
        }
        public int getArea(){
            return this.r*this.r*3;
        }
    }
    public static void main(String[] args) {
        Temp r= new rect(10,20);
        System.out.println(r.getArea());
        Temp c= new circle(5);
        System.out.println(c.getArea());
        ArrayList<Integer> tp= new ArrayList<>(5);
        System.out.println(tp.size());
//        ArrayList<Integer> ary= new ArrayList<>(7);
//        HashMap<Integer,Integer>map= new HashMap<>();
//        for( int i=0;i<10;i++) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
    }
}
