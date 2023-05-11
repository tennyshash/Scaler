package Sorting;

import java.util.Arrays;
import java.util.Comparator;
class pair4{
    int num;
    String name;
    pair4( int num , String name){
        this.name=name;
        this.num=num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class lambda_2 {
    public static void main(String[] args) {
        pair4 array[]= new pair4[4];
        array[0]= new pair4(25,"bhaalu");
        array[1]= new pair4(25,"kaluu");
        array[2]= new pair4(22,"Samar");
        array[3]= new pair4(26,"Shashwat");
        Arrays.sort(array, Comparator.comparing(pair4::getNum).thenComparing(pair4::getName).reversed());
        for( int i=0;i<4;i++){
            System.out.println(array[i].num +"-"+array[i].name);
        }
    }
}
