package Design_Pattern.PrototypeRegistery.sol3;

public class MAIN {
    public static void main(String[] args) {
        registryStudent sr= new registryStudent();
        sr.addStudent("june22BatchStudent",new student("june22Intermediate"));
        sr.addStudent("Aug22BatchStudent",new student("aug22beginer"));
//        student s1= null;
//        student duplicate=s1.copy();
        // in case of inheritance ensure copy methods is overridden
        student shashwat=sr.getStudent("june22BatchStudent").copy();
        shashwat.setName("shashwat");
        System.out.println(shashwat.getBatch());
    }
}
