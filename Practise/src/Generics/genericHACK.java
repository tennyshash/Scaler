package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class genericHACK {
    static class myClass {

    }
    public static void main(String[] args) {
        ArrayList<String> strList= new ArrayList<>();
        strList.add("shashwat");
        strList.add("Samar");

        ArrayList<Object> objList = new ArrayList<>();
        objList.add(10);
        objList.add(true);
        objList.add(new myClass());

        System.out.println(strList.size());
        //objList.addAll(strList); // allowed
        strList.addAll((List)objList);
        // directly not allowed but  through type casting to list is allowed
        // because of this type-casting hack this skips TYPE SAFETY which is done in compile time checks..
        System.out.println(strList.size());
        System.out.println(strList);
//        for (String i : strList ) {
//            // elements of objlist are typcaste to list and added and their type is not string wo we need to have object type.
//            System.out.println(i);
//        }
        for( Object i : strList ){
            System.out.print(i+" ");
        }
    }
}
