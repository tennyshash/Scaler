package JAVA8.lambda.learning_lambda;

public class Client {
    public static void main(String[] args) {
        //Approach 1->
            MYFunctionalInterface obj= new lambdaCLASS();
            obj.SayHello();
            //over here to use sayHello method of interface we created lambdaCLASS & overrode the method and from main we created obj and then called..!
            //so when we need to have diff 2-4 implementaion of sayHello method then it will be hectic so here we can use JAVA8.lambda
        //approach 2->
            MYFunctionalInterface Li= new MYFunctionalInterface() {
                @Override
                public void SayHello() {
                    System.out.println("Printing --->anonymous class for implementing interface ");
                }
            };
            Li.SayHello();
            //we can define as many no of implementation we want
        //Approach 3->
            MYFunctionalInterface l3=()-> System.out.println("I am using Lambda ");
            l3.SayHello();
    }
}
