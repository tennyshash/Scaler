package Design_Pattern.SOLID;

public class crow extends bird implements flyingBird,flyingBehaviour{

    @Override
    public void walk() {
        System.out.println("Crow is walking on its 2 legs");
    }

    @Override
    public void makeFly() {
        flyingBehaviour fb;
        fb= new fastFlying();
        System.out.print("Crow ");
        fb.makeFly();
    }

    @Override
    public void fly() {
        makeFly();
    }
}
