package javaDSA;

import java.util.*;

public class set {
    public static void main(String[] args) {
//        Set<Integer> javaDSA.set= new TreeSet<>();
//        javaDSA.set.add(1);
//        javaDSA.set.add(34456);
//        javaDSA.set.add(0);
//        System.out.println(javaDSA.set.contains(35));
//        System.out.println(javaDSA.set);
//        for( int s : javaDSA.set) System.out.print(s+ " ");
        TreeMap<Integer ,String> car= new TreeMap<>();
        car.put(44,"black");
        car.put(0, "yellow");
        car.put(5,"red");
       // System.out.println(car);
//        System.out.println(car.get("lambo"));
//        Iterator it=car.entrySet().iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+ " ");
//        }
//        System.out.println();
        for(Map.Entry<Integer ,String > i : car.entrySet()){
            //System.out.print(i.getKey()+" "+i.getValue());
            System.out.print(i+"--");
        }
//        Set<String> key= car.keySet();
//        for( String i : key){
//            System.out.print(i+ " "+car.get(i));
//        }




    }
}
