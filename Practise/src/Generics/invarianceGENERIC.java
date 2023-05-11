package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class invarianceGENERIC {
    static class Materials{}
    static class Goods extends  Materials{}
    static class Cement extends  Goods{}
    static class Sand extends Goods{}
    public static void main(String[] args) {
        ArrayList<Materials> Bags= new ArrayList<>(2);
        Bags.add(new Goods());
        Bags.add(new Goods());
        Bags.add(new Goods());

        //printlist(Bags);
        //System.out.println(Bags.size());

        ArrayList<Goods> anotherbag= new ArrayList<>();
        anotherbag.add(new Cement());
        printlist2(anotherbag);
        //System.out.println(anotherbag);
    }
    public static void printlist(ArrayList<? extends Materials> sandbag){
        for(Object o : sandbag){
            System.out.println(o);
        }
    }
    public static void printlist2(ArrayList<? extends Materials> sandbag){
        for(Object o : sandbag){
            System.out.println(o);
        }
    }

//    public static <T extends Materials>void printlist2(ArrayList<List<T>> sandbag){ this way not allowedd
//        for(Object o : sandbag){
//            System.out.println(o);
//        }
//    }
}
