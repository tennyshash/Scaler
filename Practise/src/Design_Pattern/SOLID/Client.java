package Design_Pattern.SOLID;

public class Client {
    public static void main(String[] args) {
        crow cr= new crow();
        cr.fly();
        cr.walk();
        parrot p= new parrot();
        p.fly();
        p.walk();
    }
}
