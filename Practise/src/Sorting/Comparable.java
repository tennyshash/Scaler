package Sorting;
import java.util.*;
public class Comparable {
    static  class pair implements java.lang.Comparable<pair> {
        int num;
        String name;
        pair(int num, String name){
            this.num=num;
            this.name=name;
        }
        public int compareTo(pair p){
            return this.num-p.num; // returns 1 descending
//            if(this.num < p.num)        return 1;
//            else if(this.num > p.num)   return -1;
//            return 0;
            // for descding curr oject is small then p obj return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Comparable");
        pair ary[]= new pair[3];
        ary[0]=new pair(23,"shashwat");
        ary[1]=new pair(20,"samar");
        ary[2]=new pair(45,"mummy");
        //Arrays.sort(ary,(a,b)->b.num-a.num);
        Arrays.sort(ary);
        for( int i=0;i<3;i++){
            System.out.println(ary[i].num +"-"+ary[i].name);
        }
        //Collections.sort(ary); ary.forEach(System.out::println); //  labda expression for printing
    }
}