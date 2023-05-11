package interviewQUEs;

public class b extends a{

    public void run() {
        System.out.println( "printing b");
    }
    //Multiple Question below

    //public void run(a,b){}                //->compilation
//    public void run(int  a,int b){        //->override
//        System.out.println("printing b");
//    }
//    public void run(String  a,String b){ //->will run depending on object reference type
//        System.out.println("Printing datatype string");
//    }
//    public run( a,  b){               //->no return type as well data type
//        System.out.println("print");
//    }
//    public run( int a, int b){        //->no return type
//        System.out.println("print");
//    }
//    protected  run( int a, int b){    //-> no return type also we cant downgrade Access MOd it can be same or upgrade it..
//        System.out.println("print");
//    }
//     void run( int a, int b){        //-> default AM cant downgrade
//        System.out.println("print");
//    }
//    public int run( int a, int b){   //->override happening but return type diff
//        System.out.println("print");
//    }
}
