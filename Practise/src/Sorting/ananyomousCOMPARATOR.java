package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class pair2{
    int num;
    String name;
    pair2( int num , String name){
        this.name=name;
        this.num=num;
    }
}
public class ananyomousCOMPARATOR {
    public static void main(String[] args) {
        pair2 array[]= new pair2[3];
        array[0]= new pair2(25,"Ankit");
        array[1]= new pair2(25,"swarnim");
        array[2]= new pair2(22,"Samar");
        Arrays.sort(array, new Comparator<pair2>() {
            @Override
            public int compare(pair2 a, pair2 b) {
                if(a.num==b.num){
                    return b.name.compareTo(a.name);
                }
                return b.num-a.num;
            }
        });
        for( int i=0;i<3;i++){
            System.out.println(array[i].num +"-"+array[i].name);
        }
    }
}
