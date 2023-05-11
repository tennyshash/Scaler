package JAVA8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //create a list and filter all even and odd numbers  from list
        List<Integer> list1= List.of(2,3,4,5,6,3,67,89);
        List<Integer> list2= Arrays.asList(23,234,45,56,67,2);
        //list2.add(45);//list is immutable we cant add in it

        //Extract even from list1 W/O stream\
        List<Integer> listeven= new ArrayList<>();
        for( Integer i: list1){
            if((i & 1) ==0) listeven.add(i);
        }
        System.out.println(listeven);
        // this above code is long and is known as BOILER PLATE CODE


        //using STREAM
    //        Stream<Integer> stream = list1.stream();
    //        List<Integer> evenList=stream.filter(i->(i&1)==0).collect(Collectors.toList());
                            //OR
        List<Integer> evenList=list1.stream().filter(i->(i&1)==0).collect(Collectors.toList());
        System.out.println(evenList);

        //Number greater than 50;
        List<Integer> numGREATERthan50=list1.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(numGREATERthan50);
    }
}
