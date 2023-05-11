package javaPractise.temp2;


public class shashwat extends newStudent {
    private int age;
    shashwat(){};
    shashwat ( int age){
            this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println(age);
        System.out.println(getSchool());
    }
}
