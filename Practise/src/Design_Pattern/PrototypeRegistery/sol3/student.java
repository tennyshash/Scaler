package Design_Pattern.PrototypeRegistery.sol3;

public class student {
    private String name;
    private int age=28;
    private  String gender;
    private String batch;
    public student(String batch){this.batch=batch;}
    public student(student other){
        this.age=other.age;
        this.gender=other.gender;
        this.name=other.name;
        this.batch=other.batch;
    }
    public student copy(){
//        student duplicate= new student();
//        duplicate.age=this.age;
//        duplicate.gender=this.gender;
//        duplicate.name=this.name;
//        return  duplicate;
        return new student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBatch() {
        return batch;
    }
}
