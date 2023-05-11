package JAVA8.lambda.practiseLambda;

public class client {
    public static void main(String[] args) {
        //providing implementation of JAVA8.lambda;
        //sum
        sumInterface si=(a,b)->a+b;
        System.out.println("Sum is "+si.sum(5,25));

        //length
        lengthInterface stringLen=(str)->str.length();
        int len= stringLen.getLength("Shashwat PPratap ");
        System.out.println("Length is "+len);
    }
}
