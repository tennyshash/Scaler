package JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream APi - collection progress
        //collection / group of objects as it can work on arrays also

        //1->blank
        Stream<Object> emptyStream=Stream.empty();

        //2-> array, object collection
        String names[]={"Shashwat","Ankit","Swarnim"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->System.out.println(e));

        //3->builder pattern
        Stream<Object> streamBuilder= Stream.builder().build();

        //4
        IntStream stream= Arrays.stream( new int []{2,3,4,55,6,6});
        stream.forEach(e-> System.out.println(e));

        //5 -> SET,LIST
        List<Integer> list1= List.of(2,3,4,5,6,3,67,89);
        Stream<Integer> listStream=list1.stream();
        listStream.forEach(e-> System.out.println(e));

    }
}
