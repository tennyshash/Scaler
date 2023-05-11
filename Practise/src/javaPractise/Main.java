package javaPractise;

import java.util.ArrayList;

class complexNumber{
    int real;
    int imaginary;
    complexNumber(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    complexNumber add(complexNumber y){
        int sumreal= this.real + y.real;
        int sumimag= this.imaginary + y.imaginary;
        complexNumber res = new complexNumber(sumreal, sumimag);
        return res;
    }
    public String toString(){
        return this.real + " + "+ this.imaginary+"i" ;
    }
}

class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something...");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s2){    // copy constructor..
        this.name=s2.name;
        this.age=s2.age;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name){
        System.out.println("Name is -" +name);
    }
    public void printInfo(int age){
        this.age=age;
        System.out.println("age is -" + age);
    }
}
abstract class Shapes{
    abstract void Area();
}
class Triangle extends Shapes{
    public void Area( ){
        System.out.println("javaPractise.Triangle has 3 sides");
    }
}

class Circle extends Shapes{
    public void Area( ){
        System.out.println("circle has 1 area");
    }
}
public class Main{
        public  static  void main(String [] args){
            ArrayList<Integer> int_ary= new ArrayList<Integer>(5);

    }
}
