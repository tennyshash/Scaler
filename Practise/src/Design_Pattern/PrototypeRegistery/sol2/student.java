package Design_Pattern.PrototypeRegistery.sol2;

public class student {
    private String name;
    private int age;
    private  String gender;
    public student(student other){
        this.age=other.age;
        this.gender=other.gender;
        this.name=other.name;
    }
}
