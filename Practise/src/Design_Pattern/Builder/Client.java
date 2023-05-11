package Design_Pattern.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        //---------------------->>>>>>>>>>>>>basic prev appraoch code
//        Builder b= Student.getBuilder();
//        b.setAge(24);
//        b.setName("Shashwat");
//        b.setGender("Mmale");
//        if(!b.validate()){
//            throw new Exception("Invalid data");
//        }
//        Student st= new Student(b);
        //---------------------->>>>>>>>>>>>> new appraoch code starts here
        //Changes from here
        //Method chaining
        //Student.getBuilder().setName("Shash").setAge(24).setGender("male").build();
        //above line means-->setName("Shash") should be method of obeject return by getBuilder()
        //similarly--->setAge(24) should be method of obeject that is being  return by setName("Shash").
        //Currently setName("Shash") is returning void but if i make setName() return builder then it will have setAge method.
        //---//Student.getBuilder().setName("Naman").setAddress("asdfac").setPsp(56).validate();
        // now after chaining above line works and if we add a build method to it then we can create object of student directly from here
        Student s=Student.getBuilder().setName("Naman").setAddress("asdfac").setPsp(96).build(); //looks more clean now compared before
        //build here is used to validate and then create obj of student
        //--->>
        //But now still as Constuc of student is public any can creat obj direct with any rubbish parameter.
        //eg-->
        //-->Student s2= new Student(null); // allowed but this not be allowed as per good code. object should ony be created via builder.
        // make it private but if we ake private then in builder class we cant create stude obj then what to do,...????
        //----> private constructor of student can be accessed witin class so what if,we wrtie our builder class inside student then we can access constr
        //no still no works as builder class is non static and getbuilder method is static
        System.out.println(s);
    }
}
