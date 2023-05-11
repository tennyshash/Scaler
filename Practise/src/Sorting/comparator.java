package Sorting;
import java.util.Arrays;
import java.util.Comparator;

class pair{
    int num;
    String name;
    pair( int num , String name){
        this.name=name;
        this.num=num;
    }
}
class mmethodComaparator implements Comparator<pair>{

    @Override
    public int compare(pair a, pair b) {
        if(a.num==b.num){
            return b.name.compareTo(a.name);
        }
        return b.num-a.num;
    }
}

public class comparator {
    public static void main(String[] args) {
        pair array[]= new pair[3];
        array[0]= new pair(25,"Ankit");
        array[1]= new pair(25,"Shashwat");
        array[2]= new pair(22,"Samar");
        Arrays.sort(array, new mmethodComaparator());
        for( int i=0;i<3;i++){
            System.out.println(array[i].num +"-"+array[i].name);
        }
     }
}
