package Generics;

class pair<t>{
    t a;
    t b;

    public t getA() {
        return a;
    }

    public void setA(t a) {
        this.a = a;
    }

    public t getB() {
        return b;
    }

    public void setB(t b) {
        this.b = b;
    }
}
class pair2<a,b>{
    a age;
    b name;

    public void setName(b name) {
        this.name = name;
    }

    public b getName() {
        return name;
    }

    public a getAge() {
        return age;
    }

    public void setAge(a age) {
        this.age = age;
    }
}
public class genericsMAIN {
    public static void main(String[] args) {
        pair<Integer> pi=new pair<>();
            pi.setA(26);    pi.setB(25);
            System.out.print(pi.getA()+" ");
            System.out.println(pi.getB());
        pair2<Integer,String> pg= new pair2<>();
            pg.setAge(25);  pg.setName("Shashwat");
            System.out.print(pg.getAge()+" ");
            System.out.println(pg.getName());
    }
}
