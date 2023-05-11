package JAVA8.MethodReference.ConstructorReference;

public class Client {
    public static void main(String[] args) {
        System.out.println("Learning constructor reference");
        System.out.println("----------------------------");
        //implementation using lambda
            provider prov=()->new Student();
            Student student=prov.getStudent();
            student.display();
        System.out.println("----------------------------");
        // implementation using constructor reference
            //classname::new
            provider prov1=Student::new;
            Student student2=prov1.getStudent();
            student2.display();
    }
}
