package JAVA8.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        //filter (predicate) return true or false i.e boolean value func
            //e->e>10;
            List<String>names= List.of("Shashwat","Ankit","Swarnim");

            List<String> nameWITHs=names.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
            System.out.println(nameWITHs);
            //or
            names.stream().filter(e->e.startsWith("S")).forEach(e-> System.out.println(e));

        //map(function)
        /*
           each element operation
         */
            List<Integer>number=List.of(1,56,3,4,5,6);
            //return same number with its square
            List<Integer>squareNumber=number.stream().map(i->i*i).collect(Collectors.toList());
            //System.out.println(squareNumber);
                    //or
            squareNumber.stream().forEach(System.out::println); //Method reference
        //sorted
            number.stream().sorted().forEach(System.out::println);
        //MIN of all
            Integer minVal=squareNumber.stream().min((x,y)->x-y).get();
            System.out.println(minVal);
        //MAX
            Integer maxVal=squareNumber.stream().max((x,y)->x-y).get();
            System.out.println(maxVal);
        // .get()  write notes of this in threading
    }
}
