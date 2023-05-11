package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class pair3{
    int num;
    String name;
    pair3( int num , String name){
        this.name=name;
        this.num=num;
    }
}
public class lambda {
    public static void main(String[] args) {
        pair3 array[]= new pair3[3];
        array[0]= new pair3(25,"bhaalu");
        array[1]= new pair3(25,"kaluu");
        array[2]= new pair3(22,"Samar");
//        Arrays.sort(array,(a, b)-> {
//                if(a.num==b.num){
//                    return b.name.compareTo(a.name);
//                }
//                return b.num-a.num;
//        });
        //Arrays.sort(array, (a,b)-> b.num-a.num);
        Arrays.sort(array,(a,b) -> a.name.compareTo(b.name));
        for( int i=0;i<3;i++){
            System.out.println(array[i].num +"-"+array[i].name);
        }
    }
}
